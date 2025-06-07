package soap.services;

import soap.ws.GetTrackingStatusRequest;
import soap.ws.GetTrackingStatusResponse;
import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebResult;
import jakarta.jws.WebService;


// lo que hago es declarar que hay un servicio web llamado TrackingService
@WebService(name = "TrackingService")
public interface TrackingService {
    @WebMethod
    @WebResult(name = "GetTrackingStatusResponse")

    // con el get le pido el numero de rstareo  y retorno la respuesta
    GetTrackingStatusResponse getTrackingStatus(
            @WebParam(name = "GetTrackingStatusRequest") GetTrackingStatusRequest request
    );
}
