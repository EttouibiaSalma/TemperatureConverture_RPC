package temp_converter;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.URL;

public class Client {

    public static void main(String[] args) throws Exception {
        URL url  = new URL("http://localhost:7778/temperature/convert?wsdl");
        QName qname = new QName("http://temp_converter/", "TempConverterImplService");
        Service srv = Service.create(url, qname);
        TempConverter tmp =srv.getPort(TempConverter.class);
        System.out.println(tmp.ConvertTemp("F", 0));
        System.out.println(tmp.ConvertTemp("C", 0));

    }
}
