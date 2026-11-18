/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioslibro;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author Alumno
 */
public class Excepciones_1 {
    public static void main(String[] args){
        System.out.print("Resultado : " + (leeNumero() + leeNumero()));
    }
    
    /**
     * 
     * @return Numero introducido por el usuario.
     */
    static int leeNumero(){
        int n = 0;
        boolean leido = false;
        Scanner sc = new Scanner(System.in);
        
        do{
        try{
            System.out.print("Introduce un numero entero: ");
            n = sc.nextInt();
            leido = true;
        }catch(InputMismatchException e){
            System.out.println("Entrada no valida");
            sc.nextLine();
        }
        }while(!leido);
        
        return n;
    }
}
