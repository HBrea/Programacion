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
public class Hoja4_Ej3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double radio, altura;
        byte opcion;
        
        System.out.print("Radio de la base: ");
        radio = sc.nextDouble();
        System.out.print("Altura del cilindro: ");
        altura = sc.nextDouble();
        do{
        System.out.println("Area(1) o Volumen(2)");
        opcion = sc.nextByte();
        }while(opcion > 2 && opcion < 1);
        
        calculo(opcion, radio, altura);
    }
    
    /**
     * git
     * @param opcion 
     * @param radio
     * @param altura 
     */
    static void calculo(byte opcion, double radio, double altura){
        
        switch(opcion){
            case 1 ->//Area
                System.out.print("Area: " + (2*3.14*radio*(altura+radio)));
            case 2 ->//Volumen
                System.out.print("Volumen: " + 3.14*radio*radio*altura);                
        }
    }
}
