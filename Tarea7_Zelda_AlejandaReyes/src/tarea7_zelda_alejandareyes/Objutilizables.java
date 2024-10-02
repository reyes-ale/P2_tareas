/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea7_zelda_alejandareyes;

/**
 *
 * @author aleja
 */
public class Objutilizables extends Item{
    String nombre, uso;
    int cantexistencia;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUso() {
        return uso;
    }

    public void setUso(String uso) {
        this.uso = uso;
    }

    public int getCantexistencia() {
        return cantexistencia;
    }

    public void setCantexistencia(int cantexistencia) {
        this.cantexistencia = cantexistencia;
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
        return super.toString()+" Objutilizables{" + "nombre=" + nombre + ", uso=" + uso + ", cantexistencia=" + cantexistencia + '}';
    }
    
    
    
}
