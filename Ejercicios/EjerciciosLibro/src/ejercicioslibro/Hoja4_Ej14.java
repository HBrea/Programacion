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
public class Hoja4_Ej14 {
    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        
        
        do{
        System.out.print("Escribe un numero entero positivo: ");
        n = sc.nextInt();
        }while(n < 0);
        
        
        System.out.print("El resultado es: " + sumaImpares(n));
    }
    
    /**
     * 
     * @param n
     * @return 
     */
    static int sumaImpares(int n){
        int resultado = 0;
        for (int x = 1; x <= n; x++){
            if (x % 2 != 0)//x es impar
                resultado = resultado + x;
        }
        
        return resultado;
    }
}
