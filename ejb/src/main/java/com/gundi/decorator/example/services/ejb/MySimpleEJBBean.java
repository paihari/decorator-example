package com.gundi.decorator.example.services.ejb;

import com.gundi.decorator.example.services.MySimpleEJB;
import com.gundi.decorator.example.services.impl.MySimpleEJBBeanImpl;

import javax.annotation.security.PermitAll;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

/**
 * Created by pai on 13.02.18.
 */
@Stateless(mappedName = "test.MySimpleEJB", name="test.MySimpleEJB")
@TransactionAttribute(TransactionAttributeType.REQUIRED)
@Remote(MySimpleEJB.class)
@PermitAll
public class MySimpleEJBBean extends MySimpleEJBBeanImpl {

}
