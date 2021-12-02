/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mymultitread;

/**
 *
 * @author Kaushalya
 */
public class YourThread extends Thread{
        Printer mp;
    
    YourThread(Printer p)
    {
        mp = p;
    }
        
    @Override
         public void run()
        {
            synchronized(mp){
                 mp.printDetails("Darshani");
            }
           
        }
}
