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
public class Ej2_13 {
        public static void main(String[] args) {
        byte hora;
        byte minuto;
        byte segundo;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Horas: ");
        hora = sc.nextByte();
        System.out.print("Minutos: ");
        minuto = sc.nextByte();
        System.out.print("Segundos: ");
        segundo = sc.nextByte();
        
        segundo ++;
        if (segundo > 59) {
            segundo = 0;
            minuto ++;
        }
        if (minuto > 59){
            minuto = 0;
            hora ++;
        }
        if (hora > 23){
            hora = 0;
        }
        
        System.out.print(hora + ":" + minuto + ":" + segundo);
    }
}
