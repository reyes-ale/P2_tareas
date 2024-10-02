/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarea7_automoviles_alejandrareyes;

/**
 *
 * @author aleja
 */
public class Empleado extends Persona{
    int numhoras;
    Cliente c;

    public Empleado() {
    }

    public Empleado(int numhoras, Cliente c, String nombre, String id, int edad, double altura, double peso) {
        super(nombre, id, edad, altura, peso);
        this.numhoras = numhoras;
        this.c = c;
    }

    public int getNumhoras() {
        return numhoras;
    }

    public void setNumhoras(int numhoras) {
        this.numhoras = numhoras;
    }

    public Cliente getC() {
        return c;
    }

    public void setC(Cliente c) {
        this.c = c;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return super.toString()+"Empleado{" + "numhoras=" + numhoras + ", c=" + c + '}';
    }
    
    
    
    
    
}
