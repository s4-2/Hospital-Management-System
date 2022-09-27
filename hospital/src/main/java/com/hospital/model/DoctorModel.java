package com.hospital.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFilter;

@Entity
@JsonFilter("DoctorFilter")
@Table(name = "Doctor")
public class DoctorModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "Name")
    private String name;
    @Column(name = "Age")
    private Integer age;
    @Column(name = "Gender")
    private String gender;
    @Column(name = "Field")
    private String field;
    @Column(name = "Patient_Count")
    private Integer patient_count = 0;

    @OneToMany
    private List<PatientModel> patients;

    public List<PatientModel> getPatients() {
        return patients;
    }

    public void addPatients(PatientModel patient) {
        patients.add(patient);
    }

    public DoctorModel() {
    }

    public DoctorModel(String name, Integer age, String gender, String field) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.field = field;
    }

    @Override
    public String toString() {
        return "Doctor [age=" + age + ", field=" + field +
                ", gender=" + gender + ", id=" + id + ", name=" + name + "]";
    }

    public Integer getPatient_count() {
        return patient_count;
    }

    public void setPatient_count() {
        this.patient_count += 1;
    }

    public Integer getId() {
        return id;
    }

    protected void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }
}
