/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea7_zelda_alejandareyes;

/**
 *
 * @author aleja
 */
public class Armas extends Item{
    String nombre;
    int municion;

    public Armas() {
    }

    public Armas(String nombre, int municion, String codigo, int numespacio) {
        super(codigo, numespacio);
        this.nombre = nombre;
        this.municion = municion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getMunicion() {
        return municion;
    }

    public void setMunicion(int municion) {
        this.municion = municion;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getNumespacio() {
        return numespacio;
    }

    public void setNumespacio(int numespacio) {
        this.numespacio = numespacio;
    }

    @Override
    public String toString() {
        return super.toString()+ "Armas{" + "nombre=" + nombre + ", municion=" + municion + '}';
    }
    
    
}
