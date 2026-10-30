/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioslibro;

/**
 *
 * @author Alumno
 */
public class Hoja3_Ej13 {
    public static void main(String[] args) {
        byte n1 = 1;
        byte n2 = 1;
        while(n1 < 11){
            System.out.println(n1 + " x " + n2 + " = " + n1*n2);
            n2++;
            if(n2 > 10){
                n1++;
                n2 = 1;
            }
        }
    }
}
