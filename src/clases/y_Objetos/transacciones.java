package Clases.y_Objetos;

import java.util.Scanner;

public class transacciones {
   public static void main(String[] args){
        cliente propietario = new cliente();
        CuentaBancaria cuenta;
        cuenta = new CuentaBancaria();
        Scanner leer = new Scanner(System.in);
        
        double abano, retiro;
        System.out.println("Ingresar los datos que se solicitan a continuacion:");
        System.out.println("Nombre de propietario");
        propietario.duiCliente = leer.nextLine();
        
        System.out.println("Numero DUI:");
        propietario.nombreCliente = leer.nextLine();
        
        System.out.println("Telefono");
        propietario.telefonoCliente = leer.nextLong();
        
        cuenta.propietarioCuenta = propietario;
        
        System.out.println("Ingrese la cantidad a abonar");
        cuenta.abonar(retiro=leer.nextDouble());
        
        System.out.println("Ingresar cantidad a retirar");
        cuenta.retirar(retiro=leer.nextDouble());
        
        System.out.println("----------------");
        System.out.println("Su saldo de la cuenta es:" + cuenta.SaldoCuenta);
        System.out.println("Datos del propietario   :\n" + cuenta.datosPropietarioCuenta());
    }
   {
}
 
}
