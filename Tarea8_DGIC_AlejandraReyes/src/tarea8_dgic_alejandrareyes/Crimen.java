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
public class Crimen {
    String id;
    ArrayList <Victima> victimas = new ArrayList();
    ArrayList <Criminal> criminales = new ArrayList();
    ArrayList <Oficial> oficiales = new ArrayList();

    public Crimen() {
    }

    public Crimen(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<Victima> getVictimas() {
        return victimas;
    }

    public void setVictimas(ArrayList<Victima> victimas) {
        this.victimas = victimas;
    }

    public ArrayList<Criminal> getCriminales() {
        return criminales;
    }

    public void setCriminales(ArrayList<Criminal> criminales) {
        this.criminales = criminales;
    }

    public ArrayList<Oficial> getOficiales() {
        return oficiales;
    }

    public void setOficiales(ArrayList<Oficial> oficiales) {
        this.oficiales = oficiales;
    }

    @Override
    public String toString() {
        return "Crimen{" + "id=" + id + ", victimas=" + victimas + ", criminales=" + criminales + ", oficiales=" + oficiales + '}';
    }
    
    
}
