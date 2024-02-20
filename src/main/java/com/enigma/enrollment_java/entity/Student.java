package com.enigma.enrollment_java.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "m_student")
public class Student {
    @Id
    @GeneratedValue(generator = "student_seq", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "student_seq", sequenceName = "m_student_id_seq", allocationSize = 1)
    private Integer id;
    @Column(name = "student_name")
    private String name;
    @Column(name = "major")
    private String major;

    public Student(Integer id, String name, String major) {
        this.id = id;
        this.name = name;
        this.major = major;
    }

    public Student(String name, String major) {
        this.name = name;
        this.major = major;
    }

    public Student(String major) {
        this.major = major;
    }

    public Student() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", major='" + major + '\'' +
                '}';
    }
}
