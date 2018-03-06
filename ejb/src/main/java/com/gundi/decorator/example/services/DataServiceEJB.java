package com.gundi.decorator.example.services;

import com.gundi.decorator.example.services.entity.Todo;

import javax.ejb.Local;

/**
 * Created by pai on 16.02.18.
 */
@Local
public interface DataServiceEJB {

    public Todo createTodo(String summary, String description);

}
