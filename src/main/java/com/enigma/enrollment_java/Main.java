package com.enigma.enrollment_java;

import com.enigma.enrollment_java.dto.request.EnrollDetailRequest;
import com.enigma.enrollment_java.dto.request.EnrollRequest;
import com.enigma.enrollment_java.entity.Course;
import com.enigma.enrollment_java.entity.Enroll;
import com.enigma.enrollment_java.entity.Period;
import com.enigma.enrollment_java.repository.CourseRepository;
import com.enigma.enrollment_java.repository.EnrollRepository;
import com.enigma.enrollment_java.repository.PeriodRepository;
import com.enigma.enrollment_java.repository.StudentRepository;
import com.enigma.enrollment_java.repository.impl.CourseRepositoryImpl;
import com.enigma.enrollment_java.repository.impl.EnrollRepositoryImpl;
import com.enigma.enrollment_java.repository.impl.PeriodRepositoryImpl;
import com.enigma.enrollment_java.repository.impl.StudentRepositoryImpl;
import com.enigma.enrollment_java.util.JpaUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        EntityManager entityManager = JpaUtil.getEntityManager();
        EnrollRepository enrollRepository = new EnrollRepositoryImpl(entityManager);
        Course course = entityManager.find(Course.class, 1);
        Period period =entityManager.find(Period.class, 1);

        Course course1 = entityManager.find(Course.class, 3);
        Period period1 =entityManager.find(Period.class, 1);

        Course course2 = entityManager.find(Course.class, 3);
        Period period2 =entityManager.find(Period.class, 3);

        Course course3 = entityManager.find(Course.class, 2);
        Period period3 =entityManager.find(Period.class, 2);

        Course course4 = entityManager.find(Course.class, 4);
        Period period4 =entityManager.find(Period.class, 2);


        EnrollRequest enrollRequest =new EnrollRequest("Ucogg","Sastra Mesin");
        enrollRequest.setEnrollDetailRequests(
                List.of(
                        new EnrollDetailRequest(1,1),
                        new EnrollDetailRequest(3,1),
                        new EnrollDetailRequest(3,3),
                        new EnrollDetailRequest(2,2),
                        new EnrollDetailRequest(4,2)
                )
        );

        enrollRepository.save(enrollRequest);
        entityManager.close();
        JpaUtil.shutdown();
    }

    private static void addStudent(EntityManager entityManager) {
        StudentRepository studentRepository = new StudentRepositoryImpl(entityManager);
        PeriodRepository periodRepository = new PeriodRepositoryImpl(entityManager);

        EntityTransaction transaction = entityManager.getTransaction();

        Period period = new Period("2021-Ganjil");
        periodRepository.save(period);
//        Student student = new Student("Ilham Fitri", "Teknnik komputer jaringan");
//        studentRepository.save(student);
    }
}

//    EntityTransaction transaction = entityManager.getTransaction();
//
//    addEnroll(entityManager);
//
//        entityManager.close();
//        JpaUtil.shutdown();
//}


//    private static void addEnroll(EntityManager entityManager) {
//        EnrollRepository repository = new EnrollRepositoryImpl(entityManager);
//        EnrollRequest request = new EnrollRequest("Ucogg", "Sastra Mesin");
//        repository.save(request);
//    }
