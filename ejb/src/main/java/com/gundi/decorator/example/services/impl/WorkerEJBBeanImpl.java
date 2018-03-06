package com.gundi.decorator.example.services.impl;

import com.gundi.decorator.example.services.DataServiceEJB;
import com.gundi.decorator.example.services.WorkerEJB;
import com.gundi.decorator.example.services.entity.Todo;

import javax.ejb.EJB;

/**
 * Created by pai on 13.02.18.
 */
public class WorkerEJBBeanImpl implements WorkerEJB{

    @EJB(mappedName =  "test.DataServiceEJB")
    DataServiceEJB dataServiceEJB;

    public String invokeWorkerService() {
        String message = "Worker EJB Service: Invoked: ";
        System.out.println(message);
        Todo todo = dataServiceEJB.createTodo("Worker-Summary", "Worker-Description");
        System.out.println(" The Todo " + todo);
        return message;
    }
}
