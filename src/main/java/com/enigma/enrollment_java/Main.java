package com.enigma.enrollment_java;

import com.enigma.enrollment_java.dto.request.EnrollRequest;
import com.enigma.enrollment_java.entity.Enroll;
import com.enigma.enrollment_java.entity.Student;
import com.enigma.enrollment_java.repository.EnrollRepository;
import com.enigma.enrollment_java.repository.StudentRepository;
import com.enigma.enrollment_java.repository.impl.EnrollRepositoryImpl;
import com.enigma.enrollment_java.repository.impl.StudentRepositoryImpl;
import jakarta.persistence.EntityManager;
import com.enigma.enrollment_java.util.JpaUtil;
import jakarta.persistence.EntityTransaction;

public class Main {
    public static void main(String[] args) {
        EntityManager entityManager = JpaUtil.getEntityManager();
        EntityTransaction transaction = entityManager.getTransaction();

        addEnroll(entityManager);

        entityManager.close();
        JpaUtil.shutdown();
    }

    private static void addEnroll(EntityManager entityManager) {
        EnrollRepository repository = new EnrollRepositoryImpl(entityManager);
        EnrollRequest request = new EnrollRequest("Ucogg", "Sastra Mesin");
        repository.save(request);
    }
}
