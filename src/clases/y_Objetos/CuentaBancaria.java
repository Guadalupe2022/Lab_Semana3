
package Clases.y_Objetos;


public class CuentaBancaria {
    long numeroCuenta; 
    cliente propietarioCuenta;
    double SaldoCuenta;
    
    public void abonar (double valor){
        SaldoCuenta = valor;
    }
    public void retirar(double cantidad){
        if(cantidad > SaldoCuenta){
            System.out.println("Saldo insuficiete");
        }
        SaldoCuenta -= cantidad;
            
        }
     public String datosPropietarioCuenta(){
         String informacion = "";
         informacion += "DUI:" + propietarioCuenta.duiCliente + "\n";
         informacion += "Nombre:" + propietarioCuenta.nombreCliente + "\n";
         informacion += "Telefono:" + propietarioCuenta.telefonoCliente + "\n";
         return informacion;
         
         
        
    }
            
}

