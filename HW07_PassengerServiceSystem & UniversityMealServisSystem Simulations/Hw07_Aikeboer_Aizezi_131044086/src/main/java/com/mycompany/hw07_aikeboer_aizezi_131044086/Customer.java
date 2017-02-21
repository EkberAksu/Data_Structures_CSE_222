/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hw07_aikeboer_aizezi_131044086;

/**
 * Customer class to track the passengers information
 * @author Akbar Aziz
 */
public class Customer implements Comparable{
    
    //Data Fields
    /* Time that passengers arrive */
    private final Timer arrivalTime;
    /* Time to serve a passenger in minutes */
    private final int serviceTime;
    /* Type of the customer 1 gold, 2 silver, 3 bronze */
    private final int customerType;
    
    // Constructor
    public Customer(Timer arrivalTime, int serviceTime, int type){
        this.arrivalTime = arrivalTime;
        this.serviceTime = serviceTime;
        this.customerType = type;
    }
    
    //Setters and getters
    /**
     * Arrival time getter 
     * @return Get the passenger's arrival time
     */
    public Timer getArrivalTime(){
        return arrivalTime;
    }
    
    /**
     * Service time getter
     * @return Get the service time
     */
    public int getServiceTime(){
        return serviceTime;
    }
    
    /**
     * Customer type getter
     * @return Get the customer type
     */
    public int getCustomerType(){
        return customerType;
    }
    
    /**
     * 
     * @param o Object to be compared to
     * @return Positive value if the current customer type is bigger than otherTime
     *         Negative value if the current customer type is smaller than otherTime
     *         Zero value if the the customer types are equal
     */
    @Override
    public int compareTo(Object o) {
        Customer otherPassenger;
        
        if(o instanceof Customer)
            otherPassenger = (Customer)o;
        else
            return -99;
        
        if(this.customerType > otherPassenger.customerType)
            return 1;
        else if(this.customerType < otherPassenger.customerType)
            return -1;
        else
            return 0;
    }

    /**
     * 
     * @return String format of the passenger
     */
    @Override
    public String toString(){
        StringBuilder customer = new StringBuilder();
        customer.append("Arrival Time: ");
        customer.append(arrivalTime);
        customer.append(" Service Time: ");
        customer.append(serviceTime);
        customer.append(" Customer Type: ");
        
        switch(customerType){
            case 1: 
                customer.append("Gold");
                break;
            case 2: 
                customer.append("Silver");
                break;
            case 3: 
                customer.append("Bronze");
                break;
        }
        
        return customer.toString();
    }
}