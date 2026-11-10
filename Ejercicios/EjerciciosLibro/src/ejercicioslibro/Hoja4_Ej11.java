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
public class Hoja4_Ej11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        byte opcion;
        double n1,n2;
        do{
            do{
                opcion = menu();
                if(opcion > 5 || opcion < 1) System.out.println("OPCIÓN NO VÁLIDA");
            }while(opcion > 5 || opcion < 1);
            if(opcion != 5){
                System.out.print("Escribe dos numeros reales: ");
                n1 = sc.nextDouble();
                n2 = sc.nextDouble();

                System.out.println("Resultado: " + calculadora(opcion,n1,n2));
            }
            else
                System.out.print("Fin del programa.");
        }while(opcion !=5);
    }
    
    /**
     * 
     * @param opcion
     * @param n1
     * @param n2
     * @return 
     */
    static double calculadora(byte opcion, double n1, double n2){
        double resultado = 0;
        switch(opcion){
            case 1 ->//suma
                resultado = suma(n1,n2);
            case 2 ->//resta
                resultado = resta(n1,n2);
            case 3 ->//multiplicacion
                resultado = multiplicacion(n1,n2);
            case 4 ->//division
                resultado = division(n1,n2);
        }
        return resultado;
    }
    
    /**
     * 
     * @param n1
     * @param n2
     * @return 
     */
    static double suma(double n1, double n2){
        double resultado = n1+n2;
        return resultado;
    }
    
    /**
     * 
     * @param n1
     * @param n2
     * @return 
     */
    static double resta(double n1, double n2){
        double resultado = n1-n2;
        return resultado;
    }
    
    /**
     * 
     * @param n1
     * @param n2
     * @return 
     */
    static double multiplicacion(double n1, double n2){
        double resultado = n1*n2;
        return resultado;
    }
    
    /**
     * 
     * @param n1
     * @param n2
     * @return 
     */
    static double division(double n1, double n2){
        double resultado = n1/n2;
        return resultado;
    }
    
    /**
     * 
     * @return 
     */
    static byte menu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("CALCULADORA BÁSICA NÚMEROS REALES \n\nMenú de operaciones:");
        System.out.println("Suma(1) \nResta(2) \nMultiplicacion(3) \nDivision(4) \nSalir del programa(5)");
        System.out.print("\nElige una opción: ");
        byte opcion = sc.nextByte();
        return opcion;
    }
}
