package com.hospital.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.hospital.model.DoctorModel;

@Repository
@CrossOrigin(origins = "http://localhost:4200")
public interface DoctorRepository extends CrudRepository<DoctorModel,Integer>{

	 public DoctorModel findByName(String name);
}
