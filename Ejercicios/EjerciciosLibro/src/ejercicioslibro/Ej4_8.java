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
public class Ej4_8 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        byte opcion;
        double n1,n2;
        do{
        System.out.println("Suma(1) Resta(2) Multiplicacion(3) Division(4)");
        opcion = sc.nextByte();
        }while(opcion > 4 || opcion < 1);
        System.out.print("Escribe dos numeros reales: ");
        n1 = sc.nextDouble();
        n2 = sc.nextDouble();
        
        System.out.print("Resultado: " + calculadora(opcion,n1,n2));
    }
    
    static double calculadora(byte opcion, double n1, double n2){
        double resultado = 0;
        switch(opcion){
            case 1 ->//suma
                resultado = n1+n2;
            case 2 ->//resta
                resultado = n1-n2;
            case 3 ->//multiplicacion
                resultado = n1*n2;
            case 4 ->//division
                resultado = n1/n2;
        }
        return resultado;
    }
}
