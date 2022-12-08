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
public class CentreDirectory {
    private ArrayList<Centre> centre;
    public CentreDirectory()
    {
        this.centre = new ArrayList<Centre>();
    }

    public ArrayList<Centre> getCentre() {
        return centre;
    }

    public void setCentre(ArrayList<Centre> centre) {
        this.centre = centre;
    }
    
    public Centre addNewCentre(){
        Centre newH = new Centre();
        centre.add(newH);
        return newH;
    }
    public void deleteCentre(Centre d){
        centre.remove(d);
    } 
}
