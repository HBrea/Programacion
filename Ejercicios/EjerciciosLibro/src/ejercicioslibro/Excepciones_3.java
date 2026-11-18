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
public class Excepciones_3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean correcto = false;
        
        do{
        try{
            System.out.println("Escribe dos numeros enteros: ");
            System.out.print("Resultado: " + (sc.nextInt() / sc.nextInt()));
            correcto = true;
        }
        catch(ArithmeticException e){
            System.out.println("Entrada no valida");
        }
        }while(!correcto);
    }
}
