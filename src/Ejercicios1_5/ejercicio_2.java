
package Ejercicios1_5;

import java.util.Scanner;


public class ejercicio_2 {
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Iva cal = new Iva();
        System.out.println("Ingresar los datos");
        System.out.println("Ingresar el precio: $");
        cal.setPrecioArticulo(sc.nextDouble());
        System.out.println("Ingresar porcentaje del IVA: %");
        cal.setPorcentaje(sc.nextDouble());
        
        
        
        System.out.println(":::::::::::::::::::Informacion:::::::::::::::::::::::::");
        System.out.println("Precio de articulo: $"+ cal.getPrecioArticulo());
        System.out.println("Porcentaje descontado del IVA: $" + cal.Calculariva());
        System.out.println("Precio con el IVA: $"+ cal.precioconiva());
        System.out.println("Precio sin el IVA: $"+cal.perciosiniva());
    }
}

