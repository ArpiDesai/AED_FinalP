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
public class PharmacyDirectory {
    public ArrayList<Pharmacy> getPharmacy() {
        return pharmacy;
    }

    public void setPharmacy(ArrayList<Pharmacy> pharmacy) {
        this.pharmacy = pharmacy;
    }
    
    private ArrayList<Pharmacy> pharmacy;
    
     public PharmacyDirectory()
    {
        this.pharmacy = new ArrayList<Pharmacy>();
    }
    
    public Pharmacy addNewPharmacy(){
        Pharmacy newH = new Pharmacy();
        pharmacy.add(newH);
        return newH;
    }
    public void deletePharmacy(Pharmacy d){
        pharmacy.remove(d);
    
  }  
    
     public String[] PharmacynameArray(){
        String[] c = new String[pharmacy.size()+1];
        int count=1;
        c[0] = "Select";
        for(Pharmacy cc: pharmacy){
            c[count] = cc.getName();
            count++ ;
        }
        return c;
     }
     
     public String[] PharmacyusernameArray(){
        String[] c = new String[pharmacy.size()+1];
        int count=1;
        c[0] = "Select";
        for(Pharmacy cc: pharmacy){
            c[count] = cc.getUsername();
            count++ ;
        }
        return c;
     }
     
     
    
}
