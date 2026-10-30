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
public class Hoja3_Ej5AV {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        int x = 1;
        int resultado = 0;
        
        do{
        System.out.print("Escribe un numero entero positivo:");
        n = sc.nextInt();
        }while(n < 0);
        
        while (x <= n){
            if (x % 2 != 0)//x es impar
                resultado = resultado + x;
            x++;
        }
        System.out.print("El resultado es: " + resultado);
    }
}
