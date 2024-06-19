package Classes;

import java.util.ArrayList;

public class Banco {
    private String nombre;
    ArrayList<Cliente> clientes;
    public Banco(String nombre){
        this.nombre=nombre;
        this.clientes= new ArrayList<Cliente>();


    }
    public void crearCliente(Cliente cliente){
        clientes.add(cliente);
    }
    public ArrayList<Cliente>  getClientes(){
        return  this.clientes;
    }
}
