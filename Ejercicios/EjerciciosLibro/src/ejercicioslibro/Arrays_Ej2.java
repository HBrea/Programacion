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
public class Arrays_Ej2 {
    public static void main(String[] args){
        int[] a = new int[6];
        Scanner sc = new Scanner(System.in);
        
        for(byte i = 0; i < a.length; i++){
            
            boolean datoCorrecto = false;
            do{
                System.out.print((i+1) + "º valor: ");
                try{
                    a[i] = sc.nextInt();
                    datoCorrecto = true;
                }catch(InputMismatchException e){
                     System.out.println("El dato debe ser un numero entero");
                     sc.nextLine();
                }
            }while(!datoCorrecto);
    }
        for(byte i = 0; i < a.length; i++){
            System.out.println((i+1) + "º numero: " + a[i]);
        }
    }
    
}
