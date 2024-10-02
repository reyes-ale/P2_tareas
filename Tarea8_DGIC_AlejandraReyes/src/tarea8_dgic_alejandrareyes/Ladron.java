/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea8_dgic_alejandrareyes;

import java.util.ArrayList;

/**
 *
 * @author aleja
 */
public class Ladron extends Criminal{
    int num_robos;
    Arma arma;
    double fortuna;

    public Ladron() {
    }

    public Ladron(int num_robos, Arma arma, double fortuna, String id, String nombre) {
        super(id, nombre);
        this.num_robos = num_robos;
        this.arma = arma;
        this.fortuna = fortuna;
    }

    public int getNum_robos() {
        return num_robos;
    }

    public void setNum_robos(int num_robos) {
        this.num_robos = num_robos;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    public double getFortuna() {
        return fortuna;
    }

    public void setFortuna(double fortuna) {
        this.fortuna = fortuna;
    }

    public ArrayList<Crimen> getCrimenes() {
        return crimenes;
    }

    public void setCrimenes(ArrayList<Crimen> crimenes) {
        this.crimenes = crimenes;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Ladron{" + "num_robos=" + num_robos + ", arma=" + arma + ", fortuna=" + fortuna + '}';
    }
    
    @Override
    public int pena() {
        int p = 0;
      int millones = (int)(fortuna/10000);
      p=millones*10;
      return p;
    }
    
    
}
