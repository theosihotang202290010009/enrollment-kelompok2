package com.enigma.enrollment_java.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "m_period")
public class Period {
    @Id
    @GeneratedValue(generator = "period_seq", strategy = GenerationType.SEQUENCE)
    @SequenceGenerator(name = "period_seq", sequenceName = "m_period_id_seq", allocationSize = 1)
    private Integer id;
    @Column(name = "period_name")
    private String periodName;

    public Period(Integer id, String periodName) {
        this.id = id;
        this.periodName = periodName;
    }

    public Period(String periodName) {
        this.periodName = periodName;
    }

    public Period() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPeriodName() {
        return periodName;
    }

    public void setPeriodName(String periodName) {
        this.periodName = periodName;
    }

    @Override
    public String toString() {
        return "Period{" +
                "id=" + id +
                ", periodName='" + periodName + '\'' +
                '}';
    }
}
