import Classes.Banco;
import Classes.Cliente;

public class Main {
    public static void main(String[] args) {
        Cliente cliente1= new Cliente("Manuela", 38549876);

        Banco bancoProvincia= new Banco("Banco Provincia");
        bancoProvincia.crearCliente(cliente1);
        System.out.print(bancoProvincia.getClientes());
    }
}