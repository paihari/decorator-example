package com.gundi.decorator.example.services.impl;

import com.gundi.decorator.example.services.WorkerEJB;

import javax.ejb.EJB;

/**
 * Created by pai on 13.02.18.
 */
public class WorkerEJBBeanImpl implements WorkerEJB{



    public String invokeWorkerService() {
        String message = "Worker EJB Service: Invoked: ";
        System.out.println(message);
        return message;
    }
}
