package com.enigma.enrollment_java.dto.request;

public class EnrollDetailRequest {
    private Integer enrollId;

    public EnrollDetailRequest(Integer courseId, Integer period) {
        this.courseId = courseId;
        this.period = period;
    }

    private Integer courseId;
    private Integer period;

    public EnrollDetailRequest(Integer enrollId, Integer courseId, Integer period) {
        this.enrollId = enrollId;
        this.courseId = courseId;
        this.period = period;
    }

    public Integer getEnrollId() {
        return enrollId;
    }

    public EnrollDetailRequest() {
    }

    public void setEnrollId(Integer enrollId) {
        this.enrollId = enrollId;
    }

    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public Integer getPeriod() {
        return period;
    }

    public void setPeriod(Integer period) {
        this.period = period;
    }
}
