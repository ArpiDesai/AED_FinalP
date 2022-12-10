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
public class ApplicantDirectory {
    
    private ArrayList<Applicant> applicant;
    
    public ApplicantDirectory(){
        
        this.applicant = new ArrayList<Applicant>();
    }
    
    public ArrayList<Applicant> getApplicant() {
        return applicant;
    }

    public void setApplicant(ArrayList<Applicant> applicant) {
        this.applicant = applicant;
    }
    
    
    
    public Applicant addNewApplicant(){
        Applicant newH = new Applicant();
        applicant.add(newH);
        return newH;
    }
    public void deleteApplicant(Applicant d){
        applicant.remove(d);
    
  }
   
    
    
}
