package helloworld;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface InterfaceServ extends Remote {

    public void chamar(String texto, InterfaceCli cliente) throws RemoteException;
}
