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
public class AcceptDirectory {
    
    
    
    private ArrayList<Accept> accept;
    
    public AcceptDirectory(){
        
        this.accept = new ArrayList<Accept>();
    }
    
    public ArrayList<Accept> getAccept() {
        return accept;
    }

    public void setAccept(ArrayList<Accept> accept) {
        this.accept = accept;
    }
    
    
    
    public Accept addNewAccept(){
        Accept newH = new Accept();
        accept.add(newH);
        return newH;
    }
    
    public void deleteAccept(Accept d){
        accept.remove(d);
    
  }  
    
}
