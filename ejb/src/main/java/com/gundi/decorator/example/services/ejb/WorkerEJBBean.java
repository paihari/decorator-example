package com.gundi.decorator.example.services.ejb;

import com.gundi.decorator.example.services.MyComplexEJB;
import com.gundi.decorator.example.services.WorkerEJB;
import com.gundi.decorator.example.services.impl.WorkerEJBBeanImpl;

import javax.annotation.security.PermitAll;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

/**
 * Created by pai on 13.02.18.
 */
@Stateless(name="test.WorkerEJB", mappedName = "test.WorkerEJB")
@TransactionAttribute(TransactionAttributeType.REQUIRED)
@Remote(WorkerEJB.class)
@PermitAll
public class WorkerEJBBean extends WorkerEJBBeanImpl{

}
