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
public class Hoja3_Ej7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nAleatorio = (int) (Math.random()*1000) +1;
        int nAdivinado;
        
        System.out.print("Adivina el numero entre el 1 y el 1000: ");
        do
        {
            nAdivinado = sc.nextInt();
            
            if (nAdivinado < nAleatorio)
                System.out.println("Demasiado bajo");
            else if (nAdivinado > nAleatorio)
                System.out.println("Demasiado alto");
        
        }while(nAleatorio != nAdivinado);
        
        System.out.print("Correcto");
    }
}
