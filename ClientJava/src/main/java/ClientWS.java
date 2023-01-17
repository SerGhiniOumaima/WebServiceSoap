import proxy.BanqueService;
import proxy.BanqueService_Service;

public class ClientWS {
    public static void main(String[] args) {
        //consommer le web service
        //instancier le web service
        //BanqueService est une interface java générée par le proxy depuis le wsdl
        //BanqueService_Service() est le nom du web service
        //stub est un objt middlware qui fait la cnx entre l'app et le web service
        BanqueService stub=new BanqueService_Service().getBanqueServicePort();
        System.out.println(stub.convert(7500));
    }
}
