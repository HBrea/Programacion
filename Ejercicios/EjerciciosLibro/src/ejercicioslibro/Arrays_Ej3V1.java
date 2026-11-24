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
public class Arrays_Ej3V1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        byte nNumeros;
        int[] numeros;
        
        System.out.print("Cuantos numeros vas a introducir: ");
        do{
        nNumeros = sc.nextByte();
        }while(nNumeros < 0);
        
        numeros = new int[nNumeros];
        
        
        for(byte i = 0; i < numeros.length; i++){
            System.out.print( (i+1) + "º numero: ");
            numeros[i] = sc.nextInt();
        }
        
        for(int i = numeros.length; i > 0; i--){
            System.out.println(i + "º numero: " + numeros[i-1]);
        }
        
    }
}
