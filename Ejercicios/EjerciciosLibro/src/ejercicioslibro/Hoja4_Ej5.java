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
public class Hoja4_Ej5 {
    public static void main(String[] args){
        int n1,n2;
        Scanner sc = new Scanner(System.in);
        
        n1 = sc.nextInt();
        n2 = sc.nextInt();
        
        System.out.print("El valor mas alto es: " + vMax(n1,n2));
    }
    
    /**
     * 
     * @param n1
     * @param n2
     * @return 
     */
    static int vMax(int n1, int n2){
        int max;
        if(n1 > n2) max = n1;
        else max = n2;
        return max;
    }
}
