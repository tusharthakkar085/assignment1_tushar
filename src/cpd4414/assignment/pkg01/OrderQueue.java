/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cpd4414.assignment.pkg01;

import java.util.ArrayList;
import java.util.ArrayDeque;
import java.util.List;
import java.util.Date;
import java.util.Queue;



/**
 *
 * @author c0652863
 */
public class OrderQueue {
    Queue<Order> orderque = new ArrayDeque();
    List<Order> orderList = new ArrayList();
    
    public void add(Order order) throws CustException, PurchaseException {
        if(order.getCustomerId().isEmpty() && order.getCustomerName().isEmpty()){
        throw new CustException();
        }
        if(order.getListOfPurchases().isEmpty()){
        throw new PurchaseException();
        }
    }


    public class CustException extends Exception {

        public CustException() {
            super("No Customer.");
        }
    }
        
    public class PurchaseException extends Exception {

            public PurchaseException() {
                super("No Purchase.");
            }
        }
    

}
