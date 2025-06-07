package soap.services.impl;

// Clase para la implementacion, que es la logica del webservice
import jakarta.jws.WebService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import soap.model.Package;
import soap.repository.PackageRepository;
import soap.services.TrackingService;
import soap.ws.GetTrackingStatusRequest;
import soap.ws.GetTrackingStatusResponse;
import soap.ws.TrackingEventDto;

import java.util.List;

@Component

// Le damo nombre a nuestro servicio
@WebService(endpointInterface = "soap.services.TrackingService", serviceName = "TrackingService")
@RequiredArgsConstructor
public class TrackingServiceimpl implements TrackingService {

    private final PackageRepository repository;

    @Override
    // esto seria el manejo de errores, por ejemplo si no encuentra el numero de rastreo me dice qu eno lo encontro.
    public GetTrackingStatusResponse getTrackingStatus(GetTrackingStatusRequest request) {
        // aqui usamos la funcion que creamos en el repositorio, de busqueda por trackingNumber
        Package pkg = repository.findByTrackingNumber(request.getTrackingNumber())
                .orElseThrow(() -> new RuntimeException("Paquete no encontrado"));


        // Creo la respuesta
        GetTrackingStatusResponse response = new GetTrackingStatusResponse();
        response.setStatus(pkg.getStatus());
        response.setCurrentLocation(pkg.getCurrentLocation());
        response.setEstimatedDeliveryDate(pkg.getEstimatedDeliveryDate());

        //  Esta parte me muestra el listado de los eventos
        List<TrackingEventDto> eventDtos = pkg.getEvents().stream().map(event -> {
            TrackingEventDto dto = new TrackingEventDto();
            dto.setDate(event.getDate());
            dto.setDescription(event.getDescription());
            dto.setLocation(event.getLocation());
            return dto;
        }).toList();

        response.setHistory(eventDtos);
        return response;
    }
}