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
public class Hoja3_Ej3 {
    public static void main(String[] args) {
        int numero;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Escribe un numero entero: ");
        numero = sc.nextInt();
        
        if (numero < 0)numero = numero * -1;
        
        while(numero >= 0){
            System.out.println(numero);
            numero --;
        }
        
        System.out.print("¡Despegue!");
    }
}
