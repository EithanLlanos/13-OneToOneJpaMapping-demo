package com.springCourse.hibernateAdvancedMappings.dao;

import com.springCourse.hibernateAdvancedMappings.entity.Instructor;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

public class AppDAOImpl implements AppDAO {
    private final EntityManager entityManager;

    public AppDAOImpl(EntityManager theEntityManager) {
        entityManager = theEntityManager;
    }

    @Override
    @Transactional
    public void save(Instructor theInstructor) {
        entityManager.persist(theInstructor);
    }
}
