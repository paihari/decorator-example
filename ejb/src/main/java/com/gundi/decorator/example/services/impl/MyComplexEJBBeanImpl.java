package com.gundi.decorator.example.services.impl;

import com.gundi.decorator.example.services.MasterEJB;
import com.gundi.decorator.example.services.MyComplexEJB;
import com.gundi.decorator.example.services.ParentEJB;
import com.gundi.decorator.example.services.entity.Todo;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.ejb.EJB;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

/**
 * Created by pai on 13.02.18.
 */
public class MyComplexEJBBeanImpl implements MyComplexEJB{

    @EJB(mappedName = "test.MasterEJB")
    MasterEJB masterEJB;

    @EJB(mappedName = "test.ParentEJB")
    ParentEJB parentEJB;

    private Logger logger = LogManager.getLogger(this.getClass());

    public String invokeComplexService() {
        String message = "Complex EJB Service: Invoked: ";
        logger.info(message);
        message = message + masterEJB.invokeMasterService() +
                parentEJB.invokeParentService();
        return message;

    }
}
