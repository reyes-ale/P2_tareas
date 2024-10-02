/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea7_dragon_alejandrareyes;

import java.awt.Color;
import java.util.Date;

/**
 *
 * @author aleja
 */
public class Dragon extends Mascota{
    Color color;

    public Dragon() {
    }

    public Dragon(Color color, String nombre, String codigo, double peso, Date fecha) {
        super(nombre, codigo, peso, fecha);
        this.color = color;
    }
    
    
    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
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
        return "Dragon{" + super.toString() + "color=" + color + '}';
    }
    
    
    
    
    
}
