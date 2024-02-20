package com.enigma.enrollment_java.repository;

import com.enigma.enrollment_java.dto.request.EnrollRequest;
import com.enigma.enrollment_java.dto.response.EnrollDetailResponse;
import com.enigma.enrollment_java.entity.Enroll;
import com.enigma.enrollment_java.entity.EnrollDetail;

import java.util.List;

public interface EnrollRepository {
    void save(EnrollRequest enrollRequest);
    void update(EnrollDetail enrollDetail);
    List<EnrollDetailResponse> getAll();
    void delete(EnrollDetail enrollDetail);
}
