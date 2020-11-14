package com.api.doctor.findmydoctor.dao;

import com.api.doctor.findmydoctor.Entities.DoctorEntities;

import org.springframework.data.repository.CrudRepository;

public interface DoctorRepository extends CrudRepository<DoctorEntities, Integer>{

    public DoctorEntities findByPincode(int pincode);
    
}
