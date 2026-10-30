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
public class Ej1_10 {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    boolean llueve;
    boolean tareasTerminadas;
    boolean necesitaBiblio;
    
    System.out.print("¿Llueve? ");
    llueve = sc.nextBoolean();
    
    System.out.print("¿Has terminado las tareas? ");
    tareasTerminadas = sc.nextBoolean();
    
    System.out.print("¿Necesitas ir a la biblioteca? ");
    necesitaBiblio = sc.nextBoolean();
    
    System.out.print(necesitaBiblio == true || llueve == false && tareasTerminadas == true);
    }
    
}
