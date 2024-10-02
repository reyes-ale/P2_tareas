/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package harry;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author aleja
 */
public class Herbolaria extends Experimento{
    String nombreplanta, contextura;
    boolean venenosa;
    Color color;

    public Herbolaria() {
    }

    public Herbolaria(String nombreplanta, String contextura, boolean venenosa, Color color, String nombre, String clase, int calificacion, Date fecha) {
        super(nombre, clase, calificacion, fecha);
        this.nombreplanta = nombreplanta;
        this.contextura = contextura;
        this.venenosa = venenosa;
        this.color = color;
    }

    public String getNombreplanta() {
        return nombreplanta;
    }

    public void setNombreplanta(String nombreplanta) {
        this.nombreplanta = nombreplanta;
    }

    public String getContextura() {
        return contextura;
    }

    public void setContextura(String contextura) {
        this.contextura = contextura;
    }

    public boolean isEsvenenosa() {
        return venenosa;
    }

    public void setEsvenenosa(boolean esvenenosa) {
        this.venenosa = esvenenosa;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public ArrayList<Material> getMateriales() {
        return materiales;
    }

    public void setMateriales(ArrayList<Material> materiales) {
        this.materiales = materiales;
    }

    @Override
    public String toString() {
        return "Herbolaria{" + "nombreplanta=" + nombreplanta + ", contextura=" + contextura + ", esvenenosa=" + venenosa + ", color=" + color + '}';
    }
    

    @Override
    public String autodenominarse() {
        if (venenosa==true){
            return "avanzado";
        }
        return "basico";
    }
    
   
    
}
