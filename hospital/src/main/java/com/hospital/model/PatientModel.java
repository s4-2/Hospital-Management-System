package com.hospital.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "Patient")
public class PatientModel {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Integer id;
    @Column(name = "Name")
    private String name;
    @Column(name = "Age")
    private Integer age;
    @Column(name = "Gender")
    private String gender;
    @Column(name = "Prescription")
    private String prescription;
    @Column(name = "Doctor_Name")
    private String doctor_name;
    @Column(name = "Date_of_visit")
    private LocalDate date_of_visit;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Column(unique = true)

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPrescription() {
        return prescription;
    }

    public void setPrescription(String prescription) {
        this.prescription = prescription;
    }

    public PatientModel() {
    }

    @Override
    public String toString() {
        return "Patient [date_of_visit=" + date_of_visit +
                ", doctor_name=" + doctor_name + ", id=" + id + ", name="
                + name + "]";
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

    public String getDoctor_name() {
        return doctor_name;
    }

    public void setDoctor_name(String doctor_name) {
        this.doctor_name = doctor_name;
    }

    public LocalDate getDate_of_visit() {
        return date_of_visit;
    }

    public void setDate_of_visit(LocalDate date_of_visit) {
        this.date_of_visit = date_of_visit;
    }

    public PatientModel(Integer id, String name, Integer age, String doctor_name, LocalDate date_of_visit, String gender,
            String prescription) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.doctor_name = doctor_name;
        this.date_of_visit = date_of_visit;
        this.gender = gender;
        this.prescription = prescription;
    }

}
