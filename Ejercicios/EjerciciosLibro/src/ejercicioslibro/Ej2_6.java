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
public class Ej2_6 {
    public static void main(String[] args) {
        double n1;
        double n2;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Escribe el primer numero: ");
        n1 = sc.nextDouble();
        System.out.print("Escribe el segundo numero: ");
        n2 = sc.nextDouble();
        
        if (n1 > n2) System.out.print(n1 + " es mayor que " + n2);
        else if (n1 < n2) System.out.print(n2 + " es mayor que " + n1);
        else System.out.print(n1 + " y " + n2 + " son iguales");
    }
}
