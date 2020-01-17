/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testconflittothread;


import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author comerci.federico
 */
public class Inc1000 extends Thread{
    
    public static int count;
    
    public Inc1000(){
        count = 0;
    }
    
    @Override
    public void run(){
        for (int i = 0; i < 1000; i++) {
            inc1();
            try {
                Thread.sleep(1);
            } catch (InterruptedException ex) {
                Logger.getLogger(Inc1000.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    private synchronized void inc1(){
        count++;
    }
}
