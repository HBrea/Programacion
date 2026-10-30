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
public class Hoja3_Ej21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int resultado = 1;
        int resultadoPotencia = 0;
        System.out.print("Introduce un numero entero: ");
        numero = sc.nextInt();
        
        for(; resultadoPotencia <= numero; resultado++){
            resultadoPotencia = resultado*resultado;
        }
        
        System.out.print("Resultado: " + resultado);
    }
}
