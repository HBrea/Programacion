/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioslibro;

/**
 *
 * @author Alumno
 */
public class Arrays_Ej5 {
    public static void main(String[] args){
        int[] t = {1,2,5,4};
        
        System.out.println("" + maximo(t));
    }
    
    static int maximo(int[] t){
        int n = t[0];
        for(byte i = 1; i < t.length; i++){
            if(n < t[i])
                n = t[i];
        }
        return n;
    }
}
