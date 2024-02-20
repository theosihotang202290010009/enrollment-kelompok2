package com.enigma.enrollment_java.repository;

import com.enigma.enrollment_java.dto.request.EnrollRequest;
import com.enigma.enrollment_java.entity.Enroll;

import java.util.List;

public interface EnrollRepository {
    void save(EnrollRequest enrollRequest);
    List<Enroll> getAll();
}
