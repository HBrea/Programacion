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
        int nNumeros = -1;
        int[] numeros;
        
        
        System.out.print("Cuantos numeros vas a introducir: ");
        do{
            nNumeros = leerNumero();
            
            if(nNumeros < 0)
                System.out.println("El numero debe ser positivo");
        }while(nNumeros < 0);
        
        numeros = new int[nNumeros];
        
        //Meter numeros al string
        for(byte i = 0; i < numeros.length; i++){
            System.out.print( (i+1) + "º numero: ");
            numeros[i] = leerNumero();
        }
        
        for(int i = numeros.length; i > 0; i--){
            System.out.println(i + "º numero: " + numeros[i-1]);
        }
        
    }
    
    static int leerNumero(){
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        boolean entradaCorrecta = false;
            do{
            try{
                
                numero = sc.nextInt();
                entradaCorrecta = true;
            }catch(InputMismatchException e){
                System.out.println("El dato debe ser un numero entero");
                sc.nextLine();
            }
            }while(!entradaCorrecta);
            
            return numero;
    }
    
}
