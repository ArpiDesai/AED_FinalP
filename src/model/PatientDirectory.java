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
public class PatientDirectory {
    
    private ArrayList<Patient> patient;
    
    public PatientDirectory(){
        
        this.patient = new ArrayList<Patient>();
    }

    public ArrayList<Patient> getPatient() {
        return patient;
    }

    public void setPatient(ArrayList<Patient> patient) {
        this.patient = patient;
    }

    
    
    public Patient addNewPatient(){
        Patient newH = new Patient();
        patient.add(newH);
        return newH;
    }
    public void deletePatient(Patient d){
        patient.remove(d);
    
  }  
     
    
    
}
