package soap.ws;

import java.time.LocalDate;
import java.util.List;

import soap.model.TrackingEvent;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Data;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetTrackingStatusResponse" )
@Data
public class GetTrackingStatusResponse {

    private String status;
    private String currentLocation;
    private LocalDate estimatedDeliveryDate;
    private List<TrackingEvent> history;
}
