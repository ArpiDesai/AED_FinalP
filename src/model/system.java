/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author arpid
 */

public class system {
    private static system s;
    private DonorDirectory donordirectory;
    private ReceiverDirectory receiverdirectory;
    private HospitalDirectory hospitaldirectory;
    private HotelDirectory hoteldirectory;   
    private CentreDirectory centredirectory;
    private PharmacyDirectory pharmacydirectory;    
    private FAQDirectory faqdirectory;   
    private NotificationDirectory notificationdirectory;
    
    public system()
    {
        donordirectory = new DonorDirectory();
        receiverdirectory = new ReceiverDirectory();
        hospitaldirectory = new HospitalDirectory();
        hoteldirectory = new HotelDirectory();
        centredirectory = new CentreDirectory();
        pharmacydirectory = new PharmacyDirectory();
        faqdirectory = new FAQDirectory();
        notificationdirectory = new NotificationDirectory();
        
    }
    
     public NotificationDirectory getNotificationdirectory() {
        return notificationdirectory;
    }

    public void setNotificationdirectory(NotificationDirectory notificationdirectory) {
        this.notificationdirectory = notificationdirectory;
    }
    
    public FAQDirectory getFaqdirectory() {
        return faqdirectory;
    }

    public void setFaqdirectory(FAQDirectory faqdirectory) {
        this.faqdirectory = faqdirectory;
    }
     public CentreDirectory getCentredirectory() {
        return centredirectory;
    }

    public void setCentredirectory(CentreDirectory centredirectory) {
        this.centredirectory = centredirectory;
    }

    public HotelDirectory getHoteldirectory() {
        return hoteldirectory;
    }

    public void setHoteldirectory(HotelDirectory hoteldirectory) {
        this.hoteldirectory = hoteldirectory;
    }

    public HospitalDirectory getHospitaldirectory() {
        return hospitaldirectory;
    }

    public void setHospitaldirectory(HospitalDirectory hospitaldirectory) {
        this.hospitaldirectory = hospitaldirectory;
    }  

    public ReceiverDirectory getReceiverdirectory() {
        return receiverdirectory;
    }

    public void setReceiverdirectory(ReceiverDirectory receiverdirectory) {
        this.receiverdirectory = receiverdirectory;
    }
    

    public DonorDirectory getDonordirectory() {
        return donordirectory;
    }

    public void setDonordirectory(DonorDirectory donordirectory) {
        this.donordirectory = donordirectory;
    }
    
    public PharmacyDirectory getPharmacydirectory() {
        return pharmacydirectory;
    }

    public void setPharmacydirectory(PharmacyDirectory pharmacydirectory) {
        this.pharmacydirectory = pharmacydirectory;
    }

    
   
    
    
    

    
    
    
}
