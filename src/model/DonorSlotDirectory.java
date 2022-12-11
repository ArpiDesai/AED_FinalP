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
public class DonorSlotDirectory {

    public ArrayList<DonorSlot> getDonorslot() {
        return donorslot;
    }

    public void setDonorslot(ArrayList<DonorSlot> donorslot) {
        this.donorslot = donorslot;
    }
    
    private ArrayList<DonorSlot> donorslot;
    
        public DonorSlotDirectory(){
        
        this.donorslot = new ArrayList<DonorSlot>();
    }
        
    public DonorSlot addNewDSlot(){
        DonorSlot newH = new DonorSlot();
        donorslot.add(newH);
        return newH;
    }
    public void deleteDSlot(DonorSlot d){
        donorslot.remove(d);
    
  } 
    
}
