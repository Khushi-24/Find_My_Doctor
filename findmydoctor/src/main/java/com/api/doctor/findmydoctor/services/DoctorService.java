package com.api.doctor.findmydoctor.services;

import java.util.ArrayList;
import java.util.List;

import com.api.doctor.findmydoctor.Entities.DoctorEntities;
import com.api.doctor.findmydoctor.dao.DoctorRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;

    // private  static List<DoctorEntities> list= new ArrayList<>();

    // static{
    //     list.add(new DoctorEntities(1, 88348, "Raj", "Jiyani" , 617229919, "shiva" , "hospital"));
    // }

    public List<DoctorEntities> getAllDoctorEntities()
    {
        List<DoctorEntities> list= (List<DoctorEntities>)this.doctorRepository.findAll();
        return list;
    }

    public DoctorEntities getDoctorEntitiesByPincode( int pincode)
    {
        DoctorEntities entities= null;
        try {
            entities= this.doctorRepository.findByPincode(pincode);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return entities;
    }

    // //single data
    // public DoctorEntities getDoctorEntitiesByPincode(int pincode)
    // {
    //     DoctorEntities doctor= null;
    //     doctor=list.stream().filter(e->getPincode()==pincode).findFirst.get();
    //     return doctor;
    // } 


    // post mapping method
    public DoctorEntities addDoctor(DoctorEntities e)
    {
        DoctorEntities result= doctorRepository.save(e);
        return result;
    }

    // // delete data
     public void deleteData(int did)
     {
        doctorRepository.deleteById(did);
    //     list.stream().filter(predicate)
     }

     public DoctorEntities updateData(DoctorEntities entities, int DoctorId)
     {
         //entities.setId(DoctorId);

         doctorRepository.save(entities);
         return null;   
     }

	
    
}
