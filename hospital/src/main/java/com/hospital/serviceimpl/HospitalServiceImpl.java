package com.hospital.serviceimpl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hospital.model.DoctorModel;
import com.hospital.model.PatientModel;
import com.hospital.repository.DoctorRepository;
import com.hospital.repository.PatientRepository;
import com.hospital.service.HospitalService;


@Repository
@Transactional
public class HospitalServiceImpl implements HospitalService{
	
    @Autowired
    DoctorRepository doctorRepository;
    @Autowired
    PatientRepository patientRepository;

    @Override
    public DoctorModel showDoctorInformation(String name) {
        return doctorRepository.findByName(name);
    }

    @Override
    public PatientModel showPatientInformation(Integer id) {
        return patientRepository.findById(id).get();
    }

    @Override
    public boolean saveDoctorInformation(DoctorModel doctor) {
        doctorRepository.save(doctor);
        return true;
    }

    @Override
    public boolean savePatientInformation(PatientModel patient) {

    	DoctorModel doctor = doctorRepository.findByName(patient.getDoctor_name());
        doctor.addPatients(patient);
        patientRepository.save(patient);
        doctor.setPatient_count();
        return true;
    }

    @Override
    public List<PatientModel> getPatientListOfDoctor(String name, DoctorModel doctor) {
        return doctor.getPatients();
    }

    @Override
    public List<DoctorModel> getDoctors() {
        return (List<DoctorModel>) doctorRepository.findAll();
    }

}
