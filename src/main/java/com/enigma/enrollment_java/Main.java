package com.enigma.enrollment_java;

import com.enigma.enrollment_java.entity.Course;
import com.enigma.enrollment_java.repository.CourseRepository;
import com.enigma.enrollment_java.repository.impl.CourseRepositoryImpl;
import com.enigma.enrollment_java.util.JpaUtil;
import jakarta.persistence.EntityManager;

public class Main {
    public static void main(String[] args) {
        EntityManager entityManager = JpaUtil.getEntityManager();

        CourseRepository courseRepository = new CourseRepositoryImpl(entityManager);

//        courseRepository.delete(5);
        courseRepository.update(4,"Kalkulus II");
    }
}
