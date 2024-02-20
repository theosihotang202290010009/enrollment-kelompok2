package com.enigma.enrollment_java.repository;

import com.enigma.enrollment_java.dto.request.EnrollRequest;

import java.util.List;

public interface EnrollDetailInfoRepository {
    void save(EnrollRequest request);
    List<EnrollRequest> getAll();
}
