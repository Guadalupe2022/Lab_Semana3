
package Ejercicios_3;

import java.util.Scanner;



public class HashTable {
    
public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        int numeroCarnet ;
        String nombre  ;
        int codigocarrera ;
        
           System.out.println("Ingresar el numero de carnet: ");
           numeroCarnet = sc.nextInt();
           sc.nextLine();
           System.out.println("Ingresar el nombre: ");
           nombre= sc.nextLine();
           System.out.println("Ingresar código: ");
           codigocarrera = sc.nextInt();
       
        estudiante estudiante = new estudiante(numeroCarnet, nombre, codigocarrera);
        estudiante.imprimir();
    }

    
}

  