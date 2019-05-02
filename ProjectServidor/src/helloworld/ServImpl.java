package helloworld;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ServImpl extends UnicastRemoteObject implements InterfaceServ {

    public ServImpl() throws RemoteException {
    }

    public void chamar(String texto, InterfaceCli cliente) throws RemoteException {
        cliente.echo("realizando chamar(): " + texto);
    }

}
