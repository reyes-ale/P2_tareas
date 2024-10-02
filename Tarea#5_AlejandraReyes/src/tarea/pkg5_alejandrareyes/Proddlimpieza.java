/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea.pkg5_alejandrareyes;

/**
 *
 * @author aleja
 */
public class Proddlimpieza {
    String nombre;
    String tipo;
    String marca;
    String codigo;
    double precio;
    String proveedor;
    int cantidad;

    public Proddlimpieza(String nombre, String tipo, String marca, String codigo, double precio, String proveedor, int cantidad) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.marca = marca;
        this.codigo = codigo;
        this.precio = precio;
        this.proveedor = proveedor;
        this.cantidad = cantidad;
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

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Producto de limpieza {" + " Nombre: " + nombre + " ||  Tipo: " + tipo + " || Marca: " + marca + " || Codigo: " + codigo + 
                " || Precio: " + precio + " || Proveedor: " + proveedor + " || Cantidad en inventario: " + cantidad + '}';
    }
 
}
