package com.enigma.enrollment_java.repository;

import com.enigma.enrollment_java.entity.Course;

public interface CourseRepository {
    void save(Course course);
    void update (Course course);
    void delete (Integer id);
}
