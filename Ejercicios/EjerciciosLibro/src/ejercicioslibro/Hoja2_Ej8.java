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
public class Hoja2_Ej8 {
        public static void main(String[] args) {
        float comidaDiaria;
        float kilosPorAnimal;
        int numAnimales;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Comida diaria: ");
        comidaDiaria = sc.nextFloat();
        System.out.print("Kilos por animal: ");
        kilosPorAnimal = sc.nextFloat();
        System.out.print("Numero de animales: ");
        numAnimales = sc.nextInt();
        
        if (comidaDiaria < 0 || kilosPorAnimal < 0 || numAnimales < 1) System.out.print("Datos invalidos");
        else if (comidaDiaria < kilosPorAnimal * numAnimales)
        {
            System.out.println("No hay comida suficiente");
            System.out.print("Cada animal debera comer: " + comidaDiaria / numAnimales);
            
        }
        else System.out.print("Hay comida suficiente");
    }
}
