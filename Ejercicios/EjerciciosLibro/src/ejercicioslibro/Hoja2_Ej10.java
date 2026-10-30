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
public class Hoja2_Ej10 {
        public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Introduce el numero: ");
        n = sc.nextInt();
        
        n = n > 0 ? n : n*-1;
        System.out.print("El valor absoluto es: " + n);
    }
}
