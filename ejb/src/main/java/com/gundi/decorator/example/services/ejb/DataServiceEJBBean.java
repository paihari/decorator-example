package com.gundi.decorator.example.services.ejb;


import com.gundi.decorator.example.services.DataServiceEJB;
import com.gundi.decorator.example.services.impl.DataServiceEJBBeanImpl;

import javax.annotation.security.PermitAll;
import javax.ejb.*;

/**
 * Created by pai on 16.02.18.
 */
@Stateless(mappedName = "test.DataServiceEJB", name="test.DataServiceEJB")
@TransactionAttribute(TransactionAttributeType.REQUIRED)
@Remote(DataServiceEJB.class)
@PermitAll
public class DataServiceEJBBean extends DataServiceEJBBeanImpl{

}
