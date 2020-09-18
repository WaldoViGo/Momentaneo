/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WS;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Wart
 */
@WebService(serviceName = "Transacciones")
public class Transacciones {

    /**
     * This is a sample web service operation
     
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }*/
     
    @WebMethod(operationName = "retirar")
    public boolean retirar(@WebParam(name = "idcliente1") int IDCliente, @WebParam(name = "montoretirar") int monto) {
        boolean bandera=true;
        int clientes[][]={{1,1,455},{3,1,300},{4,2,40},{2,2,50}};
        if(IDCliente==4 ||IDCliente==2){
            bandera=false;
        }
        if((clientes[0][2]<monto) ||(clientes[1][2]<monto)){
            bandera=false;
        }
        if(IDCliente==1){
            clientes[0][2] -= monto;
        }
        if(IDCliente==3){
            clientes[1][2] -= monto;
        }
        return bandera;
        
    }
        @WebMethod(operationName = "abonar")
    public boolean abonar(@WebParam(name = "idcliente2") int IDCliente, @WebParam(name = "montoabonar") int monto) {
        boolean bandera=true;
        int clientes[][]={{1,1,455},{3,1,300},{4,2,40},{2,2,50}};
        if(IDCliente==1 ||IDCliente==3){
            bandera=false;
        }
         if(IDCliente==2){
            clientes[3][2] += monto;
        }
        if(IDCliente==4){
            clientes[2][2] += monto;
        }
        return bandera;
    }
}

