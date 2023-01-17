import WS.BanqueService;
import jakarta.xml.ws.Endpoint;

public class ServerWX {
    public static void main(String[] args) {
        //la methode publish pertmet de démarrer un serveur http
        //les param : le service BanqueService peut etre consulté a partie de n importe quelle machine
        Endpoint.publish("http://0.0.0.0:9191/",new BanqueService());
        System.out.println("Web service déployé sur http://0.0.0.0:9191" );
    }
}
