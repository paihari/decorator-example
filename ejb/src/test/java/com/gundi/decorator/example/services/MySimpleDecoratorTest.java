package com.gundi.decorator.example.services;

import com.gundi.decorator.test.annotations.TestRuntimeConfig;
import com.gundi.decorator.test.base.ResourceDecoratorTestBase;
import org.junit.Assert;
import org.junit.Test;

import javax.ejb.EJB;

/**
 * Created by pai on 13.02.18.
 */
@TestRuntimeConfig(name="test_simple_decorator", testOnContainer=true)
public class MySimpleDecoratorTest extends ResourceDecoratorTestBase{

    @EJB(mappedName = "test.MySimpleEJB")
    MySimpleEJB mySimpleEJB;

    @Test
    public void testSimpleService() throws Exception {
        String expectedResult = "Simple EJB Service: Invoked: ";
        Assert.assertEquals("Expected message invoked", expectedResult, mySimpleEJB.invokeSimpleService());
    }
}
