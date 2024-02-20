package com.enigma.enrollment_java.repository.impl;

import com.enigma.enrollment_java.dto.request.EnrollDetailRequest;
import com.enigma.enrollment_java.dto.request.EnrollRequest;
import com.enigma.enrollment_java.entity.*;
import com.enigma.enrollment_java.repository.EnrollRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Query;

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
            enrollDetail.setEnrollId(enroll);
            enrollDetail.setCourseId(entityManager.find(Course.class, enrollDetailRequest.getCourseId()));
            enrollDetail.setPeriodId(entityManager.find(Period.class, enrollDetailRequest.getCourseId()));

            enrollDetails.add(enrollDetail);
        }
        enroll.setEnrollDetails(enrollDetails);
        entityManager.persist(enroll);

        transaction.commit();
        entityManager.close();
    }

    @Override
    public List getAll() {
        String hql = "FROM Enroll";
        Query query = entityManager.createQuery(hql);
        return query.getResultList();
    }
}
