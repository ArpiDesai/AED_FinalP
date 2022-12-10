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
public class InventoryDirectory {
    
    private ArrayList<Inventory> inventory;
    public InventoryDirectory(){
        
        this.inventory = new ArrayList<Inventory>();
    }

    public ArrayList<Inventory> getInventory() {
        return inventory;
    }

    public void setInventory(ArrayList<Inventory> inventory) {
        this.inventory = inventory;
    }
    
    public Inventory addNewInventory(){
        Inventory newH = new Inventory();
        inventory.add(newH);
        return newH;
    }
    public void deleteInventory(Inventory d){
        inventory.remove(d);
    
  }  
    
    
    
}
