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
public class FAQDirectory {
    
     public ArrayList<FAQ> getFAQ() {
        return faq;
    }

    public void setDonor(ArrayList<FAQ> faq) {
        this.faq = faq;
    }
    private ArrayList<FAQ> faq;
    public FAQDirectory(){
        
        this.faq = new ArrayList<FAQ>();
    }
    
    public FAQ addNewFAQ(){
        FAQ newH = new FAQ();
        faq.add(newH);
        return newH;
    }
    public void deleteFAQ(FAQ d){
        faq.remove(d);
    
  }  
    
}
