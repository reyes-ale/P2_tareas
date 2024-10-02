
package tarea7_dragon_alejandrareyes;

import java.util.ArrayList;

/**
 *
 * @author aleja
 */
public class Empresa {
    ArrayList <Mascota> inventario = new ArrayList();
    ArrayList <Cliente> clientes = new ArrayList();

    public Empresa() {
    }

    public ArrayList<Mascota> getInventario() {
        return inventario;
    }

    public void setInventario(ArrayList<Mascota> inventario) {
        this.inventario = inventario;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    @Override
    public String toString() {
        return "Empresa{" + "inventario=" + inventario + ", clientes=" + clientes + '}';
    }
    
    
    
    
    
    
}
