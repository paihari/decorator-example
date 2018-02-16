package com.gundi.decorator.example.services.impl;

import com.gundi.decorator.example.services.ChildEJB;

/**
 * Created by pai on 13.02.18.
 */
public class ChildEJBBeanImpl implements ChildEJB {

    public String invokeChildService() {
        String message = "Child EJB Service: Invoked: ";
        System.out.println(message);
        return message;

    }
}
