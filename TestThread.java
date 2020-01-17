/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testthread;

/**
 *
 * @author comerci.federico
 */
public class TestThread {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Hello h1 = new Hello();
        Hi h2 = new Hi();

        h1.start();
        h2.start();
    }

}
