/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package harry;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author aleja
 */
public class Criatura extends Experimento{
    String nombrecriatura,tipo;
    double estatura, peso;
    boolean habla;

    public Criatura() {
    }

    public Criatura(String nombrecriatura, String tipo, double estatura, double peso, boolean habla, String nombre, String clase, int calificacion, Date fecha) {
        super(nombre, clase, calificacion, fecha);
        this.nombrecriatura = nombrecriatura;
        this.tipo = tipo;
        this.estatura = estatura;
        this.peso = peso;
        this.habla = habla;
    }

    public String getNombrecriatura() {
        return nombrecriatura;
    }

    public void setNombrecriatura(String nombrecriatura) {
        this.nombrecriatura = nombrecriatura;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public boolean isHabla() {
        return habla;
    }

    public void setHabla(boolean habla) {
        this.habla = habla;
    }

    public ArrayList<Material> getMateriales() {
        return materiales;
    }

    public void setMateriales(ArrayList<Material> materiales) {
        this.materiales = materiales;
    }

    @Override
    public String toString() {
        return "Criatura{" + "nombrecriatura=" + nombrecriatura + ", tipo=" + tipo + ", estatura=" + estatura + ", peso=" + peso + ", habla=" + habla + '}';
    }
    
    
    @Override
    public String autodenominarse() {
      if (tipo.endsWith("humano")||tipo.endsWith("humana")){
          return "avanzado";
      }
      return "basico";
    }
    
    
    
    
}
