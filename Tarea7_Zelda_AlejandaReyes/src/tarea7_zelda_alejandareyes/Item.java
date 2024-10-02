/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea7_zelda_alejandareyes;

/**
 *
 * @author aleja
 */
public class Item {
    String codigo;
    int numespacio;

    public Item() {
    }

    public Item(String codigo, int numespacio) {
        this.codigo = codigo;
        this.numespacio = numespacio;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getNumespacio() {
        return numespacio;
    }

    public void setNumespacio(int numespacio) {
        this.numespacio = numespacio;
    }

    @Override
    public String toString() {
        return "Item{" + "codigo=" + codigo + ", numespacio=" + numespacio + '}';
    }
    
    
}
