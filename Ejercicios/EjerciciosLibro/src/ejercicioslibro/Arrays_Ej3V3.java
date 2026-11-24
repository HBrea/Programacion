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
public class Arrays_Ej3V3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        byte nNumeros = -1;
        int[] numeros;
        
        
        do{
            try{
                System.out.print("Cuantos numeros vas a introducir: ");
                nNumeros = sc.nextByte();
            }catch(InputMismatchException e){
                System.out.println("El dato debe ser un numero entero positivo");
                sc.nextLine();
            }
        }while(nNumeros < 0);
        
        numeros = new int[nNumeros];
        
        
        for(byte i = 0; i < numeros.length; i++){
            boolean entradaCorrecta = false;
            do{
            try{
                System.out.print( (i+1) + "º numero: ");
                numeros[i] = sc.nextInt();
                entradaCorrecta = true;
            }catch(InputMismatchException e){
                System.out.println("El dato debe ser un numero entero");
                sc.nextLine();
            }
            }while(!entradaCorrecta);
        }
        
        for(int i = numeros.length; i > 0; i--){
            System.out.println(i + "º numero: " + numeros[i-1]);
        }
        
    }
    
    static int leerNumero(){
        
    }
    
}
