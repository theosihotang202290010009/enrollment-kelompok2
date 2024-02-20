package com.enigma.enrollment_java;

import com.enigma.enrollment_java.entity.Period;
import com.enigma.enrollment_java.entity.Student;
import com.enigma.enrollment_java.repository.PeriodRepository;
import com.enigma.enrollment_java.repository.StudentRepository;
import com.enigma.enrollment_java.repository.impl.PeriodRepositoryImpl;
import com.enigma.enrollment_java.repository.impl.StudentRepositoryImpl;
import com.enigma.enrollment_java.util.JpaUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class Main {
    public static void main(String[] args) {
        EntityManager entityManager = JpaUtil.getEntityManager();
        StudentRepository studentRepository = new StudentRepositoryImpl(entityManager);
        PeriodRepository periodRepository = new PeriodRepositoryImpl(entityManager);

        EntityTransaction transaction = entityManager.getTransaction();

        Period period = new Period("2021-Ganjil");
        periodRepository.save(period);
//        Student student = new Student("Ilham Fitri", "Teknnik komputer jaringan");
//        studentRepository.save(student);
        entityManager.close();
        JpaUtil.shutdown();
    }
}
