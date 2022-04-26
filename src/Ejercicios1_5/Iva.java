
package Ejercicios1_5;

public class Iva  extends artículo {

       private double Porcentaje;
       private double iva;
       private double PrecioSinIva;

    public double getPorcentaje() {
        return Porcentaje;
    }

    public void setPorcentaje(double Porcentaje) {
        this.Porcentaje = Porcentaje;
    }

    public double getIva() {
        return iva;
    }

    public void setIva(double iva) {
        this.iva = iva;
    }

    public double getPrecioSinIva() {
        return PrecioSinIva;
    }

    public void setPrecioSinIva(double PrecioSinIva) {
        this.PrecioSinIva = PrecioSinIva;
    }
       public double Calculariva(){
           double Tiva;
           Tiva = this.getPrecioArticulo() * this.getPorcentaje() / 100;
           
           return Tiva;
       }
       
       
       public double precioconiva(){
           double preciosiniva;
           preciosiniva = this.Calculariva() + this.getPrecioArticulo();
           return preciosiniva;
       }
       public double perciosiniva(){
           double precio;
           precio = this.precioconiva() - this.Calculariva();
           return precio;
       }
       
       
}   

