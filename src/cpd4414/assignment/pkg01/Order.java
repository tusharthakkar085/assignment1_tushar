/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpd4414.assignment.pkg01;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

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
    private List<Purchase> listOfPurchases = new ArrayList<>();

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

    
     public List<Purchase> getListOfPurchases() {
        return listOfPurchases;
    }

    public void setListOfPurchases(List<Purchase> listOfPurchases) {
        this.listOfPurchases = listOfPurchases;
    }
    
    public JSONObject toJSON() {
        JSONObject obj = new JSONObject();
        obj.put("customerId", getCustomerId());
        obj.put("customerName", getCustomerName());

        obj.put("timeReceived", (getTimeReceived() != null) ? getTimeReceived().toString() : null);
        obj.put("timeProcessed", (getTimeProcessed() != null) ? getTimeProcessed().toString() : null);
        obj.put("timeFulfilled", (getTimeFulfilled() != null) ? getTimeFulfilled().toString() : null);
        
        JSONArray purchaseList = new JSONArray();
        for (Purchase pur : getListOfPurchases()) {
            JSONObject purchase = new JSONObject();
            purchase.put("productId", pur.getProductID());
            purchase.put("quantity", pur.getQuantity());
            purchaseList.add(purchase);
        }
        
        obj.put("purchases", purchaseList);
        obj.put("notes", getCustomerNotes());
        
        return obj;
    }

}
