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
public class Ej2_12 {
        public static void main(String[] args) {
        byte dia;
        int año;
        byte mes;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Dia: ");
        dia = sc.nextByte();
        System.out.print("Mes: ");
        mes = sc.nextByte();
        System.out.print("Año");
        año = sc.nextInt();
        
        if (mes > 12 || dia < 1) System.out.print("Fecha incorrecta");
        else {
            switch (mes){
                case 4, 6, 9, 11://meses de 30 dias
                    if (dia < 31) System.out.print("Fecha valida");
                    else System.out.print("Fecha invalida");
                    break;
                case 1, 3, 5, 7, 8, 10, 12://neses de 31 dias
                    if (dia < 32) System.out.print("Fecha valida");
                    else System.out.print("Fecha invalida");
                    break;
                case 2://febrero
                    if (año % 4 == 0 && año % 100 != 0 || año % 400 == 0){ //es bisiesto
                        if (dia < 30) System.out.print("Fecha valida");
                        else System.out.print("Fecha invalida");
                    }
                    else { //no es bisiesto
                        if (dia < 29) System.out.print("Fecha valida");
                        else System.out.print("Fecha invalida");
                    }
                 
        }     
        }
        
    }
    
}
