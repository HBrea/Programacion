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
public class Ej2_14 {
        public static void main(String[] args) {
        byte dia;
        byte mes;
        int año;
        Scanner sc = new Scanner(System.in);
        byte diasMes = 0;
        
        System.out.print("Dia: ");
        dia = sc.nextByte();
        System.out.print("Mes: ");
        mes = sc.nextByte();
        System.out.print("Año: ");
        año = sc.nextInt();
        
        switch (mes){
            case 4, 6, 9, 11 -> diasMes = 30;
            case 1, 3, 5, 7, 8, 10, 12 -> diasMes = 31;
            case 2 -> {
                if (año%4 == 0 && año%100 != 0 || año%400 == 0) diasMes = 29;//año bisisto
                else diasMes = 28;//no es bisiesto
            }
        }
        
        dia++;
        if (dia > diasMes){
            dia = 1;
            mes++;
            if (mes > 12){
                mes = 1;
                año++;
            }
        }
        System.out.print(dia + "-" + mes + "-" + año);
    }
}
