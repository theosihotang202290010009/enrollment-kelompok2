package com.enigma.enrollment_java.dto.response;

import com.enigma.enrollment_java.dto.request.EnrollDetailRequest;
import com.enigma.enrollment_java.entity.Course;
import com.enigma.enrollment_java.entity.Enroll;
import com.enigma.enrollment_java.entity.Period;

import java.util.List;

public class EnrollDetailResponse {
    private Integer enrollDetail;
    private Integer enrollId;
    private String courseName;
    private String periodName;
    private String name;
    private String major;

    public EnrollDetailResponse(Integer enrollDetail, Integer enrollId, String courseName, String periodName, String name, String major) {
        this.enrollDetail = enrollDetail;
        this.enrollId = enrollId;
        this.courseName = courseName;
        this.periodName = periodName;
        this.name = name;
        this.major = major;
    }

    public EnrollDetailResponse() {
    }

    public Integer getEnrollDetail() {
        return enrollDetail;
    }

    public void setEnrollDetail(Integer enrollDetail) {
        this.enrollDetail = enrollDetail;
    }

    public Integer getEnrollId() {
        return enrollId;
    }

    public void setEnrollId(Integer enrollId) {
        this.enrollId = enrollId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getPeriodName() {
        return periodName;
    }

    public void setPeriodName(String periodName) {
        this.periodName = periodName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public String toString() {
        return "EnrollDetailResponse{" +
                "enrollDetail=" + enrollDetail +
                ", enrollId=" + enrollId +
                ", courseName='" + courseName + '\'' +
                ", periodName='" + periodName + '\'' +
                ", name='" + name + '\'' +
                ", major='" + major + '\'' +
                '}';
    }
}
