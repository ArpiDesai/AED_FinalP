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
public class HotelOrdersDirectory {

    public ArrayList<HotelOrders> getHotelorders() {
        return hotelorders;
    }

    public void setHotelorders(ArrayList<HotelOrders> hotelorders) {
        this.hotelorders = hotelorders;
    }
    
    private ArrayList<HotelOrders> hotelorders;
     public HotelOrdersDirectory()
    {
        this.hotelorders = new ArrayList<HotelOrders>();
    }
     
     public HotelOrders addNewHO(){
        HotelOrders newH = new HotelOrders();
        hotelorders.add(newH);
        return newH;
    }
    public void deleteHO(HotelOrders d){
        hotelorders.remove(d);
    
  }  
     
     
}
