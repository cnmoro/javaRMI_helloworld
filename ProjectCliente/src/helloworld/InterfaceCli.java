package helloworld;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface InterfaceCli extends Remote {

    public void echo(String texto) throws RemoteException;
}
