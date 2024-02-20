package com.enigma.enrollment_java.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "enroll")
public class Enroll {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "enroll_seq")
    @SequenceGenerator(name = "enroll_seq", sequenceName = "enroll_id_seq", allocationSize = 1)
    private Integer id;

    @ManyToOne(cascade = {CascadeType.PERSIST})
    @JoinColumn(name = "student_id")
    private Student studentId;
    @OneToMany(mappedBy = "enrollId", cascade = {CascadeType.PERSIST})
    private List<EnrollDetail> enrollDetails;

    public Enroll(Integer id, Student studentId) {
        this.id = id;
        this.studentId = studentId;
    }

    public Enroll() {

    }

    public Enroll(Student studentId) {
        this.studentId = studentId;
    }

    public Enroll(Student studentId, List<EnrollDetail> enrollDetails) {
        this.studentId = studentId;
        this.enrollDetails = enrollDetails;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Student getStudentId() {
        return studentId;
    }

    public void setStudentId(Student studentId) {
        this.studentId = studentId;
    }

    public List<EnrollDetail> getEnrollDetails() {
        return enrollDetails;
    }

    public void setEnrollDetails(List<EnrollDetail> enrollDetails) {
        this.enrollDetails = enrollDetails;
    }

    @Override
    public String toString() {
        return "Enroll{" +
                "id=" + id +
                ", studentId=" + studentId +
                ", enrollDetails=" + enrollDetails.toString() +
                ", enrollDetails=" + enrollDetails +
                '}';
    }
}
