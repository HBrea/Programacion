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
public class Hoja4_Ej4V2 {

    /* Función que calcula el área de un cilindro */
    static double calcularArea(float radio, float altura) {
        double resultado;
        resultado = 2 * Math.PI * radio * (altura + radio);
        return resultado;
    }

    /* Función que calcula el volumen de un cilindro */
    static double calcularVolumen(float radio, float altura) {
        double resultado;
        resultado = Math.PI * radio * radio * altura;
        return resultado;

        // Las tres instrucciones de arriba se podrían sustituir por:
        // return Math.PI * radio * radio * altura;
    }

    /* Función que muestra el menú de opciones y devuelve la opción 
       elegida por el usuario */
    static void menuOpciones() {
            System.out.println("Menú de opciones:");
            System.out.println("1. Área del cilindro");
            System.out.println("2. Volumen del cilindro");
            System.out.println("3. Cerrar");
    }

    /* FUNCIÓN PRINCIPAL */
    public static void main(String[] args) {
        float radio, altura;
        byte opcion;
        Scanner teclado = new Scanner(System.in);
        
        menuOpciones();
        do{
        opcion = teclado.nextByte();
        }while(opcion < 1 || opcion > 3);
        
        if(opcion != 3){
        // Solicito  y valido el valor del radio
            do {
                System.out.println("Introduzca el radio:");
                radio = teclado.nextFloat();
                if (radio <= 0) {
                    System.out.println("El valor debe ser >0");
                }
            } while (radio <= 0);

            // Solicito  y valido el valor de la altura        
            do {
                System.out.println("Introduzca la altura:");
                altura = teclado.nextFloat();
                if (altura <= 0) {
                    System.out.println("El valor debe ser >0");
                }
            } while (altura <= 0);


            /* No es necesario asignar el valor a opción, se puede poner la llamada
            a la función directametne en el switch        */
            //opcion = menuOpciones();
            //switch (opcion)            
            switch (opcion) {
                case 1 ->
                    System.out.print("El area de este cilindro es: " + calcularArea(radio, altura));
                case 2 ->
                    System.out.print("El volumen de este cilindro es: " + calcularVolumen(radio, altura));

            }
        }
        else System.out.print("Programa cerrado");
    }
}