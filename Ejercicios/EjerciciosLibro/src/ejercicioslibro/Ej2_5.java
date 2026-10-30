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
public class Ej2_5 {
    public static void main(String[] args) {
        // TODO code application logic here
    
    int aforo;
    float precioEntrada;
    int entradasVendidas;
    Scanner sc = new Scanner(System.in);
    
    System.out.print("¿De cuanto aforo dispone el local?: ");
    aforo = sc.nextInt();
    System.out.print("¿Cuanto vale cada entrada?");
    precioEntrada = sc.nextFloat();
    System.out.print("¿Cuantas entradas se han vendido?");
    entradasVendidas = sc.nextInt();
    
    if (entradasVendidas < aforo * 0.2) System.out.print("Concierto cancelado");
    else if (entradasVendidas < aforo * 0.5){
        System.out.println("Se aplicara un descuento del 25% al precio de las entradas");
        System.out.print("El total recaudado es: " + entradasVendidas * precioEntrada * 0.75);
    }
    else System.out.print("El total recaudado es: " + entradasVendidas * precioEntrada);
    
    }
}
