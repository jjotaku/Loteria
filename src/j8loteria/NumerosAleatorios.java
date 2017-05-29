/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j8loteria;

import java.util.Arrays;

/**
 *
 * @author dam121
 */
public class NumerosAleatorios {
    private int maximo;
    private int[] numero;
    
    public NumerosAleatorios() throws Exception{
       maximo=5;
        
        this.maximo = maximo;
        numero=new int[maximo];
        
        for (int i=0;i<maximo;i++){
            int r = 0;
            do{
             r =(int)Math.floor(Math.random()*(50-1+1)+1);
            
            numero[i]=r;
            }while(comprobar(r,i));
        }
        
        Arrays.sort(numero);
    }

    public String getNumeros() {
        
        return numero[0]+" "+numero[1]+" "+numero[2]+" "+numero[3];
    }
    public String getReintegro() {
        numero[4]=(int)(Math.random()*9+1);
        return "\n"
                + "El reintegro es " +numero[4];
    }
    private boolean comprobar(int numero,int contador){
        int numero2=0;
        boolean existe = false;
        for(int i=0;i<contador;i++){
            numero2=this.numero[i];
        if(numero==numero2){
            existe = true;
        }}
        
                return existe;
    }
    
}
