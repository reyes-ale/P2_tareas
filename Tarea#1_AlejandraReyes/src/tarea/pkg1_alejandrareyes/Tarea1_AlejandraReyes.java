
package tarea.pkg1_alejandrareyes;

import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author aleja
 */
public class Tarea1_AlejandraReyes {
    public static void main(String[] args) {
        
        
        String op = JOptionPane.showInputDialog("¡Bienvenido al inventario de mascotas!\n "
                + "1. Agregar \n 2. Listar \n 3. Modificar \n 4. Eliminar \n 5. Mascota mas antigua "
                + "\n 6. Mascotas negras \n 7. Diferencia de edad entre 2 mascotas \n 8. Salir \nIngrese una opcion:");
        int opcion = Integer.parseInt(op);
        ArrayList <Mascota> inventario = new ArrayList<>();
        
        while (opcion>0 && opcion<8){
        switch (opcion){
            case 1: 
                char resp = 's';
                while (inventario.size()<=99 && (resp=='s' || resp =='S')){
                    String nombre = JOptionPane.showInputDialog("Ingrese el nombre de la mascota: ");
                    String tipo = JOptionPane.showInputDialog("Ingrese el tipo de mascota: ");
                    Color color =JColorChooser.showDialog(null, "Seleccione el color de la mascota", Color.blue);
                    
                    Date fechana = new Date(JOptionPane.showInputDialog("Ingrese fecha de nacimiento de la mascota en formato mm/dd/yyyy"));
                     SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
                    String fecha = sdf.format(fechana);

                    String pre = JOptionPane.showInputDialog("Ingrese el precio de la mascota (sin la L. de lempiras): ");
                    double precio = Double.parseDouble(pre); 
                    String re = JOptionPane.showInputDialog("Desea ingresar otra mascota? [s/n]:");
                    inventario.add(new Mascota(nombre, tipo, color,fecha, precio));
                    resp = re.charAt(0);
                    
                            
                   }
                
                
                break;
            
            case 2:
                String msj = "*Inventario actual*";
                for (int i=0; i<inventario.size(); i++){
                    msj += "\n Nombre: " + inventario.get(i).getNombre() + "\n "
                            + "Tipo: "+ inventario.get(i).getTipo() + "\n Color: "+ inventario.get(i).getColor() +
                            "\n Fecha de nacimiento: "+ inventario.get(i).getFechadenacimiento() + "\n Precio: L. "+ 
                            inventario.get(i).getPrecio() + "\n";
                }
                JOptionPane.showMessageDialog(null, msj);
                break;
                
            case 3:
                String cambio = JOptionPane.showInputDialog("Ingrese el nombre de la mascota a modificar: ");
                for (int i=0; i<inventario.size(); i++){
                    if (cambio.equalsIgnoreCase(inventario.get(i).getNombre())){
                        String camb = JOptionPane.showInputDialog("Seleccione lo que desea cambiar\n "
                + "1. Nombre \n 2. Tipo \n 3. Color \n 4. Fecha de nacimiento \n 5. Precio mas antigua");
                    int cam = Integer.parseInt(camb);
                    
                    switch (cam){
                        case 1:
                            String nombre2 = JOptionPane.showInputDialog("Ingrese el nuevo nombre de la mascota: ");
                            inventario.get(i).setNombre(nombre2);
                            break;
                            
                        case 2:
                             String tipo2 = JOptionPane.showInputDialog("Ingrese el nuevo tipo de la mascota: ");
                            inventario.get(i).setTipo(tipo2);
                            break;
                         
                         case 3:
                            Color color2 =JColorChooser.showDialog(null, "Seleccione el buevo color de la mascota", Color.blue);
                            inventario.get(i).setColor(color2);
                            break;
                       
                            
                        case 4:
                            Date fechana2 = new Date(JOptionPane.showInputDialog("Ingrese la nueva fecha de nacimiento de la mascota en formato mm/dd/yyyy"));
                            SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy/MM/dd");
                            String fecha2 = sdf2.format(fechana2);
                            inventario.get(i).setFechadenacimiento(fecha2);
                            break;
                        
                            
                         case 5:
                             String pre = JOptionPane.showInputDialog("Ingrese el nuevo precio de la mascota: ");
                             double precio2 = Double.parseDouble(pre); 
                            inventario.get(i).setPrecio(precio2);
                            break;
                        }
                    }
                }
                
                break;
            
            case 4:
                String masc = JOptionPane.showInputDialog("Ingrese el nombre de la mascota a eliminar: ");
                for (int i=0; i<inventario.size(); i++){
                    if (masc.equalsIgnoreCase(inventario.get(i).getNombre())){
                        inventario.remove(i);
                    }
                }
                
                break;   
                
            case 5:
                for (int i=0; i<inventario.size(); i++){
                    String fech = inventario.get(i).getFechadenacimiento();
                     String []pars = fech.split("/");
                    System.out.println(pars[2]);
                }
                break;   
            
            case 6:
                
                break;   
                
            case 7:
                String msj2 = "*Inventario actual*";
                for (int i=0; i<inventario.size(); i++){
                    msj2 += "\n Nombre: " + inventario.get(i).getNombre() + "\n "
                            + "Tipo: "+ inventario.get(i).getTipo() + "\n Color: "+ inventario.get(i).getColor() +
                            "\n Fecha de nacimiento: "+ inventario.get(i).getFechadenacimiento() + "\n Precio: L. "+ 
                            inventario.get(i).getPrecio() + "\n";
                }
                String nomb1 = JOptionPane.showInputDialog(msj2+ "Ingrese el nombre de la primera mascota: ");
                
                int a1=0;
                int a2=0;
                 int diferencia;
                
               
                for (int i=0; i<inventario.size(); i++){
                    if (nomb1.equalsIgnoreCase(inventario.get(i).getNombre())){
                        String an1 = inventario.get(i).getFechadenacimiento();
                        String []pars1 = an1.split("/");
                        a1 = Integer.parseInt(pars1[1]);
                    }
                }
                 
                String msj3 = "*Inventario actual*";
                for (int i=0; i<inventario.size(); i++){
                    msj3 += "\n Nombre: " + inventario.get(i).getNombre() + "\n "
                            + "Tipo: "+ inventario.get(i).getTipo() + "\n Color: "+ inventario.get(i).getColor() +
                            "\n Fecha de nacimiento: "+ inventario.get(i).getFechadenacimiento() + "\n Precio: L. "+ 
                            inventario.get(i).getPrecio() + "\n";
                }
                String nomb2 = JOptionPane.showInputDialog(msj3+ "Ingrese el nombre de la segunda mascota: ");   
                
                for (int i=0; i<inventario.size(); i++){
                    if (nomb1.equalsIgnoreCase(inventario.get(i).getNombre())){
                        String an2 = inventario.get(i).getFechadenacimiento();
                        String []pars2 = an2.split("/");
                        a2 = Integer.parseInt(pars2[1]);
                    }
                }
                
                
                if (a1>a2){
                    diferencia = a1-a2;
                }
                else {
                    diferencia = a2-a1;
                }
                JOptionPane.showMessageDialog(null, "La diferencia entre mascotas es de " + diferencia + " años");
               
              
                break;
                
        }
        op = JOptionPane.showInputDialog("¡Bienvenido al inventario de mascotas!\n "
                + "1. Agregar \n 2. Listar \n 3. Modificar \n 4. Eliminar \n 5. Mascota mas antigua "
                + "\n 6. Mascotas negras \n 7. Diferencia de edad entre 2 mascotas \n 8. Salir \nIngrese una opcion:");
        opcion = Integer.parseInt(op);
        }
    }
    
    
}
    

    

