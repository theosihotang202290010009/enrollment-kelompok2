package com.enigma.enrollment_java.entity;

import jakarta.persistence.*;

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

    public Enroll(Integer id, Student studentId) {
        this.id = id;
        this.studentId = studentId;
    }

    public Enroll() {

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
}
