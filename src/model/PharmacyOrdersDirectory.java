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
public class PharmacyOrdersDirectory {

    public ArrayList<PharmacyOrders> getPharmacyorders() {
        return pharmacyorders;
    }

    public void setPharmacyorders(ArrayList<PharmacyOrders> pharmacyorders) {
        this.pharmacyorders = pharmacyorders;
    }
    private ArrayList<PharmacyOrders> pharmacyorders;
     public PharmacyOrdersDirectory()
    {
        this.pharmacyorders = new ArrayList<PharmacyOrders>();
    }
     public PharmacyOrders addNewPO(){
        PharmacyOrders newH = new PharmacyOrders();
        pharmacyorders.add(newH);
        return newH;
    }
    public void deletePO(PharmacyOrders d){
        pharmacyorders.remove(d);
    
  }  
     
     
    
    
}
