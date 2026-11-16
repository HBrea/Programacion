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
public class Hoja4_Ej22 {
    public static void main(String[] args){
        System.out.println("Total con descuentos: " + aplicarDescuento(calcularTotal()));
    }
    
    /**
     * 
     * @return La suma de todos los precios.
     */
    static double calcularTotal(){
        Scanner sc = new Scanner(System.in);
        int nPrecios;
        double precio;
        double total = 0;
        System.out.print("Cuantos precios vas a introducir: ");
        nPrecios = sc.nextInt();
        while(nPrecios > 0){
            System.out.print("Precio " + nPrecios + ": ");
            
            do{
                precio = sc.nextDouble();
            }while(precio < 0);
            
            total = total + precio;
            nPrecios--;
        }
        
        return total;
    }
    
    /**
     * 
     * @param total El numero sobre el que va a aplicar el descuento.
     * @return El total con el descuento aplicado.
     */
    static double aplicarDescuento(double total){
        double totalConDescuento;
        
        if(total > 100) 
            totalConDescuento = total - total*0.1;
        else
            totalConDescuento = total;
        
        return totalConDescuento;
    }
}
