package soap.config;

import jakarta.xml.ws.Endpoint;
import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import soap.services.TrackingService;

@Configuration
public class CxfConfig {
    @Bean
    public Endpoint clienteEndpoint(Bus bus, TrackingService trackingService) {
        System.out.println("Bus: " + bus);
        System.out.println("TrackingService: " + trackingService);

        EndpointImpl endpoint = new EndpointImpl(bus, trackingService);
        endpoint.publish("/Prueba");

        return endpoint;
    }


}
