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
public class contenedorArmas extends Contenedor{
    int cantarmas;
    ArrayList <Armas> armas = new ArrayList();

    public contenedorArmas() {
    }

    public contenedorArmas(int cantarmas, double peso, String material, String codigo, int numespacio) {
        super(peso, material, codigo, numespacio);
        this.cantarmas = cantarmas;
    }

    public int getCantarmas() {
        return cantarmas;
    }

    public void setCantarmas(int cantarmas) {
        this.cantarmas = cantarmas;
    }

    public ArrayList<Armas> getArmas() {
        return armas;
    }

    public void setArmas(ArrayList<Armas> armas) {
        this.armas = armas;
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
        return super.toString()+" contenedorArmas{" + "cantarmas=" + cantarmas + ", armas=" + armas + '}';
    }
    
    
}
