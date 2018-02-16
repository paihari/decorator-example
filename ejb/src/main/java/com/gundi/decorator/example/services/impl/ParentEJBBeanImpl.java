package com.gundi.decorator.example.services.impl;

import com.gundi.decorator.example.services.ChildEJB;
import com.gundi.decorator.example.services.ParentEJB;


import javax.ejb.EJB;

/**
 * Created by pai on 13.02.18.
 */
public class ParentEJBBeanImpl implements ParentEJB{

    @EJB(name = "test.ChildEJB")
    ChildEJB childEJB;

    public String invokeParentService() {
        String message = "Parent EJB Service: Invoked: ";
        System.out.println(message);
        return message + childEJB.invokeChildService();
    }
}
