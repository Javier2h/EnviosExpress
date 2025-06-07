package soap.config;

import jakarta.xml.ws.Endpoint;
import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import soap.services.impl.ClienteServiceImpl;

@Configuration
public class CxfConfig {
    @Bean
    public Endpoint clienteEndpoint(Bus bus, ClienteServiceImpl clienteService) {
        System.out.println("Bus: " + bus);
        System.out.println("ClienteService: " + clienteService);

        EndpointImpl endpoint = new EndpointImpl(bus, clienteService);
        endpoint.publish("/ClienteService");

        return endpoint;
    }


}
