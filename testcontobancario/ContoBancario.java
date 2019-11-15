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
    int bilanciocc = 0;

    ContoBancario(String ncontocorrente) {
        
        this.ncontocorrente = ncontocorrente;
    }
    
    ContoBancario (String ncontocorrente, int bilanciocc){
        
        this.ncontocorrente = ncontocorrente;
        this.bilanciocc = bilanciocc;
        
        
    }

    public String getNcontocorrente() {
        return ncontocorrente;
    }

    public int getBilanciocc() {
        return bilanciocc;
    }
    
    
    
    public String stampa(){
        return "Numero contocorrente" + ncontocorrente + "Bilancio del conto corrente" + bilanciocc;
    }
    
    public int deposito(int denaro){
        this.bilanciocc = denaro + this.bilanciocc;
        return bilanciocc;
        
        
    }
    
    public int prelievo(int denaro){
        if(bilanciocc>=denaro){
            bilanciocc = this.bilanciocc - denaro;
            //this.bilanciocc -= denaro;
            System.out.println("Puoi prelevare");
            
            
            
        }else{
            System.out.println("Non puoi prelevare");
            
        }
        return bilanciocc;
            
    }
}
