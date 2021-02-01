package temp_converter;
import javax.xml.ws.Endpoint;

public class Server {

    public static void main(String[] args) {

        System.out.println("Endpoint in port 7778....");
        Endpoint.publish("http://localhost:7778/temperature/convert", new TempConverterImpl());
        //First comment
    }
}
