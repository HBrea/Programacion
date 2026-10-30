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
public class Ej1_19 {
    public static void main(String[] args) {
        final double precioAdulto = 20;
        final double precioInfantil = 15.50;
        final byte porcentajeDescuento = 5;
        Scanner sc = new Scanner(System.in);
        byte entradasAdulto;
        byte entradasInfantil;
        
        System.out.print("¿Cuantas entradas de adulto?: ");
        entradasAdulto = sc.nextByte();
        System.out.print("¿Cuantas entradas infantiles?: ");
        entradasInfantil = sc.nextByte();
        
        double importeTotal = entradasAdulto * precioAdulto + 
                                entradasInfantil * precioInfantil;
        
        if (importeTotal >= 100){
            double descuento = importeTotal*porcentajeDescuento/100;
            System.out.println("Se te aplica un descuento de " + descuento + "€");
            importeTotal = importeTotal - descuento;
        }
        
        System.out.print("El importe total es: " + importeTotal + "€");
        
    }
}
