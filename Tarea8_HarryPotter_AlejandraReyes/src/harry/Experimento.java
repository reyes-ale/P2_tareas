/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package harry;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author aleja
 */
public abstract class Experimento {
    private String nombre, clase;
    private int calificacion;
    private Date fecha;
    ArrayList <Material> materiales = new ArrayList();

    public Experimento() {
    }

    public Experimento(String nombre, String clase, int calificacion, Date fecha) {
        this.nombre = nombre;
        this.clase = clase;
        this.calificacion = calificacion;
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public ArrayList<Material> getMateriales() {
        return materiales;
    }

    public void setMateriales(ArrayList<Material> materiales) {
        this.materiales = materiales;
    }

    @Override
    public String toString() {
        return "Experimento{" + "nombre=" + nombre + ", clase=" + clase + ", calificacion=" + calificacion + ", fecha=" + fecha + ", materiales=" + materiales + '}';
    }
    
    public abstract String autodenominarse();
    
    
    
    
    
    
    
}
