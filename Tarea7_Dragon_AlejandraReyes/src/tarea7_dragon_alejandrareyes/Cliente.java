/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea7_dragon_alejandrareyes;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author aleja
 */
public class Cliente {
    String nombre;
    int edad;
    Date fecha;
    ArrayList <Mascota> mascotasCompradas = new ArrayList();

    public Cliente() {
    }

    public Cliente(String nombre, int edad, Date fecha) {
        this.nombre = nombre;
        this.edad = edad;
        this.fecha = fecha;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public ArrayList<Mascota> getMascotasCompradas() {
        return mascotasCompradas;
    }

    public void setMascotasCompradas(ArrayList<Mascota> mascotasCompradas) {
        this.mascotasCompradas = mascotasCompradas;
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", edad=" + edad + ", fecha=" + fecha + ", mascotasCompradas=" + mascotasCompradas + '}';
    }
    
    
    
    
            
            
}
