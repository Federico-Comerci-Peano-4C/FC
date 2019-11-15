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
class ContoEsteso extends ContoBancario {

    int fido;

    public ContoEsteso(String ncontocorrente) {
        super(ncontocorrente);
        this.fido = 1000;
    }

    ContoEsteso(String ncontocorrente, int bilanciocc) {
        super(ncontocorrente, bilanciocc);
        this.fido = 1000;
    }

    ContoEsteso(String ncontocorrente, int bilanciocc, int fido) {
        super(ncontocorrente, bilanciocc);
        this.fido = fido;

    }

    public int getFido() {
        return fido;
    }

    public void setFido(int fido) {
        this.fido = fido;
    }
    
    @Override
    public int prelievo(int denaro){
        if(getBilanciocc() + getFido() >= denaro){
           bilanciocc = getBilanciocc() - denaro;
            //this.bilanciocc -= denaro;
            System.out.println("Puoi prelevare");
            
            
            
        }else{
            System.out.println("Non puoi prelevare");
            
        }
        return bilanciocc;
            
    }
    
    
    
    
    
    
}
