/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*Programa en java que solicite las notas de las 3 evaluaciones de un alumno, las almacene en un array y si la media de las calificaciones es superior
a 8 modifique el array sumando un punto a cada una de las notas almacenadas*/
package ejercicioslibro;

import java.util.InputMismatchException;
import java.util.Scanner;
/**
 *
 * @author Alumno
 */
public class Ej {
    public static void main(String[] args){
        double[] notas = new double[3];
        Scanner sc = new Scanner(System.in);
        double media;
        
        for(int i = 0; i < notas.length; i++){
            boolean valido = false;
            do{
                try{
                    System.out.print((i+1) + "º Nota: ");
                    notas[i] = sc.nextDouble();
                    valido = true;
                }catch(InputMismatchException e){
                    System.out.println("La nota tiene que ser un numero");
                    sc.nextLine();
                }
            }while(notas[i] < 0 || !valido);
        }
        
        media = calcularMedia(notas);
        
        if (media >= 8){
            System.out.println("La media " + media + " es mayor que 8.");
            subirNotas(notas);
        }
        
        
        
        System.out.println("La media es: " + calcularMedia(notas));
        
    }
    
    /**
     * 
     * @param notas
     * @return 
     */
    static double calcularMedia(double[] notas){
        double media = 0;
        
        for(int i = 0; i < notas.length; i++){
            media += notas[i];
        }
        media = media / notas.length;
        
        return media; 
                        
    }
    
    /**
     * 
     * @param notas 
     */
    static void subirNotas(double[] notas){
        
        for(int i = 0; i < notas.length; i++){
                notas[i]++;
            }
        
        System.out.println("Las nuevas notas son: ");
        for(int i = 0; i < notas.length; i++){
            System.out.println((i+1) + "º: " + notas[i]);
        }
        
    }
    
}
