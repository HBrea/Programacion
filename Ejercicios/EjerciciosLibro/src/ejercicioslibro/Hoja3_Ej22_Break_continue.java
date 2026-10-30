/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioslibro;

/**
 *
 * @author Alumno
 */
public class Hoja3_Ej22_Break_continue {
    public static void main(String[] args) {
        int puntoRuptura = (int) (Math.random()*3) +7;
        int estiramiento;
        
        System.out.println("Punto de ruptura en: " + puntoRuptura);
        
        while(true){
            estiramiento = (int) (Math.random()*10)+1;
            
            for(int i = estiramiento; i > 0; i--){
                System.out.print("*");
            }
            System.out.println("    Estiramiento = " + estiramiento);
            
            if(estiramiento < puntoRuptura)
                continue;
            
            System.out.print("La cuerda se ha roto con estiramiento = " + estiramiento);
            break;
        }
        
    }
}
