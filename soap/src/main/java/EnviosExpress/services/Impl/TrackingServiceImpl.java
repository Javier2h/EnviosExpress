package EnviosExpress.services.Impl;

import jakarta.jws.WebService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import EnviosExpress.model.Package;
import EnviosExpress.repository.PackageRepository;
import EnviosExpress.services.TrackingService;
import EnviosExpress.ws.GetTrackingStatusRequest;
import EnviosExpress.ws.GetTrackingStatusResponse;

@Component
@WebService(endpointInterface = "soap.services.TrackingService", serviceName = "TrackingService")
@RequiredArgsConstructor
public class TrackingServiceImpl implements TrackingService {

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
