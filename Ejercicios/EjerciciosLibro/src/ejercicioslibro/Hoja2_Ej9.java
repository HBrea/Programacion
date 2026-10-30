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
public class Hoja2_Ej9 {
        public static void main(String[] args) {
    double base;
    double altura;
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Base: ");
    base = sc.nextDouble();
    System.out.print("Altura: ");
    altura = sc.nextDouble();
    
    if (base < 0 || altura < 0){
        System.out.print("Datos no validos");
    }
    else{
        System.out.print("El area es: " + base*altura/2);
    }
        }  
}
