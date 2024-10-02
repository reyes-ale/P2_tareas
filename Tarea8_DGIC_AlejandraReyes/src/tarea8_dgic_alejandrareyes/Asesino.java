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
public class Asesino extends Criminal{
    String bitacora;
    Arma arma;

    public Asesino() {
    }

    public Asesino(String bitacora, Arma arma, String id, String nombre) {
        super(id, nombre);
        this.bitacora = bitacora;
        this.arma = arma;
    }

    public String getBitacora() {
        return bitacora;
    }

    public void setBitacora(String bitacora) {
        this.bitacora = bitacora;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
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
        return "Asesino{" + "bitacora=" + bitacora + ", arma=" + arma + '}';
    }

    //30 anios por crimen
    @Override
    public int pena() {
        int cont=0;
        for (int i = 0; i < crimenes.size(); i++) {
            cont+=30;
        }
        return cont;
    }
    
    
}
