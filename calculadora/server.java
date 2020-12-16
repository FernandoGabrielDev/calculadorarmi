package calculadora;


import java.rmi.registry.Registry;

public class server {

    public server() {
        try {
            Registry r = java.rmi.registry.LocateRegistry.createRegistry(8080);
            rmi c = new functions();
            r.rebind("calculadora", c);
           System.out.println("Servidor iniciado!");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String args[]) {
        new server();
    }
}