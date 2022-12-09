/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author arpid
 */
public class BloodDonationEvent {

    public String getCentre() {
        return Centre;
    }

    public void setCentre(String Centre) {
        this.Centre = Centre;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String Time) {
        this.Time = Time;
    }

    public long getContact() {
        return Contact;
    }

    public void setContact(long Contact) {
        this.Contact = Contact;
    }

    public int getEventid() {
        return Eventid;
    }

    public void setEventid(int Eventid) {
        this.Eventid = Eventid;
    }
    private int Eventid;
    private String Centre;
    private String Location;
    private String Date;
    private String Time;
    private long Contact;
    
     @Override
    public String toString()
    {
        return Centre;
    }
    
}
