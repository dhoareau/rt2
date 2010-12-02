import java.net.* ;
import java.io.* ;

public class TestServer {
    public static void main(String[] args) {
        
        try {
            ServerSocket socket = new ServerSocket(7777) ;
            Socket client = socket.accept() ;
            
            PrintWriter out  = new PrintWriter(client.getOutputStream(),true) ;
            BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));

            String firstline = in.readLine() ; 
	    System.out.println(firstline) ; //affiche sur l'ecran du serveur
            out.println(firstline.toUpperCase())  ;
        } catch (IOException e) {
            System.out.println("** input/output ERROR **") ;
        }

        



    }

}