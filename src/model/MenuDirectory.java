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
public class MenuDirectory {

    public ArrayList<Menu> getMenu() {
        return menu;
    }

    public void setMenu(ArrayList<Menu> menu) {
        this.menu = menu;
    }
    
    private ArrayList<Menu> menu;
     public MenuDirectory()
    {
        this.menu = new ArrayList<Menu>();
    }
     
     public Menu addNewMenu(){
        Menu newH = new Menu();
        menu.add(newH);
        return newH;
    }
    public void deleteMenu(Menu d){
        menu.remove(d);
    }
    
}
