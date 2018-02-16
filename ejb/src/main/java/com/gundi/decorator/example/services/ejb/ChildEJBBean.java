package com.gundi.decorator.example.services.ejb;

import com.gundi.decorator.example.services.ChildEJB;
import com.gundi.decorator.example.services.impl.ChildEJBBeanImpl;

import javax.annotation.security.PermitAll;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

/**
 * Created by pai on 13.02.18.
 */

@Stateless(mappedName = "test.ChildEJB", name="test.ChildEJB")
@TransactionAttribute(TransactionAttributeType.REQUIRED)
@Remote(ChildEJB.class)
@PermitAll
public class ChildEJBBean extends ChildEJBBeanImpl{
}
