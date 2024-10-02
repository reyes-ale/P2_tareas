/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea7_zelda_alejandareyes;

import java.util.ArrayList;

/**
 *
 * @author aleja
 */
public class contenedorRupees extends Contenedor{
    int captotal;
    ArrayList <Rupees> rupees =  new ArrayList ();

    public contenedorRupees() {
    }

    public contenedorRupees(int captotal, double peso, String material, String codigo, int numespacio) {
        super(peso, material, codigo, numespacio);
        this.captotal = captotal;
    }

    public int getCaptotal() {
        return captotal;
    }

    public void setCaptotal(int captotal) {
        this.captotal = captotal;
    }

    public ArrayList<Rupees> getRupees() {
        return rupees;
    }

    public void setRupees(ArrayList<Rupees> rupees) {
        this.rupees = rupees;
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
        return super.toString()+" contenedorRupees{" + "captotal=" + captotal + ", rupees=" + rupees + '}';
    }
    
    
}
