/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea7_zelda_alejandareyes;

/**
 *
 * @author aleja
 */
public class Contenedor extends Item{
    double peso;
    String material;

    public Contenedor() {
    }

    public Contenedor(double peso, String material, String codigo, int numespacio) {
        super(codigo, numespacio);
        this.peso = peso;
        this.material = material;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
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
        return super.toString()+"Contenedor{" + "peso=" + peso + ", material=" + material + '}';
    }
    
    

   
    
}
