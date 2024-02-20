package com.enigma.enrollment_java.repository.impl;

import com.enigma.enrollment_java.entity.Student;
import com.enigma.enrollment_java.repository.StudentRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class StudentRepositoryImpl implements StudentRepository {
    private final EntityManager entityManager;

    public StudentRepositoryImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public void save(Student student) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(student);
        transaction.commit();
    }
}
