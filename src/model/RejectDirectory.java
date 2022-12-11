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
public class RejectDirectory {
    
   
    
    private ArrayList<Reject> reject;
    
    public RejectDirectory(){
        
        this.reject = new ArrayList<Reject>();
    }
    
    public ArrayList<Reject> getReject() {
        return reject;
    }

    public void setReject(ArrayList<Reject> reject) {
        this.reject = reject;
    }
    
    
    
    public Reject addNewReject(){
        Reject newH = new Reject();
        reject.add(newH);
        return newH;
    }
    public void deleteReject(Reject d){
        reject.remove(d);
    
  }  
    
}
