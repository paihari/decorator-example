package com.gundi.decorator.example.services.ejb;

import com.gundi.decorator.example.services.MasterEJB;
import com.gundi.decorator.example.services.impl.MasterEJBBeanImpl;

import javax.annotation.security.PermitAll;
import javax.ejb.Remote;
import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;

/**
 * Created by pai on 13.02.18.
 */
@Stateless(mappedName = "test.MasterEJB", name="test.MasterEJB")
@TransactionAttribute(TransactionAttributeType.REQUIRED)
@Remote(MasterEJB.class)
@PermitAll

public class MasterEJBBean extends MasterEJBBeanImpl{

}
