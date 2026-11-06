/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioslibro;

import java.util.Scanner;
/**
 *
 * @author hecto
 */
public class Hoja4_Ej4 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double radio, altura;
        byte opcion;
        
        do{
            System.out.println("Menu de opciones:");
            System.out.println("   1. Área de un cilindro");
            System.out.println("   2. Volumen de un cilindro");
            System.out.println("   3. Salir");

            opcion = sc.nextByte();
        }while(opcion > 3 || opcion < 1);
        
        if(opcion != 3){
            System.out.print("Radio de la base: ");
            radio = sc.nextDouble();
            System.out.print("Altura del cilindro: ");
            altura = sc.nextDouble();

            switch(opcion){
                case 1 ->
                    calcularArea(radio, altura);
                case 2 ->
                    calcularVolumen(radio, altura);
            }
        }
        else
            System.out.print("Fin del programa");
    }
    
    /**
     * 
     * @param radio
     * @param altura 
     */
    static void calcularArea(double radio, double altura){
        System.out.print("Area: " + (2*3.14*radio*(altura+radio)));
    }
    
    /**
     * 
     * @param radio
     * @param altura 
     */
    static void calcularVolumen(double radio, double altura){
        System.out.print("Volumen: " + 3.14*radio*radio*altura);   
    }
}
