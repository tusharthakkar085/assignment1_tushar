/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cpd4414.assignment.pkg01;

import java.util.Date;

/**
 *
 * @author c0652863
 */
public class Order {
    
    // Declaring all the variables
 
    
    public Date timeReceived;
   public String customerId;
    public String customerName;
    public Date timeProcessed;
    public Date timeFulfilled;
    public String customerNotes;
    
    
    
    
    //----------------------------------------------------------------
    // Constructor

    public Order(Date timeReceived, String customerId, String customerName, Date timeProcessed, Date timeFulfilled, String customerNotes) {
        this.timeReceived = timeReceived;
        this.customerId = customerId;
        this.customerName = customerName;
        this.timeProcessed = timeProcessed;
        this.timeFulfilled = timeFulfilled;
        this.customerNotes = customerNotes;
    }
     

//---------------------------------------------------------------------------
    
    //Get Set Methods

    public Date getTimeReceived() {
        return timeReceived;
    }

    public void setTimeReceived(Date timeReceived) {
        this.timeReceived = timeReceived;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Date getTimeProcessed() {
        return timeProcessed;
    }

    public void setTimeProcessed(Date timeProcessed) {
        this.timeProcessed = timeProcessed;
    }

    public Date getTimeFulfilled() {
        return timeFulfilled;
    }

    public void setTimeFulfilled(Date timeFulfilled) {
        this.timeFulfilled = timeFulfilled;
    }

    public String getCustomerNotes() {
        return customerNotes;
    }

    public void setCustomerNotes(String customerNotes) {
        this.customerNotes = customerNotes;
    }
    
  //---------------------------------------------------------------
    
    
    
    
}
