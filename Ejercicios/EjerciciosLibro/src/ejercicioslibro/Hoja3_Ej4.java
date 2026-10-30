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
public class Hoja3_Ej4 {
    public static void main(String[] args) {
        double base;
        int exponente;
        double resultado;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Base: ");
        base = sc.nextDouble();
        do{
        System.out.print("Exponente: ");
        exponente = sc.nextInt();
        }while(exponente < 0);
        
        resultado = base;
        
        while(exponente > 1){
            resultado = resultado * base;
            exponente --;
        }
        
        if(exponente == 0) resultado = 1;
        
        System.out.print("La potencia es: " + resultado);
    }
}
