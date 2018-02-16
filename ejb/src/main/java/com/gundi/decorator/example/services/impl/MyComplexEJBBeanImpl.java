package com.gundi.decorator.example.services.impl;

import com.gundi.decorator.example.services.MasterEJB;
import com.gundi.decorator.example.services.MyComplexEJB;
import com.gundi.decorator.example.services.ParentEJB;

import javax.ejb.EJB;

/**
 * Created by pai on 13.02.18.
 */
public class MyComplexEJBBeanImpl implements MyComplexEJB{

    //@EJB(mappedName = "test.MasterEJB")
    @EJB
    MasterEJB masterEJB;

    //@EJB(mappedName = "test.ParentEJB")
    @EJB
    ParentEJB parentEJB;

    public String invokeComplexService() {
        String message = "Complex EJB Service: Invoked: ";
        System.out.println(message);
        return message + masterEJB.invokeMasterService() +
                parentEJB.invokeParentService();
    }
}
