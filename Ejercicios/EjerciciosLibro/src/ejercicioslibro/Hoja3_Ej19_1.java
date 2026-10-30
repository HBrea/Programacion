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
public class Hoja3_Ej19_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vProhibido = (int) (Math.random() * 6) +1;
        int tirada = 1;
        int vAcumulado = 0;
        int nMaxTiradas;
        int nDado = 0;
                
        System.out.print("Cuantas tiradas quieres tener: ");
        nMaxTiradas = sc.nextInt();
        
        for(; nDado != vProhibido && nMaxTiradas >= tirada; tirada++){
            nDado = (int) (Math.random() * 6) +1;
            vAcumulado = vAcumulado + nDado;
            System.out.println("Tirada " + tirada + ": has sacado " + nDado + " (Total: " + vAcumulado + ")");
        }
        if(nDado == vProhibido)
        System.out.println("Ha salido el valor prohibido (" + vProhibido + ")");
        else
        System.out.print("Te has quedado sin tiradas");
            
        System.out.println("");
        System.out.println("Juego terminado");
        System.out.println("Tiradas válidas: " + (tirada-1));
        System.out.print("Total acumulado: " + vAcumulado + " puntos");
    }
}
