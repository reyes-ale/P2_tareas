
package clase.pkg24.pkg01.pkg24;

import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;

public class Tarea4_AlejandraReyes {

    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);
        Scanner leerS = new Scanner(System.in);
        ArrayList <String> caracteristicas = new ArrayList();
        
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        
        int x;
        Mascota m = new Mascota();
        ArrayList <Mascota>listadmascotas = new ArrayList();
        
        try { 
            Mascota n = new Mascota(10);
        } catch (Exception ex) {
            System.out.println("paso algo");
        }
        
        System.out.println("* * * * * M E N U * * * * * ");
        System.out.print("1. Agregar mascota \n 2. Mostrar mascotas \n 3. Editar mascota \n 4. Borrar mascota \n 5. Salir \n Ingrese una opcion: ");
        int opcion = leer.nextInt();
        
        while (opcion>0 && opcion<5){
            switch (opcion){
                //crud
                case 1:
                    System.out.print("Ingrese el nombre de a mascota:  ");
                    String nombre = leerS.nextLine();
                    System.out.print("Ingrese el codigo de a mascota:  ");
                    int codigo = leer.nextInt();
                    System.out.print("Ingrese fecha de nacimiento de la mascota [mm/dd/yyyy]: ");
                    String f = leerS.nextLine();
                    Date fecha = new Date (f);
                    System.out.println("En la paleta de colores seleccione el color de la mascota");
                    Color color = JColorChooser.showDialog(null, "Ingrese el color de la mascota", Color.yellow);
                    System.out.print("Ingrese el precio de la mascota: ");
                    double precio = leer.nextDouble();

                    char resp = 's';
                    while (resp == 'S' || resp=='s'){
                        System.out.print("Ingrese una caracteristica de la mascota: ");
                        String car = leerS.nextLine();
                        caracteristicas.add(car);

                        System.out.println("Desea ingresar otra caracteristica? [s/n]: ");
                        resp = leer.next().charAt(0);
                    }

                    listadmascotas.add(new Mascota (codigo,nombre,color,fecha,precio,caracteristicas));

                    break;

                case 2:
                    impmascotas(listadmascotas);
                    break;
                    
                case 3:
                    impmascotas(listadmascotas);
                    System.out.println("Ingrese el nombre de la mascota a modificar:");
                    String cambio = leerS.nextLine();
                    
                    for (int i=0; i<listadmascotas.size(); i++){
                        if (cambio.equalsIgnoreCase(listadmascotas.get(i).getNombre())){
                            System.out.println("Seleccione lo que desea cambiar: ");
                            System.out.print("1. Nombre \n 2. Codigo \n 3. Color \n 4. Fecha de nacimiento \n 5. Precio \n Ingrese una opcion: ");
                            int cam = leer.nextInt();
                    
                            switch (cam){
                                case 1:
                                    System.out.print("Ingrese el nuevo nombre de la mascota: ");
                                    String nombre2 = leerS.nextLine();
                                    listadmascotas.get(i).setNombre(nombre2);
                                    break;

                                case 2:
                                    System.out.print("Ingrese el nuevo codigo de la mascota: ");
                                    int codigo2 = leer.nextInt();
                                    listadmascotas.get(i).setCodigo(codigo2);
                                    break;

                                 case 3:
                                    System.out.print("En la paleta de colores seleccione el nuevo color de la mascota: ");
                                    Color color2 =JColorChooser.showDialog(null, "Seleccione el buevo color de la mascota", Color.blue);
                                    listadmascotas.get(i).setColor(color2);
                                    break;

                                case 4:
                                    System.out.print("Ingrese la nueva fecha de nacimiento de la mascota en formato mm/dd/yyyy");
                                    String fec = leerS.nextLine();
                                    Date fecha2 = new Date(fec);
                                    listadmascotas.get(i).setFecha(fecha2);
                                    break;

                                 case 5:
                                     System.out.print("Ingrese el nuevo precio de la mascota: ");
                                     double precio2 = leer.nextDouble();
                                    listadmascotas.get(i).setPrecio(precio2);
                                    break;
                                }
                    }
                }
                    break;
                    
                case 4:
                     impmascotas(listadmascotas);
                    System.out.print("Ingrese el nombre de la mascota a eliminar: ");
                    String eliminar = leerS.nextLine();
                    
                    for (int i=0; i<listadmascotas.size(); i++){
                        if (eliminar.equalsIgnoreCase(listadmascotas.get(i).getNombre())){
                            listadmascotas.remove(i);
                            System.out.println("Mascota eliminada exitosamente");
                        }
                }
                    
                
                    break;
            }
            System.out.println("\n * * * * * M E N U * * * * * ");
            System.out.print("1. Agregar mascota \n 2. Mostrar mascotas \n 3. Editar mascota \n 4. Borrar mascota \n 5. Salir \n Ingrese una opcion: ");
            opcion = leer.nextInt();
        }
    }
    
    public static void impmascotas (ArrayList <Mascota>lista){
        for(int i=0; i<lista.size(); i++){
            Mascota temp = lista.get(i);
            System.out.println(temp.toString());
        }   
    }
    
}
