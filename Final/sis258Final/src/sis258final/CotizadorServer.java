package sis258final;
/**
 *
 * @author Wart
 */
import java.io.*;
import java.net.*;

public class CotizadorServer {
    public static void main(String[] args) throws InterruptedException{
        int port =5001; // puerto en el que escuchara el socket
        
        try {
            ServerSocket server = new ServerSocket(port); //instanciamos un servidor socket
            Socket client;      
            BufferedReader fromClient;  // buffer de lectura
            PrintStream toClient;       // stream para escritura
            while(true){   // ciclo al infinito para elfuncionamiento del server
                client = server.accept(); // el servidorse queda esperando establecer conexion 
                fromClient = new BufferedReader(new InputStreamReader(client.getInputStream())); // el lector
                String cadena;
                cadena = fromClient.readLine(); //cadena obtenida desde el lector
                
                String cadena2="7";
                
                toClient = new PrintStream(client.getOutputStream()); //prepara el objetopara devolver
                System.out.println(cadena+client.getInetAddress());
               
                
                toClient.flush(); // 
                toClient.println(cadena2);
                
            }
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
