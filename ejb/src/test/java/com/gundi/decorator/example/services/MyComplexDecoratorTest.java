package com.gundi.decorator.example.services;

import com.gundi.decorator.test.annotations.TestRuntimeConfig;
import com.gundi.decorator.test.base.ResourceDecoratorTestBase;
import org.junit.Assert;
import org.junit.Test;

import javax.ejb.EJB;

/**
 * Created by pai on 13.02.18.
 */
@TestRuntimeConfig(name="test_complex_decorator", testOnContainer=false)
public class MyComplexDecoratorTest extends ResourceDecoratorTestBase {

    @EJB(mappedName =  "test.MyComplexEJB")
    MyComplexEJB myComplexEJB;

    @Test
    public void testComplexService() throws Exception {
        String expectedResult = "Complex EJB Service: Invoked: Master EJB Service: Invoked: Worker EJB Service: Invoked: Parent EJB Service: Invoked: Child EJB Service: Invoked: ";
        Assert.assertEquals("Expected message invoked", expectedResult, myComplexEJB.invokeComplexService());

    }

}
