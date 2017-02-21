/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.graph;

import java.util.Comparator;

/** A class for comparing 2 edges.
 *  @author Koffman and Wolfgang
 */

public class CompareEdges
    implements Comparator < Edge > {
  @Override
  public int compare(Edge e1, Edge e2) {
    return Double.compare(e1.getWeight(), e2.getWeight());
  }
}
