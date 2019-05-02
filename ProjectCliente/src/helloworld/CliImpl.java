package helloworld;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CliImpl extends UnicastRemoteObject implements InterfaceCli {

    String texto;
    InterfaceServ interfaceServer;

    public CliImpl(String texto) throws RemoteException {
        this.texto = texto;
    }

    public CliImpl(InterfaceServ interfaceServ) throws RemoteException {
        this.interfaceServer = interfaceServ;
    }

    @Override
    public void echo(String texto) throws RemoteException {
        System.out.println("fazendo echo(): " + texto);
    }

    public void chamarServidor(String texto) throws RemoteException {
        this.interfaceServer.chamar(texto, this);
    }

}
