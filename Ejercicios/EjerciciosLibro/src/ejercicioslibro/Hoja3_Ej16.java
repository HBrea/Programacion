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
public class Hoja3_Ej16 {
    public static void main(String[] args) {
        byte n;
        Scanner sc = new Scanner(System.in);
        
        n = sc.nextByte();
        
        while(n > 0){
            for(byte i = n; i > 0; i--){
                System.out.print("* ");
            }
            System.out.println("");
            n--;
        }
    }
}
