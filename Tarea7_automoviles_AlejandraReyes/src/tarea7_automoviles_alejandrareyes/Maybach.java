/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea7_automoviles_alejandrareyes;

import java.awt.Color;
import java.util.Date;

/**
 *
 * @author aleja
 */
public class Maybach extends Carro{
    int repuesto;
    
    // esto mas resticciones de velocidad, kmgal, precio

    public Maybach() {
    }

    public Maybach(int repuesto, Date fecha, Color color, String marcallantas, boolean polarizado, double velocidadmax, double kmgal, double precio) {
        super(fecha, color, marcallantas, polarizado, velocidadmax, kmgal, precio);
        this.repuesto = repuesto;
    }

    public int getRepuesto() {
        return repuesto;
    }

    public void setRepuesto(int repuesto) {
        this.repuesto = repuesto;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getMarcallantas() {
        return marcallantas;
    }

    public void setMarcallantas(String marcallantas) {
        this.marcallantas = marcallantas;
    }

    public boolean isPolarizado() {
        return polarizado;
    }

    public void setPolarizado(boolean polarizado) {
        this.polarizado = polarizado;
    }

    public double getVelocidadmax() {
        return velocidadmax;
    }

    public void setVelocidadmax(double velocidadmax) {
        this.velocidadmax = velocidadmax;
    }

    public double getKmgal() {
        return kmgal;
    }

    public void setKmgal(double kmgal) {
        this.kmgal = kmgal;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return super.toString()+"Maybach{" + "repuesto=" + repuesto + '}';
    }
    
    
    
    
}
