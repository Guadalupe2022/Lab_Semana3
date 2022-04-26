
package Ejercicios_4;

public class Empleado {
    private int NIT;
    private String Nombre,Apellido,Direccion,EmpleadoB;
    private double SalarioD, SalarioConDescuento;

    public int getNIT() {
        return NIT;
    }

    public void setNIT(int NIT) {
        this.NIT = NIT;
    }

    public String getNombre() {
        return Nombre;
    }
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getEmpleadoB() {
        return EmpleadoB;
    }

    public void setEmpleadoB(String EmpleadoB) {
        this.EmpleadoB = EmpleadoB;
    }

    public double getSalarioD() {
        return SalarioD;
    }

    public void setSalarioD(double SalarioD) {
        this.SalarioD = SalarioD;
    }

    public double getSalarioConDescuento() {
        return SalarioConDescuento;
    }

    public void setSalarioConDescuento(double SalarioConDescuento) {
        this.SalarioConDescuento = SalarioConDescuento;
    }

  
    
    //CALCULAR RENTA
    public double DescuentoRenta(){
        double Renta;
        Renta = this.getSalarioD() * 0.10;
        return Renta;
    }
    //DESCONTAR RENTA
    public double CalcularSalarioConDescuento(){
        double SalarioCondescuento;
         SalarioCondescuento = this.getSalarioD() - this.DescuentoRenta();
         return SalarioCondescuento;
    }
    
    //IMPRIMIR NOMBRE COMPLETO
    public void imprimirNombreContribuyente(){
        System.out.println("--------------------------------");
        System.out.println("Nombre completo: " + this.getNombre()+ " " + this.getApellido());
    }
    //IMPRIMIR TODOS LOS DATOS 
    public void imprimirAtributos(){
        System.out.println("::::DATOS::::::::::::");
        System.out.println("NIT: #" + this.getNIT());
        System.out.println("Direccion: " + this.getDireccion());
        System.out.println("Salario devengado: $"+this.getSalarioD());
        System.out.println("Salario con descuento: $" + this.CalcularSalarioConDescuento());
        System.out.println("EmpleadoB: "+this.getEmpleadoB());
    }

}
