/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin17;

/**
 *
 * @author propa
 */
public class Boletin17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int[] numeros;
       numeros=new int[6];
       numeros[0]= (int) (Math.random()*50+1);
       numeros[1]= (int) (Math.random()*50+1);
       numeros[2]= (int) (Math.random()*50+1);
       numeros[3]= (int) (Math.random()*50+1);
       numeros[4]= (int) (Math.random()*50+1);
       numeros[5]= (int) (Math.random()*50+1);
      
        System.out.println(numeros[5]);
        System.out.println(numeros[4]);
        System.out.println(numeros[3]);
        System.out.println(numeros[2]);
        System.out.println(numeros[1]);
        System.out.println(numeros[0]);
        
        
       
       
    }
    
}
