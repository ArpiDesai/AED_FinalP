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
public class ReceiverDirectory {
    
    public ReceiverDirectory()
    {
        this.receiver = new ArrayList<Receiver>();
    }

    public ArrayList<Receiver> getReceiver() {
        return receiver;
    }

    public void setReceiver(ArrayList<Receiver> receiver) {
        this.receiver = receiver;
    }
    private ArrayList<Receiver> receiver;
    
    public Receiver addNewR(){
        Receiver newH = new Receiver();
        receiver.add(newH);
        return newH;
    }
    public void deleteR(Receiver d){
        receiver.remove(d);
    
  }  
    
}
