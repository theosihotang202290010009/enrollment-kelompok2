package com.enigma.enrollment_java.dto.request;

import com.enigma.enrollment_java.entity.Course;
import com.enigma.enrollment_java.entity.Enroll;
import com.enigma.enrollment_java.entity.Period;
public class EnrollDetailRequest {
    private Enroll enrollId;
    private Course courseId;
    private Period period;

    public EnrollDetailRequest(Enroll enrollId, Course courseId, Period period) {
        this.enrollId = enrollId;
        this.courseId = courseId;
        this.period = period;
    }

    public EnrollDetailRequest(Course courseId, Period period) {
        this.courseId = courseId;
        this.period = period;
    }

    public Enroll getEnrollId() {
        return enrollId;
    }

    public void setEnrollId(Enroll enrollId) {
        this.enrollId = enrollId;
    }

    public Course getCourseId() {
        return courseId;
    }

    public void setCourseId(Course courseId) {
        this.courseId = courseId;
    }

    public Period getPeriod() {
        return period;
    }

    public void setPeriod(Period period) {
        this.period = period;
    }
}
