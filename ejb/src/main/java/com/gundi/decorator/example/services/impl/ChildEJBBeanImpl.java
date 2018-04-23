package com.gundi.decorator.example.services.impl;

import com.gundi.decorator.example.services.ChildEJB;
import com.gundi.decorator.example.services.DataServiceEJB;
import com.gundi.decorator.example.services.entity.ToDoType;
import com.gundi.decorator.example.services.entity.Todo;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.ejb.EJB;

/**
 * Created by pai on 13.02.18.
 */
public class ChildEJBBeanImpl implements ChildEJB {

    private Logger logger = LogManager.getLogger(this.getClass());

    @EJB(mappedName =  "test.DataServiceEJB")
    DataServiceEJB dataServiceEJB;


    public String invokeChildService() {
        String message = "Child EJB Service: Invoked: ";
        logger.info(message);
        Todo todo = dataServiceEJB.createTodo(
                "Child-Summary",
                "Child-Description",
                ToDoType.CHILD);

        logger.info(todo);

        return message;

    }
}
