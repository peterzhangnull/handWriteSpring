package com.peterzhang.step01.springframework;

/**
 * @author zhangye
 * @description
 * @date 2021/5/19 16:49
 */
public class BeanDefinition {

    private Object bean;

    public BeanDefinition(Object bean) {
        this.bean = bean;
    }

    public Object getBean() {
        return bean;
    }
}
