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
    public void update(Integer id, String newName) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        Course course = entityManager.find(Course.class, id);
        Course newCourse = new Course(id, newName, course.getCredit());
        entityManager.merge(newCourse);
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
