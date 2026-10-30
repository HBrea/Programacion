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
public class Hoja3_Ej8 {
    public static void main(String[] args) {
        int n1;
        int n2;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Primer numero: ");
        n1 = sc.nextInt();
        System.out.print("Segundo numero: ");
        n2 = sc.nextInt();
        
        System.out.println("1.Sumar 2.Restar 3.Multiplicar");
        switch (sc.nextInt()){
        case 1 -> //Suma
            System.out.print("El resultado de la suma es: " + (n1+n2));
        case 2 -> //Resta
            System.out.print("El resultado de la resta es: " + (n1-n2));
        case 3 -> //Multiplicación
            System.out.print("El resultado de la multiplicación es: " + (n1*n2));
        default ->
            System.out.print("Fin del programa");
        
        }
    }
}
