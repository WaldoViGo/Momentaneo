/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package votacion;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Wart
 */
@WebService(serviceName = "WService_Votacion")
public class WService_Votacion {

    /**
     * This is a sample web service operation
     */
   /* @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "votos")
    public String votos(@WebParam(name="sigla") String sigla,@WebParam(name="formato")String formato) {
        //TODO write your implementation code here:
        /**if(formato.equals("votos")&& (sigla.equals("cc")))
        {
           
            String vots="2.162.311";
            System.out.println(Boolean.parseBoolean(vots));
        }*/
        switch ("formato")
        { 
            case "voto":
                switch (sigla){
                    case "cc":
                        sigla ="CC";
                        formato="2.162.311";
                        System.out.println(formato);
                    break;
                     case "fpv":
                        sigla ="FPV";
                        formato="22.671";
                    break;
                     case "mts":
                        sigla ="MTS";
                        formato="74.074";
                    break;
                     case "ucs":
                        sigla ="UCS";
                        formato="24.993";
                    break;
                     case "mas-isp":
                        sigla ="MAS-ISP";
                        formato="2.757.673";
                    break;
                     case "21f":
                        sigla ="21F";
                        formato="247.861";
                    break;
                    case "pdc":
                        sigla ="PDC";
                        formato="517.368";
                    break;
                     case "mnr":
                        sigla ="MNR";
                        formato="40.323";
                    break;
                     case "pan-bol":
                        sigla ="PAN-BOL";
                        formato="38.511";
                    break;
                }            
    
    }return null;
    }
    @WebMethod(operationName = "porcentaje")
    public void porcentaje(@WebParam(name="sigla") String sigla,@WebParam(name="formato")String formato) {
        switch("formato")
            {
            case "porcentaje":
                switch (sigla){
                    case "CC":
                        sigla ="CC";
                        formato="36.74 %";
                    break;
                     case "fpv":
                        sigla ="FPV";
                        formato="0.39 %";
                    break;
                     case "mts":
                        sigla ="MTS";
                        formato="1.26 %";
                    break;
                     case "ucs":
                        sigla ="UCS";
                        formato="0.42 %";
                    break;
                     case "mas-isp":
                        sigla ="MAS-ISP";
                        formato="46.85 %";
                    break;
                     case "21f":
                        sigla ="21F";
                        formato="4.21 %";
                    break;
                    case "pdc":
                        sigla ="PDC";
                        formato="8.79 %";
                    break;
                     case "mnr":
                        sigla ="MNR";
                        formato="0.69.%";
                    break;
                     case "pan-bol":
                        sigla ="PAN-BOL";
                        formato="0.75 %";
                    break;
            }
        }
    }
}
    
        
      
        /*s
    /**
     * Web service operation
     */
    /**
    @WebMethod(operationName = "porcentaje")
    public String porcentaje() {
        //TODO write your implementation code here:
        return null;
    }

    /**
     * Web service operation
     *//**
    @WebMethod(operationName = "sigla")
    public String sigla() {
        //TODO write your implementation code here:
        return null;
    }
*/

