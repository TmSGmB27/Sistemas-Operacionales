package modelo;

public class Proceso {

    String Nombre;
    int Tamaño;
    int[] recursos;

    public Proceso() {
        this.Nombre = "";
        this.Tamaño = 0;
        this.recursos = null;
    }

    public Proceso(String Nombre, int Tamaño, int[] recursos) {
        this.Nombre = Nombre;
        this.Tamaño = Tamaño;
        this.recursos = recursos;
    }


    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getTamaño() {
        return Tamaño;
    }

    public void setTamaño(int Tamaño) {
        this.Tamaño = Tamaño;
    }

    public int[] getRecursos() {
        return recursos;
    }

    public void setRecursos(int[] recursos) {
        this.recursos = recursos;
    }

}
