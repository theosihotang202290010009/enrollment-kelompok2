package com.enigma.enrollment_java.repository.impl;

import com.enigma.enrollment_java.entity.Period;
import com.enigma.enrollment_java.repository.PeriodRepository;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

public class PeriodRepositoryImpl implements PeriodRepository {
    private final EntityManager entityManager;

    public PeriodRepositoryImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public void save(Period period) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(period);
        transaction.commit();
    }
}
