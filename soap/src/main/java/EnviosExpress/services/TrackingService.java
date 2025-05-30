package EnviosExpress.services;

import EnviosExpress.ws.GetTrackingStatusRequest;
import EnviosExpress.ws.GetTrackingStatusResponse;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;


@WebService(name = "TrackingService")
public interface TrackingService {
    @WebMethod
    @WebResult(name = "GetTrackingStatusResponse")
    GetTrackingStatusResponse getTrackingStatus(
        @WebParam(name = "GetTrackingStatusRequest") GetTrackingStatusRequest request
    );
}
