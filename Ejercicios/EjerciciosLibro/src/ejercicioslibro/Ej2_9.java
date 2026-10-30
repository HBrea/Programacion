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
public class Ej2_9 {
    public static void main(String[] args) {
        int numero;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce un numero del 0 al 99.999");
        numero = sc.nextInt();
        
        if (numero < 0) numero = numero * -1;
        
        if (numero < 10) System.out.print("Tiene una cifra");
        else if (numero < 100) System.out.print("Tiene dos cifras");
        else if (numero < 1000) System.out.print("Tiene tres cifras");
        else if (numero < 10000) System.out.print("Tiene cuatro cifras");
        else if (numero < 100000) System.out.print("Tiene cinco cifras");
        else System.out.print("Numero invalido");
    }
}
