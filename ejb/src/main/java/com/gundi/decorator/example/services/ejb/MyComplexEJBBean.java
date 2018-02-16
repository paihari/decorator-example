package com.gundi.decorator.example.services.ejb;

import com.gundi.decorator.example.services.MyComplexEJB;
import com.gundi.decorator.example.services.impl.MyComplexEJBBeanImpl;

import javax.annotation.security.PermitAll;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

/**
 * Created by pai on 13.02.18.
 */
@Stateless(mappedName = "test.MyComplexEJB", name="test.MyComplexEJB")
@TransactionAttribute(TransactionAttributeType.REQUIRED)
@Remote(MyComplexEJB.class)
@PermitAll

public class MyComplexEJBBean extends MyComplexEJBBeanImpl{

}
