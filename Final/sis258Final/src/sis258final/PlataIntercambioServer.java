package sis258final;
/**
 *
 * @author Wart
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.rmi.*;
import java.rmi.registry.*;
import java.rmi.server.*;


public class PlataIntercambioServer 
    extends UnicastRemoteObject
    implements InterfaceSitioComercio
	 
{
    PlataIntercambioServer() throws java.rmi.RemoteException{
	super();
    }
    
   @Override
    public boolean realizarTransaccion(int IdCliente, int IdVendedor, int monto, String moneda) throws RemoteException {
        boolean bandera=true;
        switch (moneda) {
           case "dolar":
           int cotizacion = cotizador();
           int montobolivianos = cotizacion*monto;
           boolean retiro =true;
           
           try { // Call Web Service Operation
               ws.Transacciones_Service service = new ws.Transacciones_Service();
               ws.Transacciones port = service.getTransaccionesPort();
               // TODO initialize WS operation arguments here
               int idcliente1 = IdCliente;
               int montoretirar = montobolivianos;
               // TODO process result here
               boolean result = port.retirar(idcliente1, montoretirar);
               retiro=result;
           } catch (Exception ex) {
               // TODO handle custom exceptions here
           }


           boolean abono=true;
           
           try { // Call Web Service Operation
               ws.Transacciones_Service service = new ws.Transacciones_Service();
               ws.Transacciones port = service.getTransaccionesPort();
               // TODO initialize WS operation arguments here
               int idcliente2 = IdVendedor;
               int montoabonar = montobolivianos;
               // TODO process result here
               boolean result = port.abonar(idcliente2, montoabonar);
               abono=result;
           } catch (Exception ex) {
               // TODO handle custom exceptions here
           }

           if(!retiro|| !abono){
               bandera = false;
           }
               break;
            case "boliviano":
            boolean retirob =true;
           
           try { // Call Web Service Operation
               ws.Transacciones_Service service = new ws.Transacciones_Service();
               ws.Transacciones port = service.getTransaccionesPort();
               // TODO initialize WS operation arguments here
               int idcliente1 = IdCliente;
               int montoretirar = monto;
               // TODO process result here
               boolean result = port.retirar(idcliente1, montoretirar);
                retirob=result;
           } catch (Exception ex) {
               // TODO handle custom exceptions here
           }


           boolean abonob=true;
           
           try { // Call Web Service Operation
               ws.Transacciones_Service service = new ws.Transacciones_Service();
               ws.Transacciones port = service.getTransaccionesPort();
               // TODO initialize WS operation arguments here
               int idcliente2 = IdVendedor;
               int montoabonar = monto;
               // TODO process result here
               boolean result = port.abonar(idcliente2, montoabonar);
               abonob=result;
           } catch (Exception ex) {
               // TODO handle custom exceptions here
           }
      
           if(!retirob || !abonob){
               bandera = false;
           }
                break;
           default:
               bandera=false;
        }
        return bandera;
    }
    
    private int cotizador(){
        int port = 5001; // puerto de comunicacion
        int cambio =0;
        try{
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            String cadena ="11-11-20";
           
            Socket client = new Socket("localhost", port); //conectarse al socket
            
            PrintStream toServer = new PrintStream(client.getOutputStream());
            BufferedReader fromServer = new BufferedReader(new InputStreamReader(client.getInputStream()));
            
            toServer.println(cadena);  //mandar alservidor 
            String result = fromServer.readLine();  // devolver del servidor
            cambio = Integer.parseInt(result);    
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
        return cambio;
    }
    
    public static void main(String args[]) { 
	try {
	    PlataIntercambioServer ServidorBanco;
	    LocateRegistry.createRegistry(1099);
	    ServidorBanco=new PlataIntercambioServer(); 
	    Naming.bind("Transaccion", ServidorBanco); 
            System.out.println("El servidor del Banco esta listo\n");
        }
	catch (Exception e){
	    e.printStackTrace();
	}
    }     
}
