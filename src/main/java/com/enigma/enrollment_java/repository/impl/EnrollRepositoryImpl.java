package com.enigma.enrollment_java.repository.impl;

import com.enigma.enrollment_java.dto.request.EnrollDetailRequest;
import com.enigma.enrollment_java.dto.request.EnrollRequest;
import com.enigma.enrollment_java.entity.Enroll;
import com.enigma.enrollment_java.entity.EnrollDetail;
import com.enigma.enrollment_java.entity.Student;
import com.enigma.enrollment_java.repository.EnrollRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

import java.util.ArrayList;
import java.util.List;

public class EnrollRepositoryImpl implements EnrollRepository {
    private final EntityManager entityManager;

    public EnrollRepositoryImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public void save(EnrollRequest enrollRequest) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        Enroll enroll = new Enroll();
        enroll.setStudentId(new Student(enrollRequest.getName(), enrollRequest.getMajor()));

        List<EnrollDetail> enrollDetails = new ArrayList<>();

        for (EnrollDetailRequest enrollDetailRequest : enrollRequest.getEnrollDetailRequests()) {
            EnrollDetail enrollDetail = new EnrollDetail();
            enrollDetail.setEnrollId(enrollDetailRequest.getEnrollId());
            enrollDetail.setCourseId(enrollDetailRequest.getCourseId());
            enrollDetail.setPeriodId(enrollDetailRequest.getPeriod());
            enrollDetails.add(enrollDetail);
        }
        enroll.setEnrollDetails(enrollDetails);
        entityManager.persist(enroll);

        transaction.commit();
        entityManager.close();
    }
}
