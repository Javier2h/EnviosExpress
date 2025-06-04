package soap.services.impl;

import jakarta.jws.WebService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import soap.model.Package;
import soap.repository.PackageRepository;
import soap.services.TrackingService;
import soap.ws.GetTrackingStatusRequest;
import soap.ws.GetTrackingStatusResponse;

@Component
@WebService(endpointInterface = "soap.services.TrackingService", serviceName = "TrackingService")
@RequiredArgsConstructor
public class TrackingServiceimpl implements TrackingService {

    private final PackageRepository repository;

    @Override
    public GetTrackingStatusResponse getTrackingStatus(GetTrackingStatusRequest request) {
        Package pkg = repository.findById(request.getTrackingNumber()).orElse(null);

        if (pkg == null) return null;

        GetTrackingStatusResponse response = new GetTrackingStatusResponse();
        response.setStatus(pkg.getStatus());
        response.setCurrentLocation(pkg.getCurrentLocation());
        response.setHistory(pkg.getHistory());

        return response;
    }
}
