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
public class BloodBankDirectory {

    public ArrayList<BloodBank> getBloodbank() {
        return bloodbank;
    }

    public void setBloodbank(ArrayList<BloodBank> bloodbank) {
        this.bloodbank = bloodbank;
    }
    private ArrayList<BloodBank> bloodbank;
    
    public BloodBankDirectory(){
        
        this.bloodbank = new ArrayList<BloodBank>();
    }
    
     public BloodBank addNewBloodBank(){
        BloodBank newH = new BloodBank();
        bloodbank.add(newH);
        return newH;
    }
    
    public void deleteBloodBank(BloodBank d){
        bloodbank.remove(d);
    
  }  
    
}
