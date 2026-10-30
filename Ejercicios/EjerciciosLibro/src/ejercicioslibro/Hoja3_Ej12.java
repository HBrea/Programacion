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
public class Hoja3_Ej12 {
    public static void main(String[] args) {
        byte aprobados = 0;
        byte condicionados = 0;
        byte suspensos = 0;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Escribe 6 notas: ");
        for(byte x = 1, nota = 0; x <= 6; x++){
            System.out.print(x+ "º nota: ");
            nota = sc.nextByte();
            
            if(nota < 4)
                suspensos++;
            else if(nota == 4)
                condicionados++;
            else if(nota > 4)
                aprobados++;
        }
        
        System.out.println("Alumnos aprobados: " + aprobados);
        System.out.println("Alumnos condicionados: " + condicionados);
        System.out.println("Alumnos suspensos: " + suspensos);
        
    }
}
