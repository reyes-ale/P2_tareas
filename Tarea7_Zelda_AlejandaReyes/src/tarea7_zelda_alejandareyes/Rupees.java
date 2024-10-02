/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea7_zelda_alejandareyes;

import java.awt.Color;

/**
 *
 * @author aleja
 */
public class Rupees extends Item{
    int valor;
    Color color;

    public Rupees() {
    }

    public Rupees(int valor, Color color, String codigo, int numespacio) {
        super(codigo, numespacio);
        this.valor = valor;
        this.color = color;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
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
        return super.toString()+"Rupees{" + "valor=" + valor + ", color=" + color + '}';
    }
    
    
    
    
    
    
    
    
    
    
    
}
