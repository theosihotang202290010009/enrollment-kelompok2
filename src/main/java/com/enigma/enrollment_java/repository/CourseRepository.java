package com.enigma.enrollment_java.repository;

import com.enigma.enrollment_java.entity.Course;

public interface CourseRepository {
    void save(Course course);
    void update (Integer id, String newName);
    void delete (Integer id);
}
