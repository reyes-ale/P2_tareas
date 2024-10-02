/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea.pkg5_alejandrareyes;

import java.util.Date;

/**
 *
 * @author aleja
 */
public class Liquidos {
    String categoria;
    String empaque;
    String tamano;
    String nombre;
    double precio;
    Date vence;
    int cantidad;

    public Liquidos(String categoria, String empaque, String tamano, String nombre, double precio, Date vence, int cantidad) {
        this.categoria = categoria;
        this.empaque = empaque;
        this.tamano = tamano;
        this.nombre = nombre;
        this.precio = precio;
        this.vence = vence;
        this.cantidad = cantidad;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getEmpaque() {
        return empaque;
    }

    public void setEmpaque(String empaque) {
        this.empaque = empaque;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public Date getVence() {
        return vence;
    }

    public void setVence(Date vence) {
        this.vence = vence;
    }
    
    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    

    @Override
    public String toString() {
        return "Liquido {" + " Nombre: " + nombre + " ||  Categoria: " + categoria + " || Empaque: " + empaque + " || Tamaño: " + tamano + 
                " || Precio: " + precio + " || Fecha de vencimiento: " + vence  + " || Cantidad en inventario: " + cantidad + '}';
    }
    
    
}
