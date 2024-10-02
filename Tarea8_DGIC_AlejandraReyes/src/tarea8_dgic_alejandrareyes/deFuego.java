/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea8_dgic_alejandrareyes;

/**
 *
 * @author aleja
 */
public class deFuego extends Arma{
    double calibre;
    int municion;

    public deFuego() {
    }

    public deFuego(double calibre, int municion, String nombre, double peso) {
        super(nombre, peso);
        this.calibre = calibre;
        this.municion = municion;
    }

    public double getCalibre() {
        return calibre;
    }

    public void setCalibre(double calibre) {
        this.calibre = calibre;
    }

    public int getMunicion() {
        return municion;
    }

    public void setMunicion(int municion) {
        this.municion = municion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "deFuego{" + "calibre=" + calibre + ", municion=" + municion + '}';
    }
    
    
    
}
