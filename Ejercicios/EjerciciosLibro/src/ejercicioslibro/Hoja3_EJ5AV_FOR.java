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
public class Hoja3_EJ5AV_FOR {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        int resultado;
        
        
        do{
            System.out.print("Escribe un numero entero positivo:");
            n = sc.nextInt();
            resultado = 0;
            
            if(n > 0){
                for (int x = 1; x <= n; x++){
                    if (x % 2 != 0)//x es impar
                        resultado = resultado + x;
                }
            System.out.println("El resultado es: " + resultado);
            }
        }while(n != 0);
    }
}
