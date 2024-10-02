
package clase.pkg24.pkg01.pkg24;

import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Mascota {
     SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
    //atributos
    private int codigo;
    protected String nombre;
    Color color;  // por defecto su visibilidad es package
    public Date fecha;
    private double precio;
    private ArrayList<String> caracteristicas = new ArrayList();
    
    //constructor
    public Mascota (){
    }
    
    public Mascota(int c) throws Exception{
        this.setCodigo(c);
    }
    
    public Mascota(int c, String nombre){
        codigo = c;
        this.nombre = nombre; //this (objeto que ayuda a referenciar los miembros de la clase) - conflicto de interes
    }
    
    public Mascota(Date fecha){
        this.fecha = fecha; 
    }
    
    
    public Mascota (int codigo, String nombre, Color color, Date fecha, double precio, ArrayList<String> caracteristicas ){
        this.codigo=codigo;
        this.nombre=nombre;
        this.color=color;
        this.fecha=fecha;
        this.precio=precio;
        this.caracteristicas=caracteristicas;
    }
    
    public Mascota (int codigo, double precio){
        this.codigo=codigo;
        this.precio=precio;
    }
    
     public Mascota (ArrayList<String> caracteristicas ){
        this.caracteristicas=caracteristicas;
    }
     
     public Mascota (double precio){
        this.precio=precio;
    }
     
    public Mascota (Color color){
        this.color=color;
    }
    
    public Mascota (String nombre, Date fecha, double precio ){
        this.nombre=nombre;
        this.fecha=fecha;
        this.precio=precio;
    }
    
    public Mascota (Color color, String nombre){
        this.color=color;
        this.nombre=nombre;
    }
    
    public Mascota (Color color, double precio, ArrayList<String> caracteristicas ){
        this.color=color;
        this.precio=precio;
        this.caracteristicas=caracteristicas;
    }
    
    
    //mutadores
    public void setCodigo (int c) throws Exception{
        if (c>=1 && c<=100){
            codigo=c;
        }
        else{
            throw new Exception();
        } // en vez de tirar mensaje de advertencia
    }
    
    public int getCodigo(){
        return codigo;
    }
    
    public void setFecha(Date f){
        fecha=f;
        
    }
    
    public Date getFecha(){
        return fecha;
    }
    
    public void setColor(Color c){
         color=c;
    }
    
    public Color getColor (){
        return color;
    }
    
    public void setNombre(String nombre){
         this.nombre=nombre;
    }
    
    public String getNombre (){
        return nombre;
    }
    
    public void setPrecio(double precio){
         this.precio=precio;
    }
    
    public double getPrecio (){
        return precio;
    }
    
    public void setcaracteristicas(ArrayList<String> c){
         caracteristicas=c;
    }
    
    public ArrayList<String> getcaracteristicas (){
        return caracteristicas;
    }

    
    
    /*public String toString (){
        return "mi Puppi es: " + nombre;
    }*/
    
    public String toString() {
        
        return  "\n Nombre: " + nombre + "\nCodigo: " + codigo + "\nColor: " + color + "\nFecha de nacimiento:" + sdf.format(fecha) + "\nPrecio= L. " + precio + "\nCaracteristicas: " + caracteristicas + "\n";
    }
    
    //ma (metodos de administracion)-- comportamiento del nuevo tipo
    
    public double adolares (double precio){
        double dolar = precio * 24.69;
        return dolar;
    }
    
    public void eliminarcarac(int pos) {
        caracteristicas.remove(pos);
    }
    
    public int edad (Date fecha){
        int edad; 
        String fe = sdf.format(fecha);
        String sep [] = fe.split("/");
        int anio = Integer.parseInt(sep[0]);
        edad = 2024-anio;
        
        return edad;
    }
    
    public double descuento (double precio, double descuento){
        descuento=precio * (descuento/100);
        precio=precio-descuento;
        return precio;
    }
    
    public int mesquenacio (Date fecha){
        String fe = sdf.format(fecha);
        String sep [] = fe.split("/");
        int mes = Integer.parseInt(sep[1]);
        
        return mes;
    }
   
    
    
    
    
    
    
    /*8 constructores
    terminar mutadores faltantes 
    5 metodos de administracion
    Menu en main: arraylist de mascotas que se pueda hacer el crud
    */
   
    
}
