/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.graph;

import java.io.File;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
/**
 *
 * @author Akbar Aziz
 */
public class TestAlgorithms {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int pred[] = new int[1000000] ;
        double dist[] = new double[1000000] ;
        double stTime, endTime;
        
        System.out.println("\n------------------------------------------------\n");
        System.out.println("------------------ListGraph Test----------------");
        System.out.println("\n------------------------------------------------\n");
        
        ListGraph[] listGraphs= new ListGraph[20];
        listGraphs[0] = readListGraph("graphs/Graph10_0.2.xml");
        listGraphs[1] = readListGraph("graphs/Graph10_0.5.xml");
        listGraphs[2] = readListGraph("graphs/Graph10_0.75.xml");
        listGraphs[3] = readListGraph("graphs/Graph10_0.8.xml");
        listGraphs[4] = readListGraph("graphs/Graph50_0.2.xml");
        listGraphs[5] = readListGraph("graphs/Graph50_0.5.xml");
        listGraphs[6] = readListGraph("graphs/Graph50_0.75.xml");
        listGraphs[7] = readListGraph("graphs/Graph50_0.8.xml");
        listGraphs[8] = readListGraph("graphs/Graph100_0.2.xml");
        listGraphs[9] = readListGraph("graphs/Graph100_0.5.xml");
        listGraphs[10] = readListGraph("graphs/Graph100_0.75.xml");
        listGraphs[11] = readListGraph("graphs/Graph100_0.8.xml");
        listGraphs[12] = readListGraph("graphs/Graph500_0.2.xml");
        listGraphs[13] = readListGraph("graphs/Graph500_0.5.xml");
        listGraphs[14] = readListGraph("graphs/Graph500_0.75.xml");
        listGraphs[15] = readListGraph("graphs/Graph500_0.8.xml");
        listGraphs[16] = readListGraph("graphs/Graph1000_0.2.xml");
        listGraphs[17] = readListGraph("graphs/Graph1000_0.5.xml");
        listGraphs[18] = readListGraph("graphs/Graph1000_0.75.xml");
        listGraphs[19] = readListGraph("graphs/Graph1000_0.8.xml");
        
        for(int i= 0;i <20; ++i){
            stTime = System.nanoTime();
            DijkstrasAlgorithm.dijkstrasAlgorithm(listGraphs[i], 1 ,pred, dist);
            endTime = System.nanoTime();
            System.out.println("The time spent for using Diskstras Algorithm "
                    + "on graph " + i + " is: "+(endTime-stTime)+" uS");
        }
        System.out.println("\n------------------------------------------------\n");
        for(int i= 0;i <20; ++i){
            stTime = System.nanoTime();
            PrimsAlgorithm.primsAlgorithm(listGraphs[i], 1);
            endTime = System.nanoTime();
            System.out.println("The time spent for using Prims Algorithm "
                    + "on graph " + i + " is: "+(endTime-stTime)+" uS");
        }
        System.out.println("\n------------------------------------------------\n");
        System.out.println("------------------MatrixGraph Test----------------");
        System.out.println("\n------------------------------------------------\n");
        
        MatrixGraph[] matrixGraphs= new MatrixGraph[20];
        matrixGraphs[0] = readMatrixGraph("graphs/Graph10_0.2.xml");
        matrixGraphs[1] = readMatrixGraph("graphs/Graph10_0.5.xml");
        matrixGraphs[2] = readMatrixGraph("graphs/Graph10_0.75.xml");
        matrixGraphs[3] = readMatrixGraph("graphs/Graph10_0.8.xml");
        matrixGraphs[4] = readMatrixGraph("graphs/Graph50_0.2.xml");
        matrixGraphs[5] = readMatrixGraph("graphs/Graph50_0.5.xml");
        matrixGraphs[6] = readMatrixGraph("graphs/Graph50_0.75.xml");
        matrixGraphs[7] = readMatrixGraph("graphs/Graph50_0.8.xml");
        matrixGraphs[8] = readMatrixGraph("graphs/Graph100_0.2.xml");
        matrixGraphs[9] = readMatrixGraph("graphs/Graph100_0.5.xml");
        matrixGraphs[10] = readMatrixGraph("graphs/Graph100_0.75.xml");
        matrixGraphs[11] = readMatrixGraph("graphs/Graph100_0.8.xml");
        matrixGraphs[12] = readMatrixGraph("graphs/Graph500_0.2.xml");
        matrixGraphs[13] = readMatrixGraph("graphs/Graph500_0.5.xml");
        matrixGraphs[14] = readMatrixGraph("graphs/Graph500_0.75.xml");
        matrixGraphs[15] = readMatrixGraph("graphs/Graph500_0.8.xml");
        matrixGraphs[16] = readMatrixGraph("graphs/Graph1000_0.2.xml");
        matrixGraphs[17] = readMatrixGraph("graphs/Graph1000_0.5.xml");
        matrixGraphs[18] = readMatrixGraph("graphs/Graph1000_0.75.xml");
        matrixGraphs[19] = readMatrixGraph("graphs/Graph1000_0.8.xml");
        
