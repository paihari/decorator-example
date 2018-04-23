package com.gundi.decorator.example.services.impl;

import com.gundi.decorator.example.services.MySimpleEJB;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by pai on 13.02.18.
 */
public class MySimpleEJBBeanImpl implements MySimpleEJB{


    private Logger logger = LogManager.getLogger(this.getClass());

    public String invokeSimpleService() {
        String message = "Simple EJB Service: Invoked: ";
        logger.info(message);
        return message;
    }
}
