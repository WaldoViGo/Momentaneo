package sis258final;
/**
 *
 * @author Wart
 */
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface InterfaceSitioComercio extends Remote{
   boolean realizarTransaccion(int IDCliente, int IDVendedor, int monto, String moneda)throws RemoteException;
}