package com.gundi.decorator.example.services.entity.dao.impl;

import com.gundi.common.entity.dao.impl.ActionDaoBaseImpl;
import com.gundi.decorator.example.services.entity.Todo;
import com.gundi.decorator.example.services.entity.dao.TodoDao;

import javax.persistence.EntityManager;

/**
 * Created by pai on 25.02.18.
 */
public class TodoDaoImpl extends ActionDaoBaseImpl<Todo> implements TodoDao {

    public TodoDaoImpl(EntityManager entityManager) {

        super(entityManager, Todo.class, true);
    }

    public TodoDaoImpl(EntityManager entityManager, boolean autoFlush) {

        super(entityManager, Todo.class, autoFlush);
    }


}
