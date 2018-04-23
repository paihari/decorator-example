package com.gundi.decorator.example.services;

import com.gundi.decorator.example.services.entity.ToDoType;
import com.gundi.decorator.example.services.entity.Todo;

import javax.ejb.Local;
import javax.ejb.Remote;
import java.util.List;

/**
 * Created by pai on 16.02.18.
 */
@Remote
public interface DataServiceEJB {

    public Todo createTodo(String summary, String description, ToDoType toDoType);
    public List<Todo> findAllTodo();

}
