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
public class Hoja3_Ej18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1, n2;
        
        System.out.print("Introduce dos numeros enteros positivos: ");
        n1 = sc.nextInt();
        do{
            n2 = sc.nextInt();
            if(n2 < n1)
                System.out.print("El segundo numero debe ser mayor que el primero: ");
        }while(n2 < n1);
        
        for(int numero = n1; numero <= n2; numero++){
            boolean esPrimo = true;
            for(int divisor = 2; divisor < numero && esPrimo; divisor++){
            if(numero % divisor == 0) //si es true no puede ser primo
                esPrimo = false;
            
            }
            if(esPrimo)
                System.out.print(numero + " ");
        }
    }
}
