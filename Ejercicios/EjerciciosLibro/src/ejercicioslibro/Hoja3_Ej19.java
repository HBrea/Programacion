/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioslibro;

/**
 *
 * @author Alumno
 */
public class Hoja3_Ej19 {
    public static void main(String[] args) {
        int vProhibido = (int) (Math.random() * 6) +1;
        int tirada = 1;
        int vAcumulado = 0;
        for(int nDado = 0; nDado != vProhibido; tirada++){
            nDado = (int) (Math.random() * 6) +1;
            vAcumulado = vAcumulado + nDado;
            System.out.println("Tirada " + tirada + ": has sacado " + nDado + " (Total: " + vAcumulado + ")");
        }
        System.out.println("Ha salido el valor prohibido (" + vProhibido + ")");
        System.out.println("");
        System.out.println("Juego terminado");
        System.out.println("Tiradas válidas: " + (tirada-1));
        System.out.print("Total acumulado: " + vAcumulado + " puntos");
    }
}
