package helloworld;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Cliente {

    public static void main(String[] args) throws RemoteException {
        try {
            Registry servicoNomes = LocateRegistry.getRegistry(1099);

            InterfaceServ interfaceServidor = (InterfaceServ) servicoNomes.lookup("ReferenciaServenteServidor");

            CliImpl serventeCliente = new CliImpl(interfaceServidor);

            serventeCliente.chamarServidor("teste usando metodo chamar() da ref do srv");
            serventeCliente.echo("teste echo() do proprio cliente");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
