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
public class Hoja4_Ej6 {
    public static void main(String[] args){
        char caracter;
        Scanner sc = new Scanner(System.in);
        
        caracter = sc.next();
        System.out.print("¿Es la letra vocal?: " + comprobarVocal(caracter));
    }
    
    static boolean comprobarVocal(char caracter){
     return caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u';
    }
}
