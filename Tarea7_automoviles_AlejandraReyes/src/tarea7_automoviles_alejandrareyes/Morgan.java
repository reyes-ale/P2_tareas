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
public class Morgan extends Carro{
    boolean convertible,cabinaunica;
    
    // esto mas resticciones de velocidad, kmgal, precio

    public Morgan() {
    }

    public Morgan(boolean convertible, boolean cabinaunica, Date fecha, Color color, String marcallantas, boolean polarizado, double velocidadmax, double kmgal, double precio) {
        super(fecha, color, marcallantas, polarizado, velocidadmax, kmgal, precio);
        this.convertible = convertible;
        this.cabinaunica = cabinaunica;
    }

    public boolean isConvertible() {
        return convertible;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public boolean isCabinaunica() {
        return cabinaunica;
    }

    public void setCabinaunica(boolean cabinaunica) {
        this.cabinaunica = cabinaunica;
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
        return super.toString()+"Morgan{" + "convertible=" + convertible + ", cabinaunica=" + cabinaunica + '}';
    }
    
    
    
    
}
