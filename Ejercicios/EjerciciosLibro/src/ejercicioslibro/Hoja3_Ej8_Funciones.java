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
public class Hoja3_Ej8_Funciones {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1, n2;
        
        System.out.print("Primer numero: ");
        n1 = sc.nextInt();
        
        System.out.print("Segundo numero: ");
        n2 = sc.nextInt();
        
        menu();
        
        switch(sc.nextInt()){
            case 1 ->
                System.out.print("La suma es: " + (n1+n2));
            case 2 ->
                System.out.print("La resta es: " + (n1-n2));
            case 3 -> 
                System.out.print("La multiplicacion es :" + (n1*n2));
            case 4 ->
                System.out.print("Fin del programa");
        }
    }
    
    static void menu(){
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Salir");
            
            
        }
}
