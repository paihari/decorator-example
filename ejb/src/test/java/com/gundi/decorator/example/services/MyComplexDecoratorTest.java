package com.gundi.decorator.example.services;

import com.gundi.decorator.example.services.entity.Todo;
import com.gundi.decorator.test.annotations.TestRuntimeConfig;
import com.gundi.decorator.test.base.ResourceDecoratorTestBase;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

import javax.ejb.EJB;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

/**
 * Created by pai on 13.02.18.
 */

@TestRuntimeConfig(name="test_complex_decorator", testOnContainer=false)
public class MyComplexDecoratorTest extends ResourceDecoratorTestBase {

    @EJB(mappedName =  "test.MyComplexEJB")
    MyComplexEJB myComplexEJB;

    @EJB(mappedName =  "test.DataServiceEJB")
    DataServiceEJB dataServiceEJB;

    private Logger logger = LogManager.getLogger(this.getClass());

    @Test
    public void testComplexService() throws Exception {
        String expectedResult = "Complex EJB Service: Invoked: Master EJB Service: Invoked: Worker EJB Service: Invoked: Parent EJB Service: Invoked: Child EJB Service: Invoked: ";
        Assert.assertEquals("Expected message invoked", expectedResult, myComplexEJB.invokeComplexService());

        dataServiceEJB.findAllTodo().forEach(todo -> logger.info(todo));

//        Query q = entityManager.createQuery("select t from Todo t");
//        List<Todo> todoList = q.getResultList();
//        for (Todo todo : todoList) {
//            logger.info(todo);
//
//        }
//        Assert.assertEquals("Number of Todo Items created are 4", 4, todoList.size());
    }

}
