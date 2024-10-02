/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea7_dragon_alejandrareyes;

import java.util.Date;

/**
 *
 * @author aleja
 */
public class Mascota {
    String nombre, codigo;
    double peso;
    Date fecha;

    public Mascota() {
    }

    public Mascota(String nombre, String codigo, double peso, Date fecha) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.peso = peso;
        this.fecha = fecha;
    }
    
   
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + ", codigo=" + codigo + ", peso=" + peso + ", fecha=" + fecha;
    }
    
    
    
    
}
