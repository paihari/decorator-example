package com.gundi.decorator.example.services.impl;

import com.gundi.decorator.example.services.ChildEJB;
import com.gundi.decorator.example.services.DataServiceEJB;
import com.gundi.decorator.example.services.ParentEJB;
import com.gundi.decorator.example.services.entity.ToDoType;
import com.gundi.decorator.example.services.entity.Todo;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import javax.ejb.EJB;

/**
 * Created by pai on 13.02.18.
 */
public class ParentEJBBeanImpl implements ParentEJB{

    @EJB(mappedName =  "test.DataServiceEJB")
    DataServiceEJB dataServiceEJB;

    @EJB(name = "test.ChildEJB")
    ChildEJB childEJB;

    private Logger logger = LogManager.getLogger(this.getClass());

    public String invokeParentService() {
        String message = "Parent EJB Service: Invoked: ";
        logger.info(message);

        // Create To Do Item for Parent
        Todo todo = dataServiceEJB.createTodo(
                "Parent-Summary",
                "Parent-Description",
                ToDoType.PARENT);
        logger.info(todo);
        return message + childEJB.invokeChildService();
    }
}
