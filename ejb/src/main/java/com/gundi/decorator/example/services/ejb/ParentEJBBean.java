package com.gundi.decorator.example.services.ejb;

import com.gundi.decorator.example.services.MyComplexEJB;
import com.gundi.decorator.example.services.ParentEJB;
import com.gundi.decorator.example.services.impl.ParentEJBBeanImpl;

import javax.annotation.security.PermitAll;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

/**
 * Created by pai on 13.02.18.
 */

@Stateless(mappedName = "test.ParentEJB", name="test.ParentEJB")
@TransactionAttribute(TransactionAttributeType.REQUIRED)
@Remote(ParentEJB.class)
@PermitAll
public class ParentEJBBean extends ParentEJBBeanImpl{
}
