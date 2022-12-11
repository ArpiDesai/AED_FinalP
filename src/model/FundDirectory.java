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
public class FundDirectory {

    public ArrayList<Fund> getFund() {
        return fund;
    }

    public void setFund(ArrayList<Fund> fund) {
        this.fund = fund;
    }
    private ArrayList<Fund> fund;
    
    public FundDirectory(){
        
        this.fund = new ArrayList<Fund>();
    }
    
    public Fund addNewFund(){
        Fund newH = new Fund();
        fund.add(newH);
        return newH;
    }
    
    public void deleteFund(Fund d){
        fund.remove(d);
    
  }  
    
}
