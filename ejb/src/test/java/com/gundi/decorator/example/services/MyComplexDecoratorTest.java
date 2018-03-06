package com.gundi.decorator.example.services;

import com.gundi.decorator.example.services.entity.Todo;
import com.gundi.decorator.test.annotations.TestRuntimeConfig;
import com.gundi.decorator.test.base.ResourceDecoratorTestBase;
import org.junit.Assert;
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

//    @EJB(mappedName =  "test.DataServiceEJB")
//    DataServiceEJB dataServiceEJB;


    @Test
    public void testComplexService() throws Exception {
        String expectedResult = "Complex EJB Service: Invoked: Master EJB Service: Invoked: Worker EJB Service: Invoked: Parent EJB Service: Invoked: Child EJB Service: Invoked: ";
        Assert.assertEquals("Expected message invoked", expectedResult, myComplexEJB.invokeComplexService());

//        Todo todo = dataServiceEJB.createTodo("Trial", "desc");
//        System.out.println("todo: " + todo);


//        Query q = entityManager.createQuery("select w from Todo w");
//        List<Todo> todoList = q.getResultList();
//        for (Todo todo1 : todoList) {
//            System.out.println(todo1);
//        }
//        System.out.println("Size: " + todoList.size());


    }

}
