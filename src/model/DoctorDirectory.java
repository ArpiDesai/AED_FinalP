/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author arpid
 */
public class DoctorDirectory {

    public ArrayList<Doctor> getDoctor() {
        return doctor;
    }

    public void setDoctor(ArrayList<Doctor> doctor) {
        this.doctor = doctor;
    }
    private ArrayList<Doctor> doctor;
    public DoctorDirectory()
    {
         this.doctor = new ArrayList<Doctor>();
    }
    
    public Doctor addNewDoctor(){
        Doctor newH = new Doctor();
        doctor.add(newH);
        return newH;
    }
    public void deleteDoctor(Doctor d){
        doctor.remove(d);
    }
    
    public String[] DoctorNameArray(){
        String[] c = new String[doctor.size()+1];
        int count=1;
        c[0] = "Select";
        for(Doctor cc: doctor){
            c[count] = cc.getDoctorname();
            count++ ;
        }
        return c;
     }
    
    public String[] DoctorUserNameArray(){
        String[] c = new String[doctor.size()+1];
        int count=1;
        c[0] = "Select";
        for(Doctor cc: doctor){
            c[count] = cc.getUsername();
            count++ ;
        }
        return c;
     }
    

    
}
