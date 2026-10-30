/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioslibro;

import java.util.Scanner;
/**
 *
 * @author hecto
 */
public class Hoja3_Ej9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        
        System.out.print("Escribe un numero entero positivo: ");
        n = sc.nextInt();
        
        do{
        System.out.println(n%10);
        n = n/10;
        }while(n !=0);
    }
}
