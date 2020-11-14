package com.api.doctor.findmydoctor.Entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//import org.hibernate.dialect.MySQL8Dialect;

@Entity
public class DoctorEntities {
    

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private int pincode;
    private String fname;
    private String lname;
    private int number;
    private String description;
    private String address;

    public DoctorEntities(int id, int pincode, String fname, String lname, int number, String description, String address) {
        this.id = id;
        this.pincode = pincode;
        this.fname = fname;
        this.lname = lname;
        this.number = number;
        this.description = description;
        this.address = address;
    }

    public DoctorEntities() {
    }

    public int getId(){
        return id;
    }

    public void setId(){
        this.id = id;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Entities [address=" + address + ", description=" + description + ", fname=" + fname + ", lname=" + lname
                + ", number=" + number + ", pincode=" + pincode + ", id=" + id + "]";
    }
}
