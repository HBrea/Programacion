/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioslibro;

import java.util.*;

/**
 *
 * @author Alumno
 */
public class Ej2_8 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //sc.useLocale(Es);
        double a;
        double b;
        double c;
            
        System.out.print("Escribe la a: ");
        a = sc.nextDouble();
        System.out.print("Escribe la b: ");
        b = sc.nextDouble();
        System.out.print("Escribe la c: ");
        c = sc.nextDouble();
        
        if (a == 0) System.out.print("No existen soluciones posibles (a = 0)");
        else if (b*b-4*a*c < 0) System.out.print("No existen soluciones posibles");
        else {
            System.out.println("X1: " + (-b+Math.sqrt(b*b-4*a*c))/2*a);//solucion raiz cuadrada +
            System.out.print("X2: " + (-b-Math.sqrt(b*b-4*a*c))/2*a);//solucion raiz cuadrada -
        }
    }
}
