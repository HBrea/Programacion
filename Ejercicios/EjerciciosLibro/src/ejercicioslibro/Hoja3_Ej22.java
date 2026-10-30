/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioslibro;

/**
 *
 * @author Alumno
 */
public class Hoja3_Ej22 {
    public static void main(String[] args) {
        int puntoRuptura = (int) (Math.random()*3) +7;
        int estiramiento = 0;
        
        System.out.println("Punto de ruptura en: " + puntoRuptura);
        
        while(estiramiento < puntoRuptura){
            estiramiento = (int) (Math.random()*10)+1;
            
            for(int i = estiramiento; i > 0; i--){
                System.out.print("*");
            }
            System.out.println("    Estiramiento = " + estiramiento);
        }
        System.out.print("La cuerda se ha roto con estiramiento = " + estiramiento);
    }
}
