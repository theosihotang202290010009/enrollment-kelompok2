package com.enigma.enrollment_java.util;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class JpaUtil {
    private static final String PERSISTENCE_NAME = "mahasiswa_jpa";
    private static EntityManagerFactory entityManagerFactory;

    private static void getEntityManagerFactory() {
        entityManagerFactory = Persistence.createEntityManagerFactory(PERSISTENCE_NAME);
    }

    public static EntityManager getEntityManager() {
        if (entityManagerFactory == null) {
            getEntityManagerFactory();
        }
        return entityManagerFactory.createEntityManager();
    }

    public static void shutdown() {
        if (entityManagerFactory != null) {
            entityManagerFactory.close();
            entityManagerFactory = null;
        }
    }
}