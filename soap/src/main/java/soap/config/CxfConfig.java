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

        // Aqui podemos elegir cual es nuestra direccion para acceder al servicio
        // puede ser cualquier /prueba o como el nuestro que le pusimos /tracking

        endpoint.publish("/tracking");

        return endpoint;
    }


}
