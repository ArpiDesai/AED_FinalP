/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author arpid
 */
public class ReceiverSlot {

    public int getSlotid() {
        return Slotid;
    }

    public void setSlotid(int Slotid) {
        this.Slotid = Slotid;
    }

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

    public int getDonorid() {
        return Donorid;
    }

    public void setDonorid(int Donorid) {
        this.Donorid = Donorid;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public long getContact() {
        return Contact;
    }

    public void setContact(long Contact) {
        this.Contact = Contact;
    }

    public String getEmailId() {
        return EmailId;
    }

    public void setEmailId(String EmailId) {
        this.EmailId = EmailId;
    }

    public String getBloodGroup() {
        return BloodGroup;
    }

    public void setBloodGroup(String BloodGroup) {
        this.BloodGroup = BloodGroup;
    }

    public long getReceiverContact() {
        return ReceiverContact;
    }

    public void setReceiverContact(long ReceiverContact) {
        this.ReceiverContact = ReceiverContact;
    }
     private int Slotid;
    private String Centre;
    private String Location;
    private String Date;
    private String Time;
    private int Donorid;
    private String Name;
    private int Age;
    private String Gender;
    private long Contact;
    private String EmailId;
    private String BloodGroup;
    private long ReceiverContact;

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }
    private String Username;
    
    @Override
    public String toString()
    {
        return Centre;
    }
    
}
