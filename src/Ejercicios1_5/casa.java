
package Ejercicios1_5;

public class casa {
     private String NumerodeCasa;
    private int NumeroPasaje;
    private String NombredeCalle;

    public casa() {
    }

    public casa(String NumerodeCasa, int NumeroPasaje, String NombredeCalle) {
        this.NumerodeCasa = NumerodeCasa;
        this.NumeroPasaje = NumeroPasaje;
        this.NombredeCalle = NombredeCalle;
    }
    

    public String getNumerodeCasa() {
        return NumerodeCasa;
    }

    public void setNumerodeCasa(String NumerodeCasa) {
        this.NumerodeCasa = NumerodeCasa;
    }

    public int getNumeroPasaje() {
        return NumeroPasaje;
    }

    public void setNumeroPasaje(int NumeroPSJ) {
        this.NumeroPasaje= NumeroPasaje;
    }

    public void setNombredeCalle(String NombredeCalle) {
        this.NombredeCalle = NombredeCalle;
    }

    public String getNombredeCalle() {
        return NombredeCalle;
    }

    public void setNombreCalle(String NombreCalle) {
        this.NombredeCalle = NombreCalle;
    }
    public void imprimirdatos(){
        System.out.println("::::::::::::::::::::::::::::::::::");
        System.out.println("CASA CREADA");
        System.out.println("El numero de casa es: "+ this.getNumerodeCasa());
        System.out.println(" El Numero de pasaje asignado: "+this.getNumeroPasaje());
        System.out.println("El Nombre de calle: "+ this.getNombredeCalle());
    }

    {
    }
}


