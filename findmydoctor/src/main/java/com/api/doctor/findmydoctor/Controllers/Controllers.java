package com.api.doctor.findmydoctor.Controllers;

import java.util.List;
import java.util.Optional;

import com.api.doctor.findmydoctor.Entities.DoctorEntities;
import com.api.doctor.findmydoctor.services.DoctorService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controllers{

    @Autowired
    private DoctorService doctorService;


    @GetMapping("/doctor")
    public List<DoctorEntities> getDoctorEntities()
    {
        // DoctorEntities entities= new DoctorEntities();
        // entities.setPincode(362720);
        // entities.setFname("Ishita");
        // entities.setLname("Hirpara");
        return this.doctorService.getAllDoctorEntities();
        
    }

    @GetMapping("/doctor/{pincode}")
    public ResponseEntity<DoctorEntities> getDoctorEntities(@PathVariable("pincode") int pincode){
        DoctorEntities entities= getDoctorEntitiesByPincode(pincode);
        if(entities == null){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        return ResponseEntity.of(Optional.of(entities));
    }

    private DoctorEntities getDoctorEntitiesByPincode(int pincode) {
        return null;
    }

    @PostMapping("/doctor")
    public DoctorEntities addDoctor(@RequestBody DoctorEntities newData)
    {
        DoctorEntities e=this.doctorService.addDoctor(newData);
        System.out.println(newData);
             return e;
    }

    @DeleteMapping("/doctor/(DoctorId)")
    public void deleteData(@PathVariable("DoctorId") int DoctorId)
    {
        this.doctorService.deleteData(DoctorId);
    }

    @PutMapping("/doctor/DoctorId")
    public DoctorEntities updateData(@RequestBody DoctorEntities entities,@PathVariable("DoctorId") int DoctorId){

        return this.doctorService.updateData(entities, DoctorId);

    }

}
    

