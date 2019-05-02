package helloworld;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Servidor {

    public static void main(String[] args) throws RemoteException {
        try {
            Registry servicoNomes = LocateRegistry.createRegistry(1099);

            ServImpl serventeServidor = new ServImpl();

            servicoNomes.bind("ReferenciaServenteServidor", serventeServidor);

            System.out.println("Server OK");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
