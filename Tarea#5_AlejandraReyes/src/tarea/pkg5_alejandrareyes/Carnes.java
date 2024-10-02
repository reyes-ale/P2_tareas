/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea.pkg5_alejandrareyes;

/**
 *
 * @author aleja
 */
public class Carnes {
    String lugar;
    int cantidad;
    String tipo;
    double precio;

    public Carnes(String lugar, int cantidad, String tipo, double precio) {
        this.lugar = lugar;
        this.cantidad = cantidad;
        this.tipo = tipo;
        this.precio = precio;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Carne {" + " Tipo: " + tipo + " ||  Lugar de procedencia: " + lugar + " || Precio: " + precio + " || Cantidad en inventario: " + cantidad + '}';
    }
    
    
    
}
