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
public class Hoja3_Ej8_1 {
    public static void main(String[] args) {
        int n1;
        int n2;
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;
        
        while(continuar){
            System.out.print("Primer numero: ");
            n1 = sc.nextInt();
            System.out.print("Segundo numero: ");
            n2 = sc.nextInt();
            
            System.out.println("1.Sumar 2.Restar 3.Multiplicar 4.Salir");
            switch (sc.nextInt()){
            case 1 -> //Suma
                System.out.println("El resultado de la suma es: " + (n1+n2));
            case 2 -> //Resta
                System.out.println("El resultado de la resta es: " + (n1-n2));
            case 3 -> //Multiplicación
                System.out.println("El resultado de la multiplicación es: " + (n1*n2));
            case 4 ->{
                System.out.print("Fin del programa");
                continuar = false;
            }
        
        }
        }
    }
}
