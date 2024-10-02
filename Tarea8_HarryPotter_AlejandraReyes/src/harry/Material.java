/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package harry;

import java.awt.Color;

/**
 *
 * @author aleja
 */
public class Material {
    private String descripcion, textura;
    private Color color;

    public Material() {
    }

    public Material(String descripcion, String textura, Color color) {
        this.descripcion = descripcion;
        this.textura = textura;
        this.color = color;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTextura() {
        return textura;
    }

    public void setTextura(String textura) {
        this.textura = textura;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Material{" + "descripcion =" + descripcion + ", textura =" + textura + ", color =" + color + '}';
    }
    
    
    
    
    
    
}
