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
public class Hoja3_Ej17 {
    public static void main(String[] args) {
        byte n;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Base y altura del triangulo: ");
        n = sc.nextByte();
        
        for(byte x = n; x >= 0 ; x--){
            
            //escribe espacios
            for(byte i = x; i > 0; i--){
                    System.out.print(" ");
            }
            
            //escribe *
            for(int i = n-x; i > 0; i--){        
                System.out.print("* ");
            }
            System.out.println("");
            
        }
    }
}
