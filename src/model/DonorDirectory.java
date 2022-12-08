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
public class DonorDirectory {

    public ArrayList<Donor> getDonor() {
        return donor;
    }

    public void setDonor(ArrayList<Donor> donor) {
        this.donor = donor;
    }
    private ArrayList<Donor> donor;
    public DonorDirectory(){
        
        this.donor = new ArrayList<Donor>();
    }
    
    public Donor addNewD(){
        Donor newH = new Donor();
        donor.add(newH);
        return newH;
    }
    public void deleteD(Donor d){
        donor.remove(d);
    
  }  
}
