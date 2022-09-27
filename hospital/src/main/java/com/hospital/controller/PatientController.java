package com.hospital.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.exception.PatientException;
import com.hospital.model.PatientModel;
import com.hospital.service.HospitalService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class PatientController {
	
    @Autowired
    HospitalService service;

    @GetMapping("/patients/patient/{id}")
    public PatientModel showPatientInformation(@PathVariable Integer id){
    	PatientModel patient = service.showPatientInformation(id);
        if(patient == null){
            throw new PatientException(id + " is not in database");
        }
        return patient;
    }

    @PostMapping("patients/patient")
    public boolean createPatient(@RequestBody PatientModel patient){
        service.savePatientInformation(patient);
        return true;
    }
}
