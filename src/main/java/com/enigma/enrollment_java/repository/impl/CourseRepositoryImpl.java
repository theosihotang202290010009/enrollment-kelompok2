package com.enigma.enrollment_java.repository.impl;

import com.enigma.enrollment_java.entity.Course;
import com.enigma.enrollment_java.repository.CourseRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class CourseRepositoryImpl implements CourseRepository {
    private final EntityManager entityManager;

    public CourseRepositoryImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public void save(Course course) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(course);
        transaction.commit();
    }

    @Override
    public void update(Course course) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.merge(course);
        transaction.commit();
    }

    @Override
    public void delete(Integer id) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        Course currentCourse = entityManager.find(Course.class, id);
        entityManager.remove(currentCourse);
        transaction.commit();
    }
}
