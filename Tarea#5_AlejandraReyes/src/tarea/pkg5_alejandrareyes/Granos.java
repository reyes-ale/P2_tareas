/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea.pkg5_alejandrareyes;

/**
 *
 * @author aleja
 */
public class Granos {
    String nombre;
    double quintales;
    double precio;
    String unidad;
    String lugar;

    public Granos(String nombre, double quintales, double precio, String unidad, String lugar) {
        this.nombre = nombre;
        this.quintales = quintales;
        this.precio = precio;
        this.unidad = unidad;
        this.lugar = lugar;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getQuintales() {
        return quintales;
    }

    public void setQuintales(double quintales) {
        this.quintales = quintales;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getUnidad() {
        return unidad;
    }

    public void setUnidad(String unidad) {
        this.unidad = unidad;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    @Override
    public String toString() {
        return "Grano {" + " Nombre: " + nombre + " ||  Quintales: " + quintales + " || Precio: " + precio + " || Unidad de medida: " + unidad + " || Lugar de procedencia: " + lugar + '}';
    }
    
    
    
}
