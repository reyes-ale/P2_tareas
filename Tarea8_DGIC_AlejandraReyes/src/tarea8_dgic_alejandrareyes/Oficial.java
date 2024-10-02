/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea8_dgic_alejandrareyes;

/**
 *
 * @author aleja
 */
public class Oficial extends Persona{
    String rango;

    public Oficial() {
    }

    public Oficial(String rango, String id, String nombre) {
        super(id, nombre);
        this.rango = rango;
    }

    public String getRango() {
        return rango;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Oficial{" + "rango=" + rango + '}';
    }
    
    
    
}
