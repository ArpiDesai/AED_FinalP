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
public class NotificationDirectory {
    
    private ArrayList<Notification> notification;
    public NotificationDirectory(){
        
        this.notification = new ArrayList<Notification>();
    }
    public ArrayList<Notification> getNotification() {
        return notification;
    }

    public void setNotification(ArrayList<Notification> notification) {
        this.notification = notification;
    }
    
    
    public Notification addNewNotification(){
        Notification newH = new Notification();
        notification.add(newH);
        return newH;
    }
    public void deleteNotification(Notification d){
        notification.remove(d);
    
  }  
    
}
