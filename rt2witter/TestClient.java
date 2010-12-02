import java.net.* ;
import java.io.* ;

public class TestClient {
    public static void main(String[] args) {
        
        try {
            Socket socket = new Socket("localhost",7777) ;
            PrintWriter out  = new PrintWriter(socket.getOutputStream(),true) ;
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

	    // envoie de la requete au serveur
            out.println("ceci est une phrase en minuscule") ;

	    // attente de la reponse du serveur
	    String response = in.readLine() ;
	    
	    System.out.println("Reponse du serveur :") ;
	    System.out.println(response) ;

        } catch(UnknownHostException e) {
            System.out.println("The server may be down") ;
        } catch(IOException e) {
            System.out.println("I/O error") ;
        }
        

        



    }

}