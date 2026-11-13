/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioslibro;

/**
 *
 * @author Alumno
 */
public class Hoja4_Ej8 {
    public static void main(String[] args){
        System.out.println(""+suma(12,4));
        System.out.println(""+suma(12.6,4.12));
        System.out.println(""+suma(12.4,4,9.45));
    }
    
    /**
     * 
     * @param n1
     * @param n2
     * @return 
     */
    static int suma(int n1, int n2){
        return n1+n2;
    }
    /**
     * 
     * @param n1
     * @param n2
     * @return 
     */
    static double suma(double n1, double n2){
        return n1+n2;
    }
    /**
     * 
     * @param n1
     * @param n2
     * @param n3
     * @return 
     */
    static double suma(double n1,double n2,double n3){
        return n1+n2+n3;
    }
}
