/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioslibro;

/**
 *
 * @author Alumno
 */
public class Arrays_Ej7V1 {
    public static void main(String[] args){
        int[] numeros = new int[15];
        
        for(byte i = 0; i < numeros.length; i++){
            numeros[i] = (int) (Math.random()*100)+1;
        }
        
        System.out.println("Maximo: " + maximo(numeros));
        System.out.println("Minimo: " + minimo(numeros));
        
        
    }
    
    static int maximo(int[] t){
        int n = t[0];
        for(byte i = 1; i < t.length; i++){
            if(n < t[i])
                n = t[i];
        }
        return n;
    }
    
    static int minimo(int[] t){
        int n = 100;
        for(byte i = 0; i < t.length; i++){
            if(n > t[i])
                n = t[i];
        }
        
        return n;
    }
}
