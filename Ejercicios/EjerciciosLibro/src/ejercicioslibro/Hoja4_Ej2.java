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
public class Hoja4_Ej2 {
    static public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1,n2;
        
        System.out.print("Primer numero entero: ");
        n1 = sc.nextInt();
        do{
        System.out.print("Segundo numero entero: ");
        n2 = sc.nextInt();
        }while(n2 < n1);
        
        num(n1,n2);
    }
    
    /**
     * 
     * @param n1 primer numero entero
     * @param n2 segundo numero entero
     */
    static void num(int n1, int n2){
        
        for(int i = n1+1; i < n2; i++){
            System.out.print(i + " ");
        }
    }
}
