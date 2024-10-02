
package tarea.pkg5_alejandrareyes;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;
/**
 *
 * @author aleja
 */
public class Tarea5_AlejandraReyes {

    static double preciototal=0;
    static double impuesto=0;
    static String categoria2;
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        Scanner leerS = new Scanner (System.in);
        ArrayList inventario = new ArrayList();
        ArrayList cesta = new ArrayList();
        
        
        System.out.print("* * * * * M E N U * * * * *");
        System.out.print("\n 1. Agregar producto \n 2. Modificar producto \n 3. Eliminar producto"
                + "\n 4. Simulacion de facturacion \n 5. Reporte \n 6. Salir \n Ingrese una opcion: ");
        int opcion = leer.nextInt();
        
        while (opcion != 6){
            switch(opcion){
                case 1:
                    System.out.println();
                    System.out.print("* * * * * Productos * * * * *");
                    System.out.print("\n 1. Granos basicos \n 2. Productos de limpieza \n 3. Liquidos"
                        + "\n 4. Carnes y Embutidos \n 5. Frutas y Verduras \n 6. Salir del submenu \n Ingrese una opcion: ");
                        int ag = leer.nextInt();
                        while (ag!=6){
                            switch (ag){
                                case 1://grano
                                    System.out.print("Nombre del grano: ");
                                    String nombre = leerS.nextLine();
                                    System.out.print("Cantidad de quintales: ");
                                    double quintales = leer.nextDouble();
                                    System.out.print("Precio: ");
                                    double precio = leer.nextDouble();
                                    System.out.print("Unidad de medida [libra, medida, kilo]: ");
                                    String unidad = leerS.nextLine();
                                    System.out.print("Lugar de procedencia: ");
                                    String lugar = leerS.nextLine();
                                    
                                    
                                    inventario.add(new Granos(nombre, quintales, precio, unidad, lugar));
                                    System.out.println("Grano basico agregado exitosamente");
                                    break;
                                    
                                case 2://prodlimpieza
                                    System.out.print("Nombre del producto: ");
                                    nombre = leerS.nextLine();
                                    System.out.print("Tipo [liquido, polvo]: ");
                                    String tipo = leerS.nextLine();
                                    System.out.print("Marca: ");
                                    String marca = leerS.nextLine();
                                    System.out.print("Codigo: ");
                                    String codigo = leerS.nextLine();
                                    for (int i = 0; i < inventario.size(); i++) {
                                        if (inventario.get(i) instanceof Proddlimpieza) {
                                            while (((Proddlimpieza) inventario.get(i)).getCodigo().equalsIgnoreCase(codigo)) {
                                                System.out.println("Este codigo ya esta en inventario");
                                                System.out.print("Ingrese otro codigo: ");
                                                codigo = leerS.nextLine();
                                            }

                                        }
                                    }
                                    System.out.print("Precio: ");
                                    precio = leer.nextDouble();
                                    System.out.print("Proveedor: ");
                                    String proveedor = leerS.nextLine();
                                    System.out.print("Cantidad en inventario: ");
                                    int cantidad = leer.nextInt();
                                   
                                    inventario.add(new Proddlimpieza(nombre, tipo, marca, codigo, precio, proveedor, cantidad));
                                    System.out.println("Productos de limpieza agregados exitosamente");
                                   
                                    break;
                                    
                                case 3: //liquido
                                    System.out.print("Nombre del producto: ");
                                    nombre = leerS.nextLine();
                                    System.out.print("Categoria [lacteo, gaseosa, jugo, agua]: ");
                                    String categoria = leerS.nextLine();
                                    System.out.print("Forma de empaque [botella/bote, caja, lata]: ");
                                    String empaque = leerS.nextLine();
                                    System.out.print("Tamaño [pequeño, mediano, grande]: ");
                                    String tam = leerS.nextLine();
                                    System.out.print("Precio: ");
                                    precio = leer.nextDouble();
                                    System.out.print("Fecha de vencimiento [yyyy/mm/dd]: ");
                                    String f = leerS.nextLine();
                                    Date fecha = new Date(f);
                                    System.out.print("Cantidad en inventario: ");
                                    cantidad = leer.nextInt();
                                    
                                    inventario.add(new Liquidos(categoria, empaque, tam, nombre, precio, fecha,cantidad));
                                    System.out.println("Liquidos agregados exitosamente");
                                    break;
                                    
                                case 4: //carne
                                    System.out.print("Lugar de procedencia: ");
                                    lugar = leerS.nextLine();
                                    System.out.print("Cantidad en inventario: ");
                                    cantidad = leer.nextInt();
                                    System.out.print("Tipo [res, carne blanca, cerdo]: ");
                                    tipo = leerS.nextLine();
                                    System.out.print("Precio: ");
                                    precio = leer.nextDouble();
                                    
                                    inventario.add(new Carnes(lugar, cantidad, tipo, precio));
                                    System.out.println("Carnes agregadas exitosamente");
                                    break;
                                    
                                case 5: //frutaverdu
                                    System.out.print("Categoria [fruta, verdura]: ");
                                    categoria = leerS.nextLine();
                                    if (categoria.equalsIgnoreCase("fruta")){
                                        System.out.print("Categoria de fruta [citricos, tropical, grano, rica en fibra]: ");
                                        categoria2 = leerS.nextLine();
                                    }
                                    else{
                                        System.out.print("Categoria de verdura [tuberculos, legumbres, hojas]: ");
                                        categoria2 = leerS.nextLine();
                                    }
                                    System.out.print("Precio: ");
                                    precio = leer.nextDouble();
                                    System.out.print("Cantidad a inventariar: ");
                                    cantidad = leer.nextInt();
                                    inventario.add(new Frutaverdu(precio, cantidad, categoria2));
                                    
                                    if (categoria.equalsIgnoreCase("fruta")){
                                       System.out.println("Fruta agregada exitosamente");
                                    }
                                    else{
                                        System.out.println("Verdura agregada exitosamente");
                                    }
                                    
                                    break;
                                    
                            }
                            System.out.println();
                            System.out.print("* * * * * Productos * * * * *");
                            System.out.print("\n 1. Granos basicos \n 2. Productos de limpieza \n 3. Liquidos"
                                    + "\n 4. Carnes y Embutidos \n 5. Frutas y Verduras \n 6. Salir del submenu \n Ingrese una opcion: ");
                            ag = leer.nextInt();
                        }//fin while2
                    break;
                
                case 2:
                    imprimir(inventario);
                    System.out.println();
                    System.out.print("Ingrese la posicion del articulo a modificar: ");
                    int pos = leer.nextInt();
                        
                        while (pos<0 ||  pos>inventario.size()-1){
                            System.out.println("posicion fuera de rango");
                            System.out.print("Ingrese la posicion de el producto a modificar:");
                            pos = leer.nextInt();
                        }
                        
                        if (inventario.get(pos) instanceof Granos){
                            System.out.print("Nombre del grano: ");
                            String nombre = leerS.nextLine();
                            ((Granos) inventario.get(pos)).setNombre(nombre);
                            System.out.print("Cantidad de quintales: ");
                            double quintales = leer.nextDouble();
                            ((Granos) inventario.get(pos)).setQuintales(quintales);
                            System.out.print("Precio: ");
                            double precio = leer.nextDouble();
                            ((Granos) inventario.get(pos)).setPrecio(precio);
                            System.out.print("Unidad de medida [libra, medida, kilo]: ");
                            String unidad = leerS.nextLine();
                            ((Granos) inventario.get(pos)).setUnidad(unidad);
                            System.out.print("Lugar de procedencia: ");
                            String lugar = leerS.nextLine();
                            ((Granos) inventario.get(pos)).setLugar(lugar);
                            
                            System.out.println();
                            System.out.println("Producto modificado exitosamente");

                        }
                        else if (inventario.get(pos) instanceof Proddlimpieza){
                            System.out.print("Nombre del producto: ");
                            String nombre = leerS.nextLine();
                            ((Proddlimpieza) inventario.get(pos)).setNombre(nombre);
                            System.out.print("Tipo [liquido, polvo]: ");
                            String tipo = leerS.nextLine();
                            ((Proddlimpieza) inventario.get(pos)).setTipo(nombre);
                            System.out.print("Marca: ");
                            String marca = leerS.nextLine();
                             ((Proddlimpieza) inventario.get(pos)).setMarca(marca);
                            System.out.print("Codigo: ");
                            String codigo = leerS.nextLine();
                            for (int i = 0; i < inventario.size(); i++) {
                                if (inventario.get(i) instanceof Proddlimpieza) {
                                    while (((Proddlimpieza) inventario.get(i)).getCodigo().equalsIgnoreCase(codigo)) {
                                        System.out.println("Este codigo ya esta en inventario");
                                        System.out.print("Ingrese otro codigo: ");
                                        codigo = leerS.nextLine();
                                    }

                                }
                            }
                             ((Proddlimpieza) inventario.get(pos)).setCodigo(codigo);
                            System.out.print("Precio: ");
                            double precio = leer.nextDouble();
                             ((Proddlimpieza) inventario.get(pos)).setPrecio(precio);
                            System.out.print("Proveedor: ");
                            String proveedor = leerS.nextLine();
                             ((Proddlimpieza) inventario.get(pos)).setProveedor(proveedor);
                            System.out.print("Cantidad en inventario: ");
                            int cantidad = leer.nextInt();
                             ((Proddlimpieza) inventario.get(pos)).setCantidad(cantidad);
                            
                            System.out.println();
                            System.out.println("Producto modificado exitosamente");
                             
                        }
                        else if (inventario.get(pos) instanceof Liquidos){
                            System.out.print("Nombre del producto: ");
                            String nombre = leerS.nextLine();
                             ((Liquidos) inventario.get(pos)).setNombre(nombre);
                            System.out.print("Categoria [lacteo, gaseosa, jugo, agua]: ");
                            String categoria = leerS.nextLine();
                            ((Liquidos) inventario.get(pos)).setCategoria(categoria);
                            System.out.print("Forma de empaque [botella/bote, caja, lata]: ");
                            String empaque = leerS.nextLine();
                            ((Liquidos) inventario.get(pos)).setEmpaque(empaque);
                            System.out.print("Tamaño [pequeño, mediano, grande]: ");
                            String tam = leerS.nextLine();
                            ((Liquidos) inventario.get(pos)).setTamano(tam);
                            System.out.print("Precio: ");
                            double precio = leer.nextDouble();
                            ((Liquidos) inventario.get(pos)).setPrecio(precio);
                            System.out.print("Fecha de vencimiento [yyyy/mm/dd]: ");
                            String f = leerS.nextLine();
                            Date fecha = new Date(f);
                            ((Liquidos) inventario.get(pos)).setVence(fecha);
                            System.out.print("Cantidad en inventario: ");
                            int cantidad = leer.nextInt();
                            ((Liquidos) inventario.get(pos)).setCantidad(cantidad);
                            
                            System.out.println();
                            System.out.println("Producto modificado exitosamente");
                        }
                        else if (inventario.get(pos) instanceof Carnes){
                            System.out.print("Lugar de procedencia: ");
                            String lugar = leerS.nextLine();
                            ((Carnes) inventario.get(pos)).setLugar(lugar);
                            System.out.print("Cantidad en inventario: ");
                            int cantidad = leer.nextInt();
                            ((Carnes) inventario.get(pos)).setCantidad(cantidad);
                            System.out.print("Tipo [res, carne blanca, cerdo]: ");
                            String tipo = leerS.nextLine();
                            ((Carnes) inventario.get(pos)).setTipo(tipo);
                            System.out.print("Precio: ");
                            double precio = leer.nextDouble();
                            ((Carnes) inventario.get(pos)).setPrecio(precio);
                            
                            System.out.println();
                            System.out.println("Producto modificado exitosamente");
                                     
                        }
                        else if (inventario.get(pos) instanceof Frutaverdu){
                            System.out.print("Categoria [fruta, verdura]: ");
                            String categoria = leerS.nextLine();
                            if (categoria.equalsIgnoreCase("fruta")) {
                                System.out.print("Categoria de fruta [citricos, tropical, grano, rica en fibra]: ");
                                categoria2 = leerS.nextLine();
                                ((Frutaverdu)inventario.get(pos)).setCategoria(categoria2);
                            } else {
                                System.out.print("Categoria de verdura [tuberculos, legumbres, hojas]: ");
                                categoria2 = leerS.nextLine();
                                ((Frutaverdu)inventario.get(pos)).setCategoria(categoria2);
                            }
                            System.out.print("Precio: ");
                            double precio = leer.nextDouble();
                            ((Frutaverdu)inventario.get(pos)).setPrecio(precio);
                            System.out.print("Cantidad a inventariar: ");
                            int cantidad = leer.nextInt();
                            ((Frutaverdu)inventario.get(pos)).setCantidad(cantidad);
                            
                            System.out.println();
                            System.out.println("Producto modificado exitosamente");

                        }
                        
                    
                    break;
                    
                case 3:
                    imprimir(inventario);
                    System.out.println();
                    System.out.print("Ingrese la posicion del producto a eliminar: ");
                    int elim = leer.nextInt();
                    
                     while (elim<0 ||  elim>inventario.size()-1){
                            System.out.println("posicion fuera de rango");
                            System.out.print("Ingrese la posicion de el producto a eliminar:");
                            pos = leer.nextInt();
                        }
                    inventario.remove(elim);
                    System.out.println("Producto eliminado exitosamente");
                    break;
                    
                case 4:
                    char resp='s';
                    while (resp=='s'|| resp=='S'){
                        System.out.println();
                        imprimirportipo("Granos",inventario);
                        System.out.println();
                        imprimirportipo("Proddlimpieza",inventario);
                        System.out.println();
                        imprimirportipo("Liquidos",inventario);
                        System.out.println();
                        imprimirportipo("Carnes",inventario);
                        System.out.println();
                        imprimirportipo("Frutaverdu",inventario);

                        System.out.println();
                        System.out.print("Ingrese la categoria de producto que quiere comprar \n [Granos, Productos de limpieza, Liquidos, Carnes, Frutas y Verduras]: ");
                        String prod = leerS.nextLine();

                        while (estacat(prod)==false){
                            System.out.println("Esa categoria no existe o esta mal escrita.");
                            System.out.print("Ingrese la categoria a comprar nuevamete: ");
                            prod = leerS.nextLine();
                        }

                        if (prod.equalsIgnoreCase("Granos")){
                            System.out.print("Ingrese el nombre del producto de esa categoria que desea comprar: ");
                            String prod2 =leerS.nextLine();
                            for (int i = 0; i < inventario.size(); i++) {
                                    if (inventario.get(i) instanceof Granos) {
                                        while ((!((Granos) inventario.get(i)).getNombre().equalsIgnoreCase(prod2))) {
                                            System.out.println("Este producto no esta en nuestro inventario");
                                            System.out.print("Ingrese otro producto: ");
                                            prod2 = leerS.nextLine();
                                        }

                                    }
                                }
                            System.out.print("Ingrese la cantidad de quintales a comprar: ");
                            int quint = leer.nextInt();

                            for (int i = 0; i < inventario.size(); i++) {
                                if (inventario.get(i) instanceof Granos){
                                    if (((Granos) inventario.get(i)).getNombre().equalsIgnoreCase(prod2)) {
                                        if (((Granos) inventario.get(i)).getQuintales() > 0 && ((Granos) inventario.get(i)).getQuintales() > quint || ((Granos) inventario.get(i)).getQuintales()== quint) {
                                            double tot = ((Granos) inventario.get(i)).getQuintales() - quint;
                                            ((Granos) inventario.get(i)).setQuintales(tot);
                                            cesta.add(inventario.get(i));
                                            System.out.println("Producto agregado a la cesta");
                                            double preciotot = (((Granos)inventario.get(i)).getPrecio()) * quint;
                                            preciototal+=preciotot;
                                        } else if (((Granos) inventario.get(i)).getQuintales() < quint) {
                                            while (((Granos) inventario.get(i)).getQuintales() < quint){
                                                System.out.println("No tenemos esa cantidad disponible");
                                                System.out.print("Ingrese cantidad de nuevo: ");
                                                quint=leer.nextInt();
                                            }

                                        } else if (((Granos) inventario.get(i)).getQuintales() == 0) {
                                            System.out.println("Ya no tenemos a ese producto en stock");
                                        }

                                    }
                                }

                            }
                        }
                        else if (prod.equalsIgnoreCase("Productos de limpieza")){
                            System.out.print("Ingrese el nombre del producto de esa categoria que desea comprar: ");
                            String prod2 =leerS.nextLine();
                            for (int i = 0; i < inventario.size(); i++) {
                                    if (inventario.get(i) instanceof Proddlimpieza) {
                                        while ((!((Proddlimpieza) inventario.get(i)).getNombre().equalsIgnoreCase(prod2))) {
                                            System.out.println("Este producto no esta en nuestro inventario");
                                            System.out.print("Ingrese otro producto: ");
                                            prod2 = leerS.nextLine();
                                        }

                                    }
                                }
                            System.out.print("Ingrese la cantidad a comprar: ");
                            int cant = leer.nextInt();

                            for (int i = 0; i < inventario.size(); i++) {
                                 if (inventario.get(i) instanceof Proddlimpieza){
                                    if (((Proddlimpieza) inventario.get(i)).getNombre().equalsIgnoreCase(prod2)) {
                                        if (((Proddlimpieza) inventario.get(i)).getCantidad()> 0 && (((Proddlimpieza) inventario.get(i)).getCantidad()> cant) || ((Proddlimpieza) inventario.get(i)).getCantidad()== cant) {
                                             int tot = ((Proddlimpieza) inventario.get(i)).getCantidad()- cant;
                                             ((Proddlimpieza) inventario.get(i)).setCantidad(tot);
                                             cesta.add(inventario.get(i));
                                             System.out.println("Producto agregado a la cesta");
                                             double preciotot = (((Proddlimpieza)inventario.get(i)).getPrecio()) * cant;
                                             preciototal+=preciotot;
                                         } else if (((Proddlimpieza) inventario.get(i)).getCantidad()< cant) {
                                             while (((Proddlimpieza) inventario.get(i)).getCantidad()< cant){
                                                 System.out.println("No tenemos esa cantidad disponible");
                                                 System.out.print("Ingrese cantidad de nuevo: ");
                                                 cant=leer.nextInt();
                                             }

                                         } else if (((Proddlimpieza) inventario.get(i)).getCantidad()== 0) {
                                             System.out.println("Ya no tenemos a ese producto en stock");
                                         }

                                     } 
                                }

                            }

                        }
                        else if (prod.equalsIgnoreCase("Liquidos")){
                            System.out.print("Ingrese el nombre del producto de esa categoria que desea comprar: ");
                            String prod2 = leerS.nextLine();
                            for (int i = 0; i < inventario.size(); i++) {
                                if (inventario.get(i) instanceof Liquidos) {
                                    while ((!((Liquidos) inventario.get(i)).getNombre().equalsIgnoreCase(prod2))) {
                                        System.out.println("Este producto no esta en nuestro inventario");
                                        System.out.print("Ingrese otro producto: ");
                                        prod2 = leerS.nextLine();
                                    }

                                }
                            }
                            System.out.print("Ingrese la cantidad a comprar: ");
                            int cant = leer.nextInt();

                            for (int i = 0; i < inventario.size(); i++) {
                                if (inventario.get(i) instanceof Liquidos){
                                    if (((Liquidos) inventario.get(i)).getNombre().equalsIgnoreCase(prod2)) {
                                        if ((((Liquidos) inventario.get(i)).getCantidad()) > 0 && ((Liquidos) inventario.get(i)).getCantidad()> cant || ((Liquidos) inventario.get(i)).getCantidad()== cant) {
                                            int tot = ((Liquidos) inventario.get(i)).getCantidad()- cant;
                                            ((Liquidos) inventario.get(i)).setCantidad(tot);
                                            cesta.add(inventario.get(i));
                                            System.out.println("Producto agregado a la cesta");
                                            double preciotot = (((Liquidos)inventario.get(i)).getPrecio()) * cant;
                                            preciototal+=preciotot;
                                        } else if (((Liquidos) inventario.get(i)).getCantidad()< cant) {
                                            while (((Liquidos) inventario.get(i)).getCantidad()< cant) {
                                                System.out.println("No tenemos esa cantidad disponible");
                                                System.out.print("Ingrese cantidad de nuevo: ");
                                                cant = leer.nextInt();
                                            }

                                        } else if (((Liquidos) inventario.get(i)).getCantidad()== 0) {
                                            System.out.println("Ya no tenemos a ese producto en stock");
                                        }

                                    }
                                }

                            }
                        }
                        else if (prod.equalsIgnoreCase("Carnes")){
                            System.out.print("Ingrese el tipo del producto de esa categoria que desea comprar: ");
                            String prod2 = leerS.nextLine();
                            for (int i = 0; i < inventario.size(); i++) {
                                if (inventario.get(i) instanceof Carnes) {
                                    while ((!((Carnes) inventario.get(i)).getTipo().equalsIgnoreCase(prod2))) {
                                        System.out.println("Este tipo no esta en nuestro inventario");
                                        System.out.print("Ingrese otro tipo: ");
                                        prod2 = leerS.nextLine();
                                    }

                                }
                            }
                            System.out.print("Ingrese la cantidad a comprar: ");
                            int cant = leer.nextInt();

                            for (int i = 0; i < inventario.size(); i++) {
                                if (inventario.get(i) instanceof Carnes){
                                    if (((Carnes) inventario.get(i)).getTipo().equalsIgnoreCase(prod2)) {
                                        if ((((Carnes) inventario.get(i)).getCantidad()) > 0 && ((Carnes) inventario.get(i)).getCantidad()> cant || ((Carnes) inventario.get(i)).getCantidad()== cant) {
                                            int tot = ((Carnes) inventario.get(i)).getCantidad()- cant;
                                            ((Carnes) inventario.get(i)).setCantidad(tot);
                                            cesta.add(inventario.get(i));
                                            System.out.println("Producto agregado a la cesta");
                                            double preciotot = (((Carnes)inventario.get(i)).getPrecio()) * cant;
                                            preciototal+=preciotot;
                                        } else if (((Carnes) inventario.get(i)).getCantidad()< cant) {
                                            while (((Carnes) inventario.get(i)).getCantidad()< cant) {
                                                System.out.println("No tenemos esa cantidad disponible");
                                                System.out.print("Ingrese cantidad de nuevo: ");
                                                cant = leer.nextInt();
                                            }

                                        } else if (((Carnes) inventario.get(i)).getCantidad()== 0) {
                                            System.out.println("Ya no tenemos a ese producto en stock");
                                        }

                                    }
                                }

                            }

                        }
                        else if (prod.equalsIgnoreCase("Frutas y verduras")){
                            System.out.print("Ingrese la categoria del producto que desea comprar: ");
                            String prod2 = leerS.nextLine();
                            for (int i = 0; i < inventario.size(); i++) {
                                if (inventario.get(i) instanceof Frutaverdu) {
                                    while ((!((Frutaverdu) inventario.get(i)).getCategoria().equalsIgnoreCase(prod2))) {
                                        System.out.println("Este producto no esta en nuestro inventario");
                                        System.out.print("Ingrese otra categoria: ");
                                        prod2 = leerS.nextLine();
                                    }

                                }
                            }
                            System.out.print("Ingrese la cantidad a comprar: ");
                            int cant = leer.nextInt();

                            for (int i = 0; i < inventario.size(); i++) {
                                 if (inventario.get(i) instanceof Frutaverdu){
                                    if (((Frutaverdu) inventario.get(i)).getCategoria().equalsIgnoreCase(prod2)) {
                                        if ((((Frutaverdu) inventario.get(i)).getCantidad()) > 0 && ((Frutaverdu) inventario.get(i)).getCantidad()> cant || ((Frutaverdu) inventario.get(i)).getCantidad()== cant) {
                                            int tot = ((Frutaverdu) inventario.get(i)).getCantidad()- cant;
                                            ((Frutaverdu) inventario.get(i)).setCantidad(tot);
                                            cesta.add(inventario.get(i));
                                            System.out.println("Producto agregado a la cesta");
                                            double preciotot = (((Frutaverdu)inventario.get(i)).getPrecio()) * cant;
                                            preciototal+=preciotot;
                                        } else if (((Frutaverdu) inventario.get(i)).getCantidad()< cant) {
                                            while (((Frutaverdu) inventario.get(i)).getCantidad()< cant) {
                                                System.out.println("No tenemos esa cantidad disponible");
                                                System.out.print("Ingrese cantidad de nuevo: ");
                                                cant = leer.nextInt();
                                            }

                                        } else if (((Frutaverdu) inventario.get(i)).getCantidad()== 0) {
                                            System.out.println("Ya no tenemos a ese producto en stock");
                                        }

                                    }
                                 }

                            }

                        }
                        
                        System.out.print("Desea poner mas productos en su cesta? [s/n]: ");
                        resp=leerS.next().charAt(0);
                    }
                    impuesto= preciototal * 0.12;
                    preciototal=preciototal + impuesto;
                    imprimircesta(cesta);
                    System.out.println("Impuesto: " + impuesto);
                    System.out.println("Total a pagar: " + preciototal);
                    
                    break;
                    
                case 5:
                    System.out.println();
                    imprimirportipo("Granos",inventario);
                    System.out.println();
                    imprimirportipo("Proddlimpieza",inventario);
                    System.out.println();
                    imprimirportipo("Liquidos",inventario);
                    System.out.println();
                    imprimirportipo("Carnes",inventario);
                    System.out.println();
                    imprimirportipo("Frutaverdu",inventario);
                    System.out.println();
                    
                    break;
            }//fin main switch
            System.out.println();
            System.out.print("* * * * * M E N U * * * * *");
            System.out.print("\n 1. Agregar producto \n 2. Modificar producto \n 3. Eliminar producto"
                    + "\n 4. Simulacion de facturacion \n 5. Reporte \n 6. Salir \n Ingrese una opcion: ");
            opcion = leer.nextInt();
        }//fin while
    }
    
    public static void imprimir (ArrayList lista){
        System.out.println();
        System.out.println("* * * * Inventario * * * * ");
        for(int i=0; i<lista.size(); i++){
            Object prod = lista.get(i);
            System.out.println((i) + ". "+ prod.toString());
        }   
    }
    
    public static void imprimircesta (ArrayList lista){
        System.out.println();
        System.out.println("* * * * Productos comprados * * * * ");
        for(int i=0; i<lista.size(); i++){
            Object prod = lista.get(i);
            System.out.println((i) + ". "+ prod.toString());
        }   
    }
    public static void imprimirfactura(ArrayList lista){
        System.out.println();
        System.out.println("* * * * factura * * * * ");
        for(int i=0; i<lista.size(); i++){
            Object prod = lista.get(i);
            System.out.println((i) + ". "+ prod);
        }   
    }
    
    public static void imprimirportipo (String categoria, ArrayList lista) {
      
        if (categoria.equalsIgnoreCase("Proddlimpieza") ){
            String categoria2="Productos de limpieza";
             System.out.println("\n" + categoria2);
        }
        else if (categoria.equalsIgnoreCase("Frutaverdu")){
            String categoria2="Frutas y Verduras";
            System.out.println("\n" + categoria2);
        }
        else{
            System.out.println(categoria);
        }
        
        for (int i = 0; i < lista.size(); i++) {
            Object temp = lista.get(i);
            String clase = temp.getClass().getName();

            if (clase.endsWith(categoria)) {
                System.out.println((i) + ". " + temp.toString());
            }
        }
        
    }
    
    public static boolean estacat (String categoria){
        String [] cat = {"Granos","Productos de limpieza", "Liquidos", "Carnes","Frutas y Verduras"};
                    
        for (int i = 0; i < cat.length; i++) {
            if (categoria.equalsIgnoreCase(cat[i])){
                return true;
            }
                
        }
        return false;
    }
    
    public static boolean estaprod (String prod, ArrayList lista){
                    
        for (int i = 0; i < lista.size(); i++) {
            Object temp = lista.get(i);
            String clase = temp.getClass().getName();

            if (clase.endsWith(prod)) {
                return true;
            }
        }
        return false;
    }
        
        
    
}

    

