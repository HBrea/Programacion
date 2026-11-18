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
public class Excepciones_1V2 {
    public static void main(String[] args){
        int n1=0,n2=0;
        boolean numerosLeidos = false;
        Scanner sc = new Scanner(System.in);
        
        do{
        try{
        n1 = leeNumero();
        n2 = leeNumero();
        numerosLeidos = true;
        }catch(InputMismatchException e){
            System.out.println("Entrada no valida");
        }
        }while(!numerosLeidos);
        
        System.out.print("Resultado : " + (n1 + n2));
    }
    
    /**
     * 
     * @return Numero introducido por el usuario.
     */
    static int leeNumero(){
        int n;
        Scanner sc = new Scanner(System.in);
        
            System.out.print("Introduce un numero entero: ");
            n = sc.nextInt();
        
        return n;
    }
    
}
