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
public class MyThread extends Thread {
    Printer mp;
    
    MyThread(Printer p)
    {
        mp = p;
    }
        
    @Override
         public void run()
        {
            synchronized (mp)
            {
                mp.printDetails("Dar");
            }
            
        }
    }

