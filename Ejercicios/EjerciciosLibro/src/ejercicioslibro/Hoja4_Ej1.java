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
public class Hoja4_Ej1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1, n2;
        
        n1 = sc.nextInt();
        
        n2 = sc.nextInt();
        
        suma(n1,n2);
    }
    
    static void suma(int n1, int n2){
        System.out.print("El resultado es" + (n1+n2));
    }
}
