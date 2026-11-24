/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioslibro;

/**
 *
 * @author Alumno
 */
public class Arrays_Ej1 {
    public static void main(String[] args){
        int[] tabla = new int[10];
        int[] t2 = tabla;
        int[] t3 = t2;
        
        System.out.println(tabla + "\n" + t2 + "\n" + t3);
    }
}
