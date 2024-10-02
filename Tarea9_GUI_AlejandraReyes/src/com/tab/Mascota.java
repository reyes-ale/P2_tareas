/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tab;

/**
 *
 * @author aleja
 */
public class Mascota {
    private String nombre, tipo;
    private int edad;
    private double precio;

    public Mascota() {
    }

    public Mascota(String nombre, String tipo,int edad, double precio) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.edad = edad;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Mascota{" + "nombre=" + nombre + ", tipo=" + tipo +  ", edad=" + edad + ", precio=" + precio + '}';
    }
    
    
    
    
    
    
}
