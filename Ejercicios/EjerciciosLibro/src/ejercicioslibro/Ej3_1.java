/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioslibro;

import java.util.Scanner;
/**
 *
 * @author Alumno
 */
public class Ej3_1 {
        public static void main(String[] args) {
        int edadMax = 0;
        int edadMin = 127;
        int edadIn = 0;
        Scanner sc = new Scanner(System.in); 
        
        while (edadIn != -1)
        {
            System.out.print("Escribe una edad: ");
            edadIn = sc.nextByte();
            
            if (edadIn >= 0){
                
            if(edadIn > edadMax) edadMax = edadIn;
            if(edadIn < edadMin) edadMin = edadIn;
            
            }
            else System.out.println("Edad invalida");
        }
        System.out.println("La edad maxima es: " + edadMax);
        System.out.println("La edad minima es: " + edadMin);
        
    }
}
