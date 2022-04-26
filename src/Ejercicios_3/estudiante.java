
package Ejercicios_3;

public class estudiante {
     int numeroCarnet;
    String nombre;
    int codigocarrera;

    public estudiante(int numeroCarnet, String nombre, int codigocarrera) {
        this.numeroCarnet = numeroCarnet;
        this.nombre = nombre;
        this.codigocarrera = codigocarrera;
    }

    public void imprimir(){
        System.out.println("Informacion Estudiante");
        System.out.println("El codigo del estudiante es: "+ numeroCarnet);
        System.out.println("Nombre: "+nombre);
        System.out.println("Codigo carrera: "+codigocarrera);
    }

}


