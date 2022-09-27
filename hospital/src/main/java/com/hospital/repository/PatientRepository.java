package com.hospital.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hospital.model.PatientModel;

@Repository
public interface PatientRepository extends CrudRepository<PatientModel,Integer>{

}
