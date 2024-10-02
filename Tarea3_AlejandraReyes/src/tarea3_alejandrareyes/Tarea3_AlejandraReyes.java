
package tarea3_alejandrareyes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author aleja
 */
public class Tarea3_AlejandraReyes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList <Integer> lista1 = new ArrayList<>();
        ArrayList <Integer> lista2 = new ArrayList<>();
        ArrayList <Integer> lista3 = new ArrayList<>();
        ArrayList <Integer> listat = new ArrayList<>();
        
        int opcion = Integer.parseInt(JOptionPane.showInputDialog("Gestion de Listas \n 1. Llenar Listas"
                + "\n 2. Ordenar y Mostrar Listas \n 3. Calcular interseccion de numeros primos \n 4. Operaciones [suma, resta, multiplicacion, division] "
                + " \n 5. Diferencia entre listas \n 6. Salir \n Ingrese una opcion: "));
        
        while (opcion>0 && opcion<6){
            switch (opcion){
                case 1:
                    lista1.clear();
                    lista2.clear();
                    for (int i =0 ; i<=99; i++){
                        int ran = random.nextInt(100) + 1;
                        lista1.add(ran);
                        ran = random.nextInt(100) + 1;
                        lista2.add(ran);
                    }
                    JOptionPane.showMessageDialog(null, "Listas 1 y 2 llenadas exitosamente");
                    
                    break;

                case 2:
                    Collections.sort(lista1);
                    Collections.sort(lista2);
                    
                    JOptionPane.showMessageDialog(null, "Lista 1 (orden ascendente): \n " + imprimeJoption(lista1) + 
                            "\n \n Lista 2 (orden ascendente): \n" + imprimeJoption(lista2));
                    
                    
                    break;

                case 3:
                    for (int i = 0; i < lista1.size(); i++) {
                        for (int j = 0; j < lista2.size(); j++) {
                            if (lista1.get(i).equals(lista2.get(j))) {
                                if (esprimo(lista1.get(i))==true){
                                listat.add(lista1.get(i));
                                }
                            }
                        }
                    }
                    
                    for (int i = 0; i < listat.size(); i++) {
                        int num = listat.get(i);
                        if (lista3.contains(num)==false){
                            lista3.add(num);
                        }
                    }                    
                    
                    Collections.sort(lista3);
                    JOptionPane.showMessageDialog(null, "Lista 1: \n" + imprimeJoption(lista1) + "\n\n Lista 2: \n " + 
                            imprimeJoption(lista2) + "\n \n Lista 3 (interseccion de primos de lista 1 y 2): \n"  + imprimeJoption(lista3));
                    break;
                    
                case 4:
                    //suma, resta, multiplicacion, division
                     int opcionop = Integer.parseInt(JOptionPane.showInputDialog("Operaciones \n 1. Suma"
                        + "\n 2. Resta \n 3. Multiplicacion \n 4. Division "
                        + " \n 5. Salir del submenu \n Ingrese una opcion: "));
                     
                     while (opcionop>0 && opcionop<5){
                            int op = Integer.parseInt(JOptionPane.showInputDialog("Lista 1: \n " + imprimeJoption(lista1) + "\n \nLista 2: \n " + imprimeJoption(lista2)
                               + "\n \nLista 3: \n " + imprimeJoption(lista3) + "\n \n Seleccione la primera lista para la operacion: "));

                            int op2 = Integer.parseInt(JOptionPane.showInputDialog("Lista 1: \n " + imprimeJoption(lista1) + "\n \nLista 2: \n " + imprimeJoption(lista2)
                                + "\n \nLista 3: \n " + imprimeJoption(lista3) + "\n \n Seleccione la segunda lista para la operacion: "));

                   
                        switch(opcionop){
                            case 1: 
                               //suma
                                //1-1 1-2 1-3 2-3 2-2 3-3 
                                if (op==1 && op2==2 || op==2 && op2==1){
                                   JOptionPane.showMessageDialog(null, "Lista 1: \n" + imprimeJoption(lista1) + "\n\n Lista 2: \n " + 
                                    imprimeJoption(lista2) + "\n \n Lista 3: \n " + imprimeJoption(lista3)+ "\n \n Lista de suma (lista 1 y 2): \n"  + imprimeJoption(suma(lista1,lista2)));
                                    
                                }
                                if (op==1 && op2==3 || op==3 && op2==1){
                                   JOptionPane.showMessageDialog(null, "Lista 1: \n" + imprimeJoption(lista1) + "\n\n Lista 2: \n " + 
                                    imprimeJoption(lista2) + "\n \n Lista 3: \n " + imprimeJoption(lista3)+ "\n \n Lista de suma (lista 1 y 3): \n"  + imprimeJoption(suma(lista1,lista3)));
                                    
                                }
                                if (op==2 && op2==3 || op==3 && op2==2){
                                   JOptionPane.showMessageDialog(null, "Lista 1: \n" + imprimeJoption(lista1) + "\n\n Lista 2: \n " + 
                                    imprimeJoption(lista2) + "\n \n Lista 3: \n " + imprimeJoption(lista3)+ "\n \n Lista de suma (lista 2 y 3): \n"  + imprimeJoption(suma(lista2,lista3)));
                                    
                                }
                                if (op==1 && op2==1){
                                   JOptionPane.showMessageDialog(null, "Lista 1: \n" + imprimeJoption(lista1) + "\n\n Lista 2: \n " + 
                                    imprimeJoption(lista2) + "\n \n Lista 3: \n " + imprimeJoption(lista3)+ "\n \n Lista de suma (lista 1 y si misma): \n"  + imprimeJoption(suma(lista1,lista1)));
                                    
                                }
                                if (op==2 && op2==2){
                                   JOptionPane.showMessageDialog(null, "Lista 1: \n" + imprimeJoption(lista1) + "\n\n Lista 2: \n " + 
                                    imprimeJoption(lista2) + "\n \n Lista 3: \n " + imprimeJoption(lista3)+ "\n \n Lista de suma (lista 2 y si misma): \n"  + imprimeJoption(suma(lista2,lista2)));
                                    
                                }
                                if (op==3 && op2==3){
                                   JOptionPane.showMessageDialog(null, "Lista 1: \n" + imprimeJoption(lista1) + "\n\n Lista 2: \n " + 
                                    imprimeJoption(lista2) + "\n \n Lista 3: \n " + imprimeJoption(lista3)+ "\n \n Lista de suma (lista 3 y si misma): \n"  + imprimeJoption(suma(lista3,lista3)));
                                    
                                }
                                break;

                            case 2:
                                //resta
                                //1-1 1-2 1-3 2-3 2-2 3-3 
                                if (op==1 && op2==2 || op==2 && op2==1){
                                   JOptionPane.showMessageDialog(null, "Lista 1: \n" + imprimeJoption(lista1) + "\n\n Lista 2: \n " + 
                                    imprimeJoption(lista2) + "\n \n Lista 3: \n " + imprimeJoption(lista3)+ "\n \n Lista de resta (lista 1 y 2): \n"  + imprimeJoption(resta(lista1,lista2)));
                                    
                                }
                                if (op==1 && op2==3 || op==3 && op2==1){
                                   JOptionPane.showMessageDialog(null, "Lista 1: \n" + imprimeJoption(lista1) + "\n\n Lista 2: \n " + 
                                    imprimeJoption(lista2) + "\n \n Lista 3: \n " + imprimeJoption(lista3)+ "\n \n Lista de resta (lista 1 y 3): \n"  + imprimeJoption(resta(lista1,lista3)));
                                    
                                }
                                if (op==2 && op2==3 || op==3 && op2==2){
                                   JOptionPane.showMessageDialog(null, "Lista 1: \n" + imprimeJoption(lista1) + "\n\n Lista 2: \n " + 
                                    imprimeJoption(lista2) + "\n \n Lista 3: \n " + imprimeJoption(lista3)+ "\n \n Lista de resta (lista 2 y 3): \n"  + imprimeJoption(resta(lista2,lista3)));
                                    
                                }
                                if (op==1 && op2==1){
                                   JOptionPane.showMessageDialog(null, "Lista 1: \n" + imprimeJoption(lista1) + "\n\n Lista 2: \n " + 
                                    imprimeJoption(lista2) + "\n \n Lista 3: \n " + imprimeJoption(lista3)+ "\n \n Lista de resta (lista 1 y si misma): \n"  + imprimeJoption(resta(lista1,lista1)));
                                    
                                }
                                if (op==2 && op2==2){
                                   JOptionPane.showMessageDialog(null, "Lista 1: \n" + imprimeJoption(lista1) + "\n\n Lista 2: \n " + 
                                    imprimeJoption(lista2) + "\n \n Lista 3: \n " + imprimeJoption(lista3)+ "\n \n Lista de resta (lista 2 y si misma): \n"  + imprimeJoption(resta(lista2,lista2)));
                                    
                                }
                                if (op==3 && op2==3){
                                   JOptionPane.showMessageDialog(null, "Lista 1: \n" + imprimeJoption(lista1) + "\n\n Lista 2: \n " + 
                                    imprimeJoption(lista2) + "\n \n Lista 3: \n " + imprimeJoption(lista3)+ "\n \n Lista de resta (lista 3 y si misma): \n"  + imprimeJoption(resta(lista3,lista3)));
                                    
                                }
                                break;

                            case 3:
                                //multi
                                //1-1 1-2 1-3 2-3 2-2 3-3 
                                if (op==1 && op2==2 || op==2 && op2==1){
                                   JOptionPane.showMessageDialog(null, "Lista 1: \n" + imprimeJoption(lista1) + "\n\n Lista 2: \n " + 
                                    imprimeJoption(lista2) + "\n \n Lista 3: \n " + imprimeJoption(lista3)+ "\n \n Lista de multiplicacion (lista 1 y 2): \n"  + imprimeJoption(multi(lista1,lista2)));
                                    
                                }
                                
                                if (op==1 && op2==3 || op==3 && op2==1){
                                   JOptionPane.showMessageDialog(null, "Lista 1: \n" + imprimeJoption(lista1) + "\n\n Lista 2: \n " + 
                                    imprimeJoption(lista2) + "\n \n Lista 3: \n " + imprimeJoption(lista3)+ "\n \n Lista de multiplicacion (lista 1 y 3): \n"  + imprimeJoption(multi(lista1,lista3)));
                                    
                                }
                                if (op==2 && op2==3 || op==3 && op2==2){
                                   JOptionPane.showMessageDialog(null, "Lista 1: \n" + imprimeJoption(lista1) + "\n\n Lista 2: \n " + 
                                    imprimeJoption(lista2) + "\n \n Lista 3: \n " + imprimeJoption(lista3)+ "\n \n Lista de multiplicacion (lista 2 y 3): \n"  + imprimeJoption(multi(lista2,lista3)));
                                    
                                }
                                if (op==1 && op2==1){
                                   JOptionPane.showMessageDialog(null, "Lista 1: \n" + imprimeJoption(lista1) + "\n\n Lista 2: \n " + 
                                    imprimeJoption(lista2) + "\n \n Lista 3: \n " + imprimeJoption(lista3)+ "\n \n Lista de multiplicacion (lista 1 y si misma): \n"  + imprimeJoption(multi(lista1,lista1)));
                                    
                                }
                                if (op==2 && op2==2){
                                   JOptionPane.showMessageDialog(null, "Lista 1: \n" + imprimeJoption(lista1) + "\n\n Lista 2: \n " + 
                                    imprimeJoption(lista2) + "\n \n Lista 3: \n " + imprimeJoption(lista3)+ "\n \n Lista de multiplicacion (lista 2 y si misma): \n"  + imprimeJoption(multi(lista2,lista2)));
                                    
                                }
                                if (op==3 && op2==3){
                                   JOptionPane.showMessageDialog(null, "Lista 1: \n" + imprimeJoption(lista1) + "\n\n Lista 2: \n " + 
                                    imprimeJoption(lista2) + "\n \n Lista 3: \n " + imprimeJoption(lista3)+ "\n \n Lista de multiplicacion (lista 3 y si misma): \n"  + imprimeJoption(multi(lista3,lista3)));
                                    
                                }
                                break;

                            case 4:
                                //division
                                //1-1 1-2 1-3 2-3 2-2 3-3 
                                if (op==1 && op2==2 || op==2 && op2==1){
                                   JOptionPane.showMessageDialog(null, "Lista 1: \n" + imprimeJoption(lista1) + "\n\n Lista 2: \n " + 
                                    imprimeJoption(lista2) + "\n \n Lista 3: \n " + imprimeJoption(lista3) + "\n \n Lista de division (lista 1 y 2): \n"  + imprimeJoption(div(lista1,lista2)));
                                    
                                }
                                if (op==1 && op2==3 || op==3 && op2==1){
                                   JOptionPane.showMessageDialog(null, "Lista 1: \n" + imprimeJoption(lista1) + "\n\n Lista 2: \n " + 
                                    imprimeJoption(lista2) + "\n \n Lista 3: \n " + imprimeJoption(lista3) + "\n \n Lista de division (lista 1 y 3): \n"  + imprimeJoption(div(lista1,lista3)));
                                    
                                }
                                if (op==2 && op2==3 || op==3 && op2==2){
                                   JOptionPane.showMessageDialog(null, "Lista 1: \n" + imprimeJoption(lista1) + "\n\n Lista 2: \n " + 
                                    imprimeJoption(lista2) + "\n \n Lista 3: \n " + imprimeJoption(lista3) + "\n \n Lista de division (lista 2 y 3): \n"  + imprimeJoption(div(lista2,lista3)));
                                    
                                }
                                if (op==1 && op2==1){
                                   JOptionPane.showMessageDialog(null, "Lista 1: \n" + imprimeJoption(lista1) + "\n\n Lista 2: \n " + 
                                    imprimeJoption(lista2) + "\n \n Lista 3: \n " + imprimeJoption(lista3) + "\n \n Lista de division (lista 1 y si misma): \n"  + imprimeJoption(div(lista1,lista1)));
                                    
                                }
                                if (op==2 && op2==2){
                                   JOptionPane.showMessageDialog(null, "Lista 1: \n" + imprimeJoption(lista1) + "\n\n Lista 2: \n " + 
                                    imprimeJoption(lista2) + "\n \n Lista 3: \n " + imprimeJoption(lista3) + "\n \n Lista de division (lista 2 y si misma): \n"  + imprimeJoption(div(lista2,lista2)));
                                    
                                }
                                if (op==3 && op2==3){
                                   JOptionPane.showMessageDialog(null, "Lista 1: \n" + imprimeJoption(lista1) + "\n\n Lista 2: \n " + 
                                    imprimeJoption(lista2) + "\n \n Lista 3: \n " + imprimeJoption(lista3) + "\n \n Lista de division (lista 3 y si misma): \n"  + imprimeJoption(div(lista3,lista3)));
                                    
                                }
                                break;

                        }
                        opcionop = Integer.parseInt(JOptionPane.showInputDialog("Operaciones \n 1. Suma"
                                    + "\n 2. Resta \n 3. Multiplicacion \n 4. Division "
                                    + " \n 5. Salir del submenu \n Ingrese una opcion: "));
                   
                        
                     }
                     
                    
                    break;
                    
                case 5:
                    Collections.sort(lista1);
                    Collections.sort(lista2);
                    int opciondif = Integer.parseInt(JOptionPane.showInputDialog("Lista 1: \n " + imprimeJoption(lista1) + "\n \nLista 2: \n " + imprimeJoption(lista2)
                + "\n \nLista 3: \n " + imprimeJoption(lista3) + "\n \n Seleccione la primera lista para calcular su diferencia con otra lista: "));
                    
                    int opciondif2 = Integer.parseInt(JOptionPane.showInputDialog("Lista 1: \n " + imprimeJoption(lista1) + "\n \nLista 2: \n " + imprimeJoption(lista2)
                + "\n \nLista 3: \n " + imprimeJoption(lista3) + "\n \n Seleccione la segunda lista para calcular su diferencia con la primera que selecciono: "));
                    
                     while (opciondif == opciondif2){
                        JOptionPane.showMessageDialog(null, "La diferencia entre la misma lista es igual a 0. \nPresione 'OK' para ingresar las listas nuevamente.");
                        opciondif = Integer.parseInt(JOptionPane.showInputDialog("Lista 1: \n " + imprimeJoption(lista1) + "\n \nLista 2: \n " + imprimeJoption(lista2)
                                    + "\n \nLista 3: \n " + imprimeJoption(lista3) + "\n \n Seleccione la primera lista para calcular su diferencia con otra lista: "));
                        opciondif2 = Integer.parseInt(JOptionPane.showInputDialog("Lista 1: \n " + imprimeJoption(lista1) + "\n \nLista 2: \n " + imprimeJoption(lista2)
                                    + "\n \nLista 3: \n " + imprimeJoption(lista3) + "\n \n Seleccione la segunda lista para calcular su diferencia con la primera que selecciono: "));
                    
                    }
                    
                     while (opciondif == 3){
                        JOptionPane.showMessageDialog(null, "La lista 3 contiene elementos similares que ya existen en la lista 1 y 2. \n "
                                + "Por lo tanto su diferencia es igual a 0. Presione 'OK' para ingresar las listas nuevamente.");
                        opciondif = Integer.parseInt(JOptionPane.showInputDialog("Lista 1: \n " + imprimeJoption(lista1) + " \n \n Lista 2: \n " + imprimeJoption(lista2)
                                    + "\n\n Lista 3: \n " + imprimeJoption(lista3) + "\n \n Seleccione la primera lista para calcular su diferencia con otra lista: "));
                        opciondif2 = Integer.parseInt(JOptionPane.showInputDialog("Lista 1: \n " + imprimeJoption(lista1) + "\n \n Lista 2: \n " + imprimeJoption(lista2)
                                    + "\n \n Lista 3: \n " + imprimeJoption(lista3) + "\n \nSeleccione la segunda lista para calcular su diferencia con la primera que selecciono: "));
                     }
                     
                     if (opciondif==3 && lista3.isEmpty()==true || opciondif2==3 && lista3.isEmpty()==true){
                        JOptionPane.showMessageDialog(null, "La lista 3 no ha sido llenada. Presione la opcion 3 para crearla. ");
                        break;
                            
                     }
                    
                    
                    if (opciondif == 1 && opciondif2==2){
                        JOptionPane.showMessageDialog(null, "Lista 1: \n" + imprimeJoption(lista1) + "\n\n Lista 2: \n " + 
                            imprimeJoption(lista2) + "\n \n Lista 3: \n " + imprimeJoption(lista3) + "\n \n Lista de diferencia (lista1 - lista2): \n " + imprimeJoption(diferencia(lista1,lista2)));
                         
                    }
                    else if (opciondif == 2 && opciondif2==1){
                        JOptionPane.showMessageDialog(null, "Lista 1: \n" + imprimeJoption(lista1) + "\n\n Lista 2: \n " + 
                            imprimeJoption(lista2) + "\n \n Lista 3: \n " + imprimeJoption(lista3) +"\n \nLista de diferencia (lista2 - lista1): \n " + imprimeJoption(diferencia(lista2,lista1)));
                    }
                    else if (opciondif == 1 && opciondif2==3){
                        JOptionPane.showMessageDialog(null, "Lista 1: \n" + imprimeJoption(lista1) + "\n\n Lista 2: \n " + 
                            imprimeJoption(lista2) + "\n \n Lista 3: \n " + imprimeJoption(lista3)+ "\n \nLista de diferencia (lista1 - lista3): \n " + imprimeJoption(diferencia(lista1,lista3)));
                    }
                    else if (opciondif == 2 && opciondif2==3){
                        JOptionPane.showMessageDialog(null, "Lista 1: \n" + imprimeJoption(lista1) + "\n\n Lista 2: \n " + 
                            imprimeJoption(lista2) + "\n \n Lista 3: \n " + imprimeJoption(lista3)+ "\n \n Lista de diferencia (lista2 - lista3): \n " + imprimeJoption(diferencia(lista2,lista3)));
                    }
                   
                    
                    break;
                    
            }            
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Gestion de Listas \n 1. Llenar Listas"
                + "\n 2. Ordenar y Mostrar Listas \n 3. Calcular interseccion de numeros primos \n 4. Operaciones [suma, resta, multiplicacion, division] "
                + " \n 5. Diferencia entre listas \n 6. Salir \n Ingrese una opcion: "));
        }   
            lista1.clear();
            lista2.clear();
            lista3.clear();
          

    }
        
    
    public static String imprimeJoption (ArrayList <Integer> lista){
        String imp = "";
        
        for (int i=0; i < lista.size(); i++){
                imp+=lista.get(i);
                
                if (i==lista.size()-1){
                    imp += " ";
                }
                else if (i==9 || i==19 || i==29 || i==39 || i== 49|| i==59 || i==69 ||i==79 || i==89 || i==99){
                    imp += "\n";
                }
                else{
                    imp += " , ";
                }
            }
        
      return imp;  
    }
    
    public static boolean esprimo (int num){
        int cont=0;
        for (int i=1; i<=num; i++){
            if (num%i==0){
                cont++;
            }
        }
        if (cont==2){
            return true;
        }
        else{
            return false;
        }
        
    }
    
    public static ArrayList <Integer> diferencia (ArrayList <Integer> lista1, ArrayList <Integer> lista2){
        ArrayList <Integer> comunes = new ArrayList<>();
        ArrayList <Integer> temp = new ArrayList<>();
        ArrayList <Integer> temp2 = new ArrayList<>();
        
        temp.addAll(lista1);
        
        for (int i = 0; i < lista1.size(); i++) {
            for (int j = 0; j < lista2.size(); j++) {
                
                if (lista1.get(i).equals(lista2.get(j))) {
                    comunes.add(lista1.get(i));
                }
            }
        }
        for (Integer t : comunes) {
            while (temp.contains(t)) {
                temp.remove(t);
            }
        }
          for (int i = 0; i < temp.size(); i++) { // no repeat numeros
                        int num = temp.get(i);
                        if (temp2.contains(num)==false){
                            temp2.add(num);
                        }
                    } 
          
           
         
         return temp2;
                    
                    
    }
    
    public static ArrayList <Integer> suma (ArrayList <Integer> lista1, ArrayList <Integer> lista2){
        int sum=0; 
        ArrayList <Integer> temp = new ArrayList<>();
        
        if (lista1.size() > lista2.size()) {
          for (int i = 0; i < lista1.size(); i++) {
            if (i >= lista2.size()) {
                sum = lista1.get(i);
            } 
            else {
                sum = lista1.get(i) + lista2.get(i);
            }
            temp.add(sum);
          }
            
        }
        else if (lista2.size()>lista1.size()){
          for (int i = 0; i < lista2.size(); i++) {
            if (i >= lista1.size()) {
                sum = lista2.get(i);
            } 
            else {
                sum = lista1.get(i) + lista2.get(i);
            }
            temp.add(sum);
          }
            
        }
        else if (lista1.size()==lista2.size()){
           for (int i = 0; i < lista1.size(); i++) {
                sum = lista1.get(i) + lista2.get(i);
                temp.add(sum);
            }
            
        }
        return temp;
    }
    
     public static ArrayList <Integer> resta (ArrayList <Integer> lista1, ArrayList <Integer> lista2){
        int rest=0; 
        ArrayList <Integer> temp = new ArrayList<>();
        
        if (lista1.size() > lista2.size()) {
          for (int i = 0; i < lista1.size(); i++) {
            if (i >= lista2.size()) {
                rest = lista1.get(i);
            } 
            else {
                rest = Math.abs(lista1.get(i) - lista2.get(i));
            }
            temp.add(rest);
          }
            
        }
        else if (lista2.size()>lista1.size()){
          for (int i = 0; i < lista2.size(); i++) {
            if (i >= lista1.size()) {
                rest = lista2.get(i);
            } 
            else {
                rest = Math.abs(lista1.get(i) - lista2.get(i));
            }
            temp.add(rest);
          }
            
        }
        else if (lista1.size()==lista2.size()){
           for (int i = 0; i < lista1.size(); i++) {
                rest = Math.abs(lista1.get(i) - lista2.get(i));
                temp.add(rest);
            }
            
        }
        return temp;
    }
     
     public static ArrayList <Integer> multi (ArrayList <Integer> lista1, ArrayList <Integer> lista2){
        int multi=0; 
        ArrayList <Integer> temp = new ArrayList<>();
        
        if (lista1.size() > lista2.size()) {
          for (int i = 0; i < lista1.size(); i++) {
            if (i >= lista2.size()) {
                multi = lista1.get(i);
            } 
            else {
                multi = lista1.get(i) * lista2.get(i);
            }
            temp.add(multi);
          }
            
        }
        else if (lista2.size()>lista1.size()){
          for (int i = 0; i < lista2.size(); i++) {
            if (i >= lista1.size()) {
                multi = lista2.get(i);
            } 
            else {
                multi = lista1.get(i) * lista2.get(i);
            }
            temp.add(multi);
          }
            
        }
        else if (lista1.size()==lista2.size()){
           for (int i = 0; i < lista1.size(); i++) {
                multi = lista1.get(i) * lista2.get(i);
                temp.add(multi);
            }
            
        }
        return temp;
    }
     
     public static ArrayList <Integer> div (ArrayList <Integer> lista1, ArrayList <Integer> lista2){
        int div=0; 
        ArrayList <Integer> temp = new ArrayList<>();
        
        if (lista1.size() > lista2.size()) {
          for (int i = 0; i < lista1.size(); i++) {
            if (i >= lista2.size()) {
                div = lista1.get(i);
            } 
            else {
                div = lista1.get(i) / lista2.get(i);
            }
            temp.add(div);
          }
            
        }
        else if (lista2.size()>lista1.size()){
          for (int i = 0; i < lista2.size(); i++) {
            if (i >= lista1.size()) {
                div = lista2.get(i);
            } 
            else {
                div = lista1.get(i) / lista2.get(i);
            }
            temp.add(div);
          }
            
        }
        else if (lista1.size()==lista2.size()){
           for (int i = 0; i < lista1.size(); i++) {
                div = lista1.get(i) / lista2.get(i);
                temp.add(div);
            }
            
        }
        return temp;
    }
    
}
