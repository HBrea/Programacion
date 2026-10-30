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
public class Hoja3_Ej7_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nAleatorio = (int) (Math.random()*1000) +1;
        int nAdivinado = 0;
        byte intentos;
        
        do{
            System.out.print("Cuantos intentos quieres tener: ");
            intentos = sc.nextByte();
        }while(intentos < 4 || intentos > 10);
        
        System.out.println("Adivina el numero entre el 1 y el 1000: ");
        do
        {
            System.out.println("Quedan " + intentos + " intentos");
            nAdivinado = sc.nextInt();
            
            if (nAdivinado < nAleatorio)
                System.out.println("Demasiado bajo");
            else if (nAdivinado > nAleatorio)
                System.out.println("Demasiado alto");
        
            intentos--;
            
        }while(nAleatorio != nAdivinado && intentos != 0);
        
        if(nAdivinado == nAleatorio)
            System.out.print("Correcto");
        else
            System.out.print("Intentos agotados");
    }
}
