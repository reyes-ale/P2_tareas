/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea8_dgic_alejandrareyes;

import java.util.ArrayList;

/**
 *
 * @author aleja
 */
public abstract class Criminal extends Persona{
    ArrayList <Crimen> crimenes = new ArrayList();

    public Criminal() {
    }

    public Criminal(String id, String nombre) {
        super(id, nombre);
    }

    public ArrayList<Crimen> getCrimenes() {
        return crimenes;
    }

    public void setCrimenes(ArrayList<Crimen> crimenes) {
        this.crimenes = crimenes;
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
        return "Criminal{" + "crimenes=" + crimenes + '}';
    }
    
    public abstract int pena();
    
    
}