        for(int i= 0;i <20; ++i){
            stTime = System.nanoTime();
            DijkstrasAlgorithm.dijkstrasAlgorithm(matrixGraphs[i], 1 ,pred, dist);
            endTime = System.nanoTime();
            System.out.println("The time spent for using Diskstras Algorithm "
                    + "on graph " + i + " is: "+(endTime-stTime)+" uS");
        }
        System.out.println("\n------------------------------------------------\n");
        for(int i= 0;i <20; ++i){
            stTime = System.nanoTime();
            PrimsAlgorithm.primsAlgorithm(matrixGraphs[i], 1);
            endTime = System.nanoTime();
            System.out.println("The time spent for using Prims Algorithm "
                    + "on graph " + i + " is: "+(endTime-stTime)+" uS");
        }
        
   
    }
    
    public static ListGraph readListGraph(String fileName){
        ListGraph theGraph = null;
        int sorce=0;
        int dest;
        double weight;
        String[] tmp;
        try {	
            File inputFile = new File(fileName);
            DocumentBuilderFactory dbFactory 
               = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
 
            NodeList nList = doc.getElementsByTagName("Vertex");
            theGraph = new ListGraph(nList.getLength(), false);
            nList = doc.getElementsByTagName("Edge");

            for (int temp = 0; temp < nList.getLength(); temp++) {
               Node nNode = nList.item(temp);
               
               if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                  Element eElement = (Element) nNode;
                  
                  tmp = eElement.getAttribute("V1").split("[a-zA-Z]+");
                  sorce=Integer.parseInt(tmp[1])-1;
                  
                  tmp = eElement.getAttribute("V2").split("[a-zA-Z]+");
                  dest=Integer.parseInt(tmp[1])-1;
                  
                  tmp[0] = eElement.getAttribute("Weight");
                  weight=Double.parseDouble(tmp[0]);
                  
                  theGraph.insert(new Edge(sorce,dest,weight));
               }
            }
         } catch (Exception e) {
            e.printStackTrace();
         }
        
        return theGraph;
    }
    
    public static MatrixGraph readMatrixGraph(String fileName){
        MatrixGraph theGraph = null;
        int sorce;
        int dest;
        double weight;
        String[] tmp;
        try {	
            File inputFile = new File(fileName);
            DocumentBuilderFactory dbFactory 
               = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
            Document doc = dBuilder.parse(inputFile);
            doc.getDocumentElement().normalize();
 
            NodeList nList = doc.getElementsByTagName("Vertex");
            theGraph = new MatrixGraph(nList.getLength(), false);
            nList = doc.getElementsByTagName("Edge");
            
            for (int temp = 0; temp < nList.getLength(); temp++) {
               Node nNode = nList.item(temp);
               
               if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                  Element eElement = (Element) nNode;
                  
                  tmp = eElement.getAttribute("V1").split("[a-zA-Z]+");
                  sorce=Integer.parseInt(tmp[1])-1;
                  
                  tmp = eElement.getAttribute("V2").split("[a-zA-Z]+");
                  dest=Integer.parseInt(tmp[1])-1;
                  
                  tmp[0] = eElement.getAttribute("Weight");
                  weight=Double.parseDouble(tmp[0]);
                  
                  theGraph.insert(new Edge(sorce,dest,weight));
               }
            }
         } catch (Exception e) {
            e.printStackTrace();
         }
        
        return theGraph;
    }
    
}
