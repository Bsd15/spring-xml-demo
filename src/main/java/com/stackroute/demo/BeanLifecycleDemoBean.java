package com.stackroute.demo;

import org.springframework.beans.factory.InitializingBean;

public class BeanLifecycleDemoBean implements InitializingBean {

    /**
     * Method to be called after Initializing bean
     */
    public void customInit() {
        System.out.println("Initializing bean");
    }

    /**
     * Method to be called after Destroying bean
     */
    public void customDestroy() {
        System.out.println("Destroyed Bean");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("aferPropertiesSet(): All properties are set.");
    }
}
