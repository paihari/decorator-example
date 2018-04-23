package com.gundi.decorator.example.services.impl;

import com.gundi.decorator.example.services.DataServiceEJB;
import com.gundi.decorator.example.services.WorkerEJB;
import com.gundi.decorator.example.services.entity.ToDoType;
import com.gundi.decorator.example.services.entity.Todo;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.ejb.EJB;

/**
 * Created by pai on 13.02.18.
 */
public class WorkerEJBBeanImpl implements WorkerEJB{

    @EJB(mappedName =  "test.DataServiceEJB")
    DataServiceEJB dataServiceEJB;

    private Logger logger = LogManager.getLogger(this.getClass());

    public String invokeWorkerService() {
        String message = "Worker EJB Service: Invoked: ";
        logger.info(message);
        Todo todo = dataServiceEJB.createTodo(
                "Worker-Summary",
                "Worker-Description",
                ToDoType.WORKER);

        logger.info(todo);
        return message;
    }
}
