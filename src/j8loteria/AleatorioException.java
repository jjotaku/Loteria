/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j8loteria;

/**
 *
 * @author dam121
 */
public class AleatorioException extends Exception {
    private int n;
    
    public AleatorioException(int n) {
        this.n=n;
    }
    
    @Override
    public String getMessage(){
        switch(n){
            case 1:return "Numero negativo";
            case 2:return "Numero mayor que 4";
            default:return "inesperado";
        }
    }
}
