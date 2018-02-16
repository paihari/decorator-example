package com.gundi.decorator.example.services.impl;

import com.gundi.decorator.example.services.MasterEJB;
import com.gundi.decorator.example.services.WorkerEJB;

import javax.ejb.EJB;

/**
 * Created by pai on 13.02.18.
 */
public class MasterEJBBeanImpl implements MasterEJB{

    @EJB(name = "test.WorkerEJB")
    WorkerEJB workerEJB;

    public String invokeMasterService() {
        String message = "Master EJB Service: Invoked: ";
        System.out.println(message);
        return message + workerEJB.invokeWorkerService();

    }
}
