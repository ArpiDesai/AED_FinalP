/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author arpid
 */
public class PharmacyOrders {

    

    public String getPharmacyname() {
        return pharmacyname;
    }

    public void setPharmacyname(String pharmacyname) {
        this.pharmacyname = pharmacyname;
    }

    public int getCenterid() {
        return centerid;
    }

    public void setCenterid(int centerid) {
        this.centerid = centerid;
    }

    public String getCentrename() {
        return centrename;
    }

    public void setCentrename(String centrename) {
        this.centrename = centrename;
    }

    public int getItemid() {
        return itemid;
    }

    public void setItemid(int itemid) {
        this.itemid = itemid;
    }

    public String getItemname() {
        return itemname;
    }

    public void setItemname(String itemname) {
        this.itemname = itemname;
    }

    public String getItemtype() {
        return itemtype;
    }

    public void setItemtype(String itemtype) {
        this.itemtype = itemtype;
    }

    public int getQunatity() {
        return qunatity;
    }

    public void setQunatity(int qunatity) {
        this.qunatity = qunatity;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getPharmacyusername() {
        return pharmacyusername;
    }

    public void setPharmacyusername(String pharmacyusername) {
        this.pharmacyusername = pharmacyusername;
    }
    private String pharmacyusername;
    private String pharmacyname;
    private int centerid;
    private String centrename;
    private int itemid;
    private String itemname;
    private String itemtype;
    private int qunatity;
    private int price;
    private String date;
    
    @Override
    public String toString()
    {
        return pharmacyname;
    }
    
    
    
}
