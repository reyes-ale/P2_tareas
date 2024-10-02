/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea.pkg5_alejandrareyes;

/**
 *
 * @author aleja
 */
public class Frutaverdu {
    double precio;
    int cantidad;
    String categoria;

    public Frutaverdu(double precio, int cantidad, String categoria) {
        this.precio = precio;
        this.cantidad = cantidad;
        this.categoria = categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Frutas y Veruduras {" + " Precio: " + precio + " ||  Categoria: " + categoria + " || Cantidad en inventario: " + cantidad + '}';
    }
    
    
}
