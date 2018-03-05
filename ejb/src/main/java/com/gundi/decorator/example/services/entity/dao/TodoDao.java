package com.gundi.decorator.example.services.entity.dao;

import com.gundi.common.entity.dao.ActionDao;
import com.gundi.decorator.example.services.entity.Todo;
import com.gundi.decorator.example.services.entity.dao.impl.TodoDaoImpl;

import javax.persistence.EntityManager;

/**
 * Created by pai on 16.02.18.
 */
public interface TodoDao extends ActionDao<Todo> {

    public static class Factory {
        public static TodoDao getDao(EntityManager entityManager) {
            return new TodoDaoImpl(entityManager);
        }

        public static TodoDao getDao(EntityManager entityManager, boolean autoFlush) {
            return new TodoDaoImpl(entityManager, autoFlush);
        }
    }
}
