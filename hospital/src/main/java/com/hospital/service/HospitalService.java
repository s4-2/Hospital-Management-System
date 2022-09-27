package com.hospital.service;

import java.util.List;

import com.hospital.model.DoctorModel;
import com.hospital.model.PatientModel;


public interface HospitalService {
	
    public DoctorModel showDoctorInformation(String name);
    public PatientModel showPatientInformation(Integer Id);
    public boolean saveDoctorInformation(DoctorModel doctor);
    public boolean savePatientInformation(PatientModel patient);
    public List<PatientModel> getPatientListOfDoctor(String name,DoctorModel doctor);
    public List<DoctorModel> getDoctors();

}
