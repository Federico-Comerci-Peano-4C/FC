/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testthread2;

/**
 *
 * @author comerci.federico
 */
public class TestThread2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Say s1 = new Say("Ciao");
        Say s2 = new Say("Hello");
        Say s3 = new Say("Hi");
               
        s1.start();
        s2.start();
        s3.start();
        
    }
    
}
