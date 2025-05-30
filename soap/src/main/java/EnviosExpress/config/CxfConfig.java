package EnviosExpress.config;

import jakarta.xml.ws.Endpoint;
import org.apache.cxf.Bus;
import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import EnviosExpress.services.Impl.TrackingServiceImpl;

@Configuration
public class CxfConfig {
    @Bean
    public Endpoint endpoint(Bus bus, TrackingServiceImpl trackingService) {
        EndpointImpl endpoint = new EndpointImpl(bus, trackingService);
        endpoint.publish("/EnviosExpress");
        return endpoint;
    }
}
