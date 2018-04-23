package com.gundi.decorator.example;

import com.gundi.decorator.example.services.MyComplexEJB;
import com.gundi.decorator.example.services.MySimpleEJB;

import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;

/**
 * A simple managed bean that is used to invoke the GreeterEJB and store the
 * response. The response is obtained by invoking getMessage().
 *
 * Created by pai on 14.02.18.
 */

@Named("invoker")
@SessionScoped
public class Invoker implements Serializable {

    @EJB
    private MyComplexEJB myComplexEJB;

    @EJB
    private MySimpleEJB mySimpleEJB;

    private String message;

    public void invokeSimpleService() {
            message = mySimpleEJB.invokeSimpleService();
    }

    public void invokeComplexService() {
            message = myComplexEJB.invokeComplexService();
    }


    public String getMessage() {

        return message;
    }




}
