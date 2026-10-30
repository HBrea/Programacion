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
public class Ej2_10 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        byte nota;
        
        System.out.print("Escribe la nota: ");
        nota = sc.nextByte();
        /* Solucion 1
        switch (nota){
            case 0,1,2,3,4 ->
                System.out.print("Insuficiente");
            case 5 ->
                System.out.print("Suficiente");
            case 6 ->
                System.out.print("Bien");
            case 7,8 ->
                System.out.print("Notable");
            case 9,10 ->
                    System.out.print("Sobresaliente");
        }
        */
        
        if (nota < 5) System.out.print("Insuficiente");
        else if (nota == 5) System.out.print("Suficiente");
        else if (nota == 6) System.out.print("Bien");
        else if (nota < 9) System.out.print("Notable");
        else System.out.print("Sobresaliente");
        
    }
}
