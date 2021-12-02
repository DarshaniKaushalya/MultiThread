/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mymultitread;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Kaushalya
 */
public class Printer {
    
    public void printDetails(String name)
    {
        for(int x=1; x<=5;x++)
        
     {
//            try {
//                Thread.sleep(500);
//            } catch (InterruptedException ex) {
//                Logger.getLogger(Printer.class.getName()).log(Level.SEVERE, null, ex);
//            }
            System.out.println(name +" "+ x);
    
     }
  }
}

