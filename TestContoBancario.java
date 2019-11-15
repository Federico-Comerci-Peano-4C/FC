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

class ContoBancario{
    String ncontocorrente;
    private int bilanciocc = 0;

    ContoBancario(String ncontocorrente) {
        
        this.ncontocorrente = ncontocorrente;
    }
    
    ContoBancario (String ncontocorrente, int bilanciocc){
        
        this.ncontocorrente = ncontocorrente;
        this.bilanciocc = bilanciocc;
        
        
    }
    
    void stampa(){
        System.out.println("Numero contocorrente" + ncontocorrente + "Bilancio del conto corrente" + bilanciocc);
    }
    
    void deposito(int denaro){
        this.bilanciocc = denaro + this.bilanciocc;
        
        
    }
    
    void prelievo(int denaro){
        if(this.bilanciocc>=denaro){
            
        }else{
            System.out.println("Non puoi prelevare");
            
        }
            
    }
    
    
        
    
    
    
}

class ContoEsteso extends ContoBancario{
    int fido = 1000;
    
    public ContoEsteso (String ncontocorrente, int fido){
        
        
        
    }
    
    
    
}












public class TestContoBancario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
