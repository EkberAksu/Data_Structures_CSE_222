/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.hw07_aikeboer_aizezi_131044086;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 * simulation of customer serves problem  
 * @author Akbar Aziz
 */
public class Simulator{
    
    //Data Fields
    /* The passengers priority queue */
    private final PriorityQueue<Customer> customers;
    /* The passengers readed from the input file */
    private final ArrayList<Customer> customersInput;
    /* Counter for Gold passengers */
    private int goldCustomer;
    /* Counter for Silver passengers */
    private int silverCustomers;
    /* Counter for Bronze passengers */
    private int bronzCustomers;
    
    /**
     * Default Constructor
     */
    public Simulator(){
        customers = new PriorityQueue<>();
        customersInput = new ArrayList<>();
        goldCustomer = 0;
        silverCustomers = 0;
        bronzCustomers = 0;
    }
    
    /**
     * Method to start simulation process
     * @param inputFileName Input file name
     * @param outputFile Log file name
     */
    public void simulate(String inputFileName, String outputFile){
        FileWriter output = null;
        try {
            output = new FileWriter(outputFile);
            System.out.print("Arrival Time\t Leaving Time\t Customer Type \n");
            output.write("Arrival Time\t Leaving Time\t Customer Type \n");
        
            Timer leavingTimeOfCurr = new Timer();
            Timer currSimTimer, endSimCountTimer;
            Customer curCustomer;
            
            /* Read passengers from the text file */
            readCustomers(inputFileName, customersInput);
            customers.offer(customersInput.remove(0));
            //Set the starting simulation time to the first persons arrival time
            currSimTimer = customers.peek().getArrivalTime();
            //Add 20 hours(1200 minutes) to find when to stop counting Gold, Silver and Bronze
            endSimCountTimer = currSimTimer.increaseMinutes(1200);
            
            while(true)
            {
                // Look at the queue
                if(customers.peek() != null) //If the queue isn't empty
                {
                    curCustomer = customers.poll(); //Get the first passenger
                    currSimTimer.addMinutes(curCustomer.getServiceTime()); //Calculate leaving time
                    leavingTimeOfCurr = currSimTimer;
                    output.write("\n"+curCustomer.getArrivalTime().toString());
                    output.write("\t\t " + leavingTimeOfCurr + "\t\t Customer " + curCustomer.getCustomerType() + "\n");
                    System.out.print(curCustomer.getArrivalTime().toString());
                    System.out.println("\t\t " + leavingTimeOfCurr + "\t\t Customer " + curCustomer.getCustomerType());
                    
                    if(currSimTimer.compareTo(endSimCountTimer) > 0)
                    {
                        switch(curCustomer.getCustomerType())
                        {
                            case 1: 
                                ++goldCustomer; 
                                break;
                            case 2: 
                                ++silverCustomers;
                                break;
                            case 3: 
                                ++bronzCustomers; 
                                break;     
                        }
                    }
                }

                while(!customersInput.isEmpty() && 
                customersInput.get(0).getArrivalTime().compareTo(leavingTimeOfCurr) < 0)
                {
                    customers.offer(customersInput.remove(0));
                }
                
                if(customers.isEmpty() && !customersInput.isEmpty())
                {
                    customers.offer(customersInput.remove(0));
                    currSimTimer = customers.peek().getArrivalTime();
                }
                
                if(customersInput.isEmpty() && customers.isEmpty())
                    break;     
            }
            
            output.write("Customers served for the last 20 hours:\n");
            output.write("Gold : " + goldCustomer + "\n");
            output.write("Silver : " + silverCustomers + "\n");
            output.write("Bronze : " + bronzCustomers + "\n");
            int totalCustomers = goldCustomer + silverCustomers + bronzCustomers;
            output.write("Total served customers: " + totalCustomers + "\n");
            System.out.println("Customers server for the last 20 hours:");
            System.out.println("Gold : " + goldCustomer);
            System.out.println("Silver : " + silverCustomers);
            System.out.println("Bronze : " + bronzCustomers);
            System.out.println("Total served customers: " + totalCustomers +"\n");
            
        }catch (IOException error){
            System.out.println("Error: " + error.getMessage());
        }finally{
            if(output != null)
                try {
                    output.close();
            }catch(IOException error) {
                System.out.println("Error: " + error.getMessage());
            }
        }
    }
    
    /**
     * reads all the customers from the input file
     * @param inputFile The name of the input file
     * @param theCustomers Passengers are read to this array
     */
    private void readCustomers(String inputFile, ArrayList<Customer> theCustomers){     
        BufferedReader input = null;
        try
        {
            input = new BufferedReader(new FileReader(inputFile));
            // Jump the first line of the file
            String line = input.readLine(); 
            int hour, minute, serviceTime, type;
            
            /* Read data from the input file */
            while((line = input.readLine()) != null)
            {
                hour = Integer.parseInt(line.substring(0, 2));
                minute = Integer.parseInt(line.substring(3, 5));
                serviceTime = Integer.parseInt(line.substring(16, 18));
                type = Integer.parseInt(line.substring(41, 42));
                theCustomers.add(new Customer(new Timer(hour, minute), serviceTime, type));
            }
        }catch(FileNotFoundException error){
            System.out.println("Error: " + error.getMessage());
        }catch(IOException error) {
                System.out.println("Error: " + error.getMessage());
        }finally{
            if(input != null)
                try {
                    input.close();
            }catch(IOException error) {
                System.out.println("Error: " + error.getMessage());
            }
        }
    }
    
    
}
