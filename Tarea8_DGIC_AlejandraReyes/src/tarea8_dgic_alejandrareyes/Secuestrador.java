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
public class Secuestrador extends Criminal{
    double monto;
    String lugar,placa;

    public Secuestrador() {
    }

    public Secuestrador(double monto, String lugar, String placa, String id, String nombre) {
        super(id, nombre);
        this.monto = monto;
        this.lugar = lugar;
        this.placa = placa;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
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
        return "Secuestrador{" + "monto=" + monto + ", lugar=" + lugar + ", placa=" + placa + '}';
    }
    
    @Override
    public int pena() {
      int p = 0;
      int millones = (int)(monto/1000000);
      p=millones*10;
      return p;
    }
    
    
    
}
