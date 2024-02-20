package com.enigma.enrollment_java.dto.request;

import java.util.List;

public class EnrollRequest {
    private String name;
    private String major;
    private List<EnrollDetailRequest> enrollDetailRequests;

    public EnrollRequest(String name, String major) {
        this.name = name;
        this.major = major;
    }

    public EnrollRequest(String name, String major, List<EnrollDetailRequest> enrollDetailRequests) {
        this.name = name;
        this.major = major;
        this.enrollDetailRequests = enrollDetailRequests;
    }

    public EnrollRequest() {
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

    public List<EnrollDetailRequest> getEnrollDetailRequests() {
        return enrollDetailRequests;
    }

    public void setEnrollDetailRequests(List<EnrollDetailRequest> enrollDetailRequests) {
        this.enrollDetailRequests = enrollDetailRequests;
    }
}
