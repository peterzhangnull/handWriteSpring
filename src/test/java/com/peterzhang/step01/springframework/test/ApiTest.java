package com.peterzhang.step01.springframework.test;

import com.peterzhang.step01.springframework.BeanDefinition;
import com.peterzhang.step01.springframework.BeanFactory;
import com.peterzhang.step01.springframework.test.bean.HelloService;
import org.junit.Test;

/**
 * @author zhangye
 * @description
 * @date 2021/5/19 16:56
 */
public class ApiTest {


    @Test
    public void testBeanFactory() {
        //1.创建beanFactory
        BeanFactory beanFactory = new BeanFactory();
        //2. 注册bean
        BeanDefinition beanDefinition = new BeanDefinition(new HelloService());
        beanFactory.registerBeanDefinition("helloService", beanDefinition);
        //3.获取使用bean
        HelloService helloService = (HelloService) beanFactory.getBean("helloService");
        helloService.sayHello();
    }
}
