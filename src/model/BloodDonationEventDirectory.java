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
public class BloodDonationEventDirectory {
    
    private ArrayList<BloodDonationEvent> blooddonationevent;
    public BloodDonationEventDirectory()
    {
        this.blooddonationevent = new ArrayList<BloodDonationEvent>();
    }

    public ArrayList<BloodDonationEvent> getBloodDonationEvent() {
        return blooddonationevent;
    }

    public void setBloodDonationEvent(ArrayList<BloodDonationEvent> blooddonationevent) {
        this.blooddonationevent = blooddonationevent;
    }

    
    
    
    public BloodDonationEvent addNewEvent(){
        BloodDonationEvent newH = new BloodDonationEvent();
        blooddonationevent.add(newH);
        return newH;
    }
    public void deleteEvent(BloodDonationEvent d){
        blooddonationevent.remove(d);
    } 
    
}
