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
public class Encantamiento extends Experimento{
    private int cant_per, duracion;
    private String instrumento;

    public Encantamiento() {
    }

    public Encantamiento(int cant_per, int duracion, String instrumento, String nombre, String clase, int calificacion, Date fecha) {
        super(nombre, clase, calificacion, fecha);
        this.cant_per = cant_per;
        this.duracion = duracion;
        this.instrumento = instrumento;
    }

    public int getCant_per() {
        return cant_per;
    }

    public void setCant_per(int cant_per) {
        this.cant_per = cant_per;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getInstrumento() {
        return instrumento;
    }

    public void setInstrumento(String instrumento) {
        this.instrumento = instrumento;
    }

    public ArrayList<Material> getMateriales() {
        return materiales;
    }

    public void setMateriales(ArrayList<Material> materiales) {
        this.materiales = materiales;
    }

    @Override
    public String toString() {
        return "Encantamiento{" + "cant_per=" + cant_per + ", duracion=" + duracion + ", instrumento=" + instrumento + '}';
    }

    @Override
    public String autodenominarse() {
        if (cant_per >50){
            return "avanzado";
        }
        return "basico";
        
    }
    
    
    
    
    
            
    
    
    
}
