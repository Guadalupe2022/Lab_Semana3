
package Ejercicios1_5;

import java.util.Scanner;

public class ejercicio_1 {
    


    
    public static void main(String[] args) {
        casa casa = new casa();
        Scanner sc = new Scanner(System.in);
        
        //PEDIMOS LOS DATOS
        System.out.println("_______________________________________________");
        System.out.println("Ingrese la informacion de la casa ");
        System.out.println("Ingresar el numero de casa: ");
        casa.setNumerodeCasa(sc.nextLine());
        System.out.println("Ingresar numero de pasaje: ");
        casa.setNumeroPasaje(sc.nextInt());
        sc.nextLine();
        System.out.println("Nombre de la calle: ");
        casa.setNombredeCalle(sc.nextLine());
        {
        //LAMAMOS EL METODO
        casa.imprimirdatos();
        { 
        }
        }
    }
}
