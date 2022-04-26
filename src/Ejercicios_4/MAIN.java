
package Ejercicios_4;

import java.util.Scanner;

public class MAIN {
 public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Empleado emp = new Empleado();
        
        //PEDIR DATOS
        System.out.println("Ingresar NIT: ");
        emp.setNIT(leer.nextInt());
        leer.nextLine();
        System.out.println("Ingresar sus dos nombre: ");
        emp.setNombre(leer.nextLine());
        System.out.println("Ingresar sus dos apellidos: ");
        emp.setApellido(leer.nextLine());
        System.out.println("Ingresar Su salario devengado: ");
        emp.setSalarioD(leer.nextDouble());
        leer.nextLine();
        System.out.println("Ingresar su bandera de activo o inactivo: ");
        emp.setEmpleadoB(leer.nextLine());
        
        
        //LLAMAR LOS METODOS 
        emp.imprimirNombreContribuyente();
        emp.imprimirAtributos();
    }
}


