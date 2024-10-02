package tarea.pkg1_alejandrareyes;

import java.awt.Color;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author aleja
 */
public class Mascota {
    String nombre;
    String tipo; 
    Color color;
    String fechadenacimiento;
    double precio;


    public Mascota(String nombre, String tipo, Color color, String fechadenacimiento, double precio) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.color = color;
        this.fechadenacimiento = fechadenacimiento;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public String getFechadenacimiento() {
        return fechadenacimiento;
    }

    public void setFechadenacimiento(String fechadenacimiento) {
        this.fechadenacimiento = fechadenacimiento;
    }
    

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

  
    
    
}
