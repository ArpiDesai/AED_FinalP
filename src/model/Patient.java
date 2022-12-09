/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author arpid
 */
public class Patient {

    public int getHospitalid() {
        return hospitalid;
    }

    public void setHospitalid(int hospitalid) {
        this.hospitalid = hospitalid;
    }

    public String getHospitalname() {
        return hospitalname;
    }

    public void setHospitalname(String hospitalname) {
        this.hospitalname = hospitalname;
    }

    public int getBloodcentreid() {
        return bloodcentreid;
    }

    public void setBloodcentreid(int bloodcentreid) {
        this.bloodcentreid = bloodcentreid;
    }

    public String getBloodcentrename() {
        return bloodcentrename;
    }

    public void setBloodcentrename(String bloodcentrename) {
        this.bloodcentrename = bloodcentrename;
    }

    public int getPatientid() {
        return patientid;
    }

    public void setPatientid(int patientid) {
        this.patientid = patientid;
    }

    public String getPatientname() {
        return patientname;
    }

    public void setPatientname(String patientname) {
        this.patientname = patientname;
    }

    public String getEmergencycause() {
        return emergencycause;
    }

    public void setEmergencycause(String emergencycause) {
        this.emergencycause = emergencycause;
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
    
    private int hospitalid;
    private String hospitalname;
    private int bloodcentreid;
    private String bloodcentrename;
    private int patientid;
    private String patientname;
    private String emergencycause;
    private String date;
    private String time;
    
    @Override
    public String toString()
    {
        return patientname;
    }
    
    
}
