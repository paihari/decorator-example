package com.gundi.decorator.example.services.entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

/**
 * Created by pai on 16.02.18.
 */

public class Main {

    private static final String PERSISTENCE_UNIT_NAME = "works";
    private static EntityManagerFactory factory;

    public static void main(String[] args) {

        factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager em = factory.createEntityManager();
        // read the existing entries and write to console
        Query q = em.createQuery("select w from Todo w");
        List<Todo> todoList = q.getResultList();
        for (Todo work : todoList) {
            System.out.println(work);
        }
        System.out.println("Size: " + todoList.size());

        // create new Todo
        em.getTransaction().begin();
        Todo work = new Todo();
        work.setSummary("This is a test");
        work.setDescription("This is a test");
        em.persist(work);
        em.getTransaction().commit();

        em.close();
    }
}
