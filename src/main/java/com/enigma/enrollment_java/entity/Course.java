package com.enigma.enrollment_java.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "m_course")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "course_seq")
    @SequenceGenerator(name = "course_seq", sequenceName = "m_course_id_seq", allocationSize = 1)
    private Integer id;
    @Column(name = "course_name")
    private String course_name;
    @Column(name = "credit")
    private Integer credit;

    public Course(Integer id, String course_name, Integer credit) {
        this.id = id;
        this.course_name = course_name;
        this.credit = credit;
    }

    public Course() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

    public Integer getCredit() {
        return credit;
    }

    public void setCredit(Integer credit) {
        this.credit = credit;
    }

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", course_name='" + course_name + '\'' +
                ", credit=" + credit +
                '}';
    }
}
