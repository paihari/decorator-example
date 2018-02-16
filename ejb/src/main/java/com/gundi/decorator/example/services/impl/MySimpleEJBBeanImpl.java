package com.gundi.decorator.example.services.impl;

import com.gundi.decorator.example.services.MySimpleEJB;

/**
 * Created by pai on 13.02.18.
 */
public class MySimpleEJBBeanImpl implements MySimpleEJB{

    public String invokeSimpleService() {
        String message = "Simple EJB Service: Invoked: ";
        System.out.println(message);
        return message;
    }
}
