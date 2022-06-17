package modelo;

import java.util.ArrayList;

public class Listas {

    int numprocesos;
    ArrayList listlisto = new ArrayList<>();
    ArrayList listejecucion = new ArrayList<>();
    ArrayList listbloqueado = new ArrayList<>();
    
    ArrayList Recurso1 = new ArrayList<Proceso>();
    ArrayList Recurso2 = new ArrayList<Proceso>();
    ArrayList Recurso3 = new ArrayList<Proceso>();
    ArrayList Recurso4 = new ArrayList<Proceso>();
    ArrayList Recurso5 = new ArrayList<Proceso>();

    public Listas() {
        this.numprocesos = 0;
    }

    
    public int getNumprocesos() {
        return numprocesos;
    }

    public void setNumprocesos(int numprocesos) {
        this.numprocesos = numprocesos;
    }

    public ArrayList getListlisto() {
        return listlisto;
    }

    public void setListlisto(ArrayList listlisto) {
        this.listlisto = listlisto;
    }

    public ArrayList getListejecucion() {
        return listejecucion;
    }

    public void setListejecucion(ArrayList listejecucion) {
        this.listejecucion = listejecucion;
    }

    public ArrayList getListbloqueado() {
        return listbloqueado;
    }

    public void setListbloqueado(ArrayList listbloqueado) {
        this.listbloqueado = listbloqueado;
    }

    public ArrayList getRecurso1() {
        return Recurso1;
    }

    public void setRecurso1(ArrayList Recurso1) {
        this.Recurso1 = Recurso1;
    }

    public ArrayList getRecurso2() {
        return Recurso2;
    }

    public void setRecurso2(ArrayList Recurso2) {
        this.Recurso2 = Recurso2;
    }

    public ArrayList getRecurso3() {
        return Recurso3;
    }

    public void setRecurso3(ArrayList Recurso3) {
        this.Recurso3 = Recurso3;
    }

    public ArrayList getRecurso4() {
        return Recurso4;
    }

    public void setRecurso4(ArrayList Recurso4) {
        this.Recurso4 = Recurso4;
    }

    public ArrayList getRecurso5() {
        return Recurso5;
    }

    public void setRecurso5(ArrayList Recurso5) {
        this.Recurso5 = Recurso5;
    }
    
    
    
    
}
