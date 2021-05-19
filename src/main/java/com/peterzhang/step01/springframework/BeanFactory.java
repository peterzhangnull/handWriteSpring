package com.peterzhang.step01.springframework;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author zhangye
 * @description
 * @date 2021/5/19 16:50
 */
public class BeanFactory {

    private Map<String, BeanDefinition> beanDefinitionMap = new ConcurrentHashMap<>();

    public Object getBean(String name) {
        return beanDefinitionMap.get(name).getBean();
    }

    public void registerBeanDefinition(String name, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(name, beanDefinition);
    }
}
