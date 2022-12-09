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
public class ReceiverSlotDirectory {
    
     public ArrayList<ReceiverSlot> getReceiverSlot() {
        return receiverslot;
    }

    public void setReceiverSlot(ArrayList<ReceiverSlot> receiverslot) {
        this.receiverslot = receiverslot;
    }
    
    private ArrayList<ReceiverSlot> receiverslot;
    
        public ReceiverSlotDirectory(){
        
        this.receiverslot = new ArrayList<ReceiverSlot>();
    }
        
    public ReceiverSlot addNewRSlot(){
        ReceiverSlot newH = new ReceiverSlot();
        receiverslot.add(newH);
        return newH;
    }
    public void deleteRSlot(ReceiverSlot d){
        receiverslot.remove(d);
    
  } 
    
}
