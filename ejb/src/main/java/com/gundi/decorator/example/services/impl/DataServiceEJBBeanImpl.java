package com.gundi.decorator.example.services.impl;

import com.gundi.decorator.example.services.DataServiceEJB;
import com.gundi.decorator.example.services.entity.ToDoType;
import com.gundi.decorator.example.services.entity.Todo;
import com.gundi.decorator.example.services.entity.dao.TodoDao;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

/**
 * Created by pai on 16.02.18.
 */
public class DataServiceEJBBeanImpl implements DataServiceEJB {

    @PersistenceContext(unitName="works")
    private EntityManager entityManager;

    private Logger logger = LogManager.getLogger(this.getClass());

    public DataServiceEJBBeanImpl() {
        super();
    }

    @Override
    public Todo createTodo(String summary, String description, ToDoType toDoType) {
        try {
            Todo todo = new Todo(summary, description, toDoType);
            TodoDao dao = getTodoDao();

            return dao.create(todo);
        }catch (Exception e) {
            e.printStackTrace();
            logger.error("Error creating entity ", e);
            throw new IllegalStateException("com.gundi.decorator.example.services.impl.DataServiceEJBBeanImpl.createTodo");
        }

    }

    @Override
    public List<Todo> findAllTodo() {
        TodoDao dao = getTodoDao();
        return dao.findAll();
    }


    protected TodoDao getTodoDao() {

        return  TodoDao.Factory.getDao(getEntityManager(), true);
    }

    public EntityManager getEntityManager() {

        return entityManager;
    }
}
