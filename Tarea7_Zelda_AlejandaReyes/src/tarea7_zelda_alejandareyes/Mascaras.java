/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea7_zelda_alejandareyes;

/**
 *
 * @author aleja
 */
public class Mascaras extends Item{
    String nombre, transformacion;
    double tam, peso;

    public Mascaras() {
    }

    public Mascaras(String nombre, String transformacion, double tam, double peso, String codigo, int numespacio) {
        super(codigo, numespacio);
        this.nombre = nombre;
        this.transformacion = transformacion;
        this.tam = tam;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTransformacion() {
        return transformacion;
    }

    public void setTransformacion(String transformacion) {
        this.transformacion = transformacion;
    }

    public double getTam() {
        return tam;
    }

    public void setTam(double tam) {
        this.tam = tam;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
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
        return super.toString()+" Mascaras{" + "nombre=" + nombre + ", transformacion=" + transformacion + ", tam=" + tam + ", peso=" + peso + '}';
    }
    
    
    
    
}
