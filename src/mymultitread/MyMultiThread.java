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
public class MyMultiThread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Printer printer = new Printer();
        printer.printDetails("Kau");
        
        MyThread mt = new MyThread(printer);
        mt.start();
        
//        try {
//            mt.join();
//        } catch (InterruptedException ex) {
//            Logger.getLogger(MyMultiThread.class.getName()).log(Level.SEVERE, null, ex);
//        }
        
        YourThread yt = new YourThread(printer);
        yt.start();
    }
    
}
