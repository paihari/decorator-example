
package com.gundi.decorator.example.services.impl;

import com.gundi.decorator.example.services.DataServiceEJB;
import com.gundi.decorator.example.services.MasterEJB;
import com.gundi.decorator.example.services.WorkerEJB;
import com.gundi.decorator.example.services.entity.ToDoType;
import com.gundi.decorator.example.services.entity.Todo;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.ejb.EJB;

/**
 * Created by pai on 13.02.18.
 */
public class MasterEJBBeanImpl implements MasterEJB{

    @EJB(mappedName =  "test.DataServiceEJB")
    DataServiceEJB dataServiceEJB;

    @EJB(name = "test.WorkerEJB")
    WorkerEJB workerEJB;

    private Logger logger = LogManager.getLogger(this.getClass());

    public String invokeMasterService() {
        String message = "Master EJB Service: Invoked: ";
        logger.info(message);
        // Create To Do Item for Master
        Todo todo = dataServiceEJB.createTodo(
                "Master-Summary",
                "Master-Description",
                ToDoType.MASTER);
        logger.info(todo);
        return message + workerEJB.invokeWorkerService();

    }
}
