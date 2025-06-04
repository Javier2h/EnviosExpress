package soap.services;

import soap.ws.GetTrackingStatusRequest;
import soap.ws.GetTrackingStatusResponse;
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
