/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author arpid
 */
public class Fund {

   

    public String getDonorname() {
        return donorname;
    }

    public void setDonorname(String donorname) {
        this.donorname = donorname;
    }

    public String getCentre() {
        return centre;
    }

    public void setCentre(String centre) {
        this.centre = centre;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getDonationtype() {
        return donationtype;
    }

    public void setDonationtype(String donationtype) {
        this.donationtype = donationtype;
    }

    public int getDonationid() {
        return donationid;
    }

    public void setDonationid(int donationid) {
        this.donationid = donationid;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
   
    private String donorname;
    private String centre;
    private int amount;
    private String donationtype;
    private int donationid;
    private String date;
    private String time;
    
    @Override
    public String toString()
    {
        return donorname;
    }
    
    
    
    
}
