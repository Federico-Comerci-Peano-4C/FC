/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testcontobancario;

/**
 *
 * @author comerci.federico
 */
public class TestContoBancario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ContoBancario cb1 = new ContoBancario("Conto");
        ContoBancario cb2 = new ContoBancario("Conto", 2564);
        ContoEsteso cs1 = new ContoEsteso("Conto");
        ContoEsteso cs2 = new ContoEsteso("Conto", 2564);
        ContoEsteso cs3 = new ContoEsteso("Conto", 2564, 724);
        
        System.out.println(cb1.getNcontocorrente());
        System.out.println(cb2.getNcontocorrente());
        System.out.println(cs1.getNcontocorrente());
        System.out.println(cs2.getNcontocorrente());
        System.out.println(cs3.getNcontocorrente());
        
        System.out.println(cb1.getBilanciocc());
        System.out.println(cb2.getBilanciocc());
        System.out.println(cs1.getBilanciocc());
        System.out.println(cs2.getBilanciocc());
        System.out.println(cs3.getBilanciocc());
        
        System.out.println(cb1.stampa());
        System.out.println(cb2.stampa());
        System.out.println(cs1.stampa());
        System.out.println(cs2.stampa());
        System.out.println(cs3.stampa());
        
        System.out.println(cb1.deposito(1234));
        System.out.println(cb2.deposito(7452));
        System.out.println(cs1.deposito(7472));
        System.out.println(cs2.deposito(8352));
        System.out.println(cs3.deposito(1743));
        
        System.out.println(cb1.prelievo(1234));
        System.out.println(cb2.prelievo(7452));
        System.out.println(cs1.prelievo(7472));
        System.out.println(cs2.prelievo(8352));
        System.out.println(cs3.prelievo(1743));
        
        
        
        System.out.println(cs1.getFido());
        System.out.println(cs2.getFido());
        System.out.println(cs3.getFido());
        
        
        cs1.setFido(7472);
        cs2.setFido(7472);
        cs3.setFido(7472);
        
        
        
        
    }

}
