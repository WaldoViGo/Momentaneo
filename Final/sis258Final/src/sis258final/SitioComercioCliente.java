package sis258final;
/**
 *
 * @author Wart
 */
import java.rmi.Naming;
import java.util.Scanner;

public class SitioComercioCliente {
       public static void main(String args[]){
	InterfaceSitioComercio cotizar;
        Scanner sc =new Scanner(System.in);
        int idcliente;
        int idvendedor;
        int monto;
        String moneda;
	try {
	    cotizar=(InterfaceSitioComercio)Naming.lookup("rmi://localhost/Transaccion");
            System.out.println("Introduce ID del Cliente");
            idcliente=sc.nextInt();
	    System.out.println();
	    System.out.println("Introduce ID del Vendedor");
            idvendedor=sc.nextInt();
            System.out.println();
            System.out.println("Introduce el monto a depositar");
            monto=sc.nextInt();
            System.out.println();
            System.out.println("Introduce el tipo demoneda");
            moneda=sc.nextLine();
            System.out.println();
            boolean transaccion=cotizar.realizarTransaccion(idcliente,idvendedor,monto,moneda);
            if(transaccion){
                System.out.println("Transaccion realizada");
            }else{
                System.out.println("Transaccion no realizada");
            }
	}
	catch (Exception e){
	    e.printStackTrace();
	}
    } 
}

