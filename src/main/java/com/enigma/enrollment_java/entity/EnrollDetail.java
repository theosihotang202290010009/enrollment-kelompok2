package com.enigma.enrollment_java.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "enroll_detail")
public class EnrollDetail {
    @Id
    @GeneratedValue(generator = "enroll_detail_seq", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "enroll_detail_seq", sequenceName = "enroll_detail_id_seq", initialValue = 1)
    private Integer id;
    @ManyToOne
    @JoinColumn(name = "enroll_id")
    private Enroll enrollId;
    @ManyToOne
    private Course courseId;
    @ManyToOne
    private Period periodId;

    public EnrollDetail(Integer id, Enroll enrollId, Course courseId, Period periodId) {
        this.id = id;
        this.enrollId = enrollId;
        this.courseId = courseId;
        this.periodId = periodId;
    }

    public EnrollDetail(Enroll enrollId, Course courseId, Period periodId) {
        this.enrollId = enrollId;
        this.courseId = courseId;
        this.periodId = periodId;
    }

    public EnrollDetail(Course courseId, Period periodId) {
        this.courseId = courseId;
        this.periodId = periodId;
    }

    public EnrollDetail() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Period getPeriodId() {
        return periodId;
    }

    public void setPeriodId(Period periodId) {
        this.periodId = periodId;
    }
}
