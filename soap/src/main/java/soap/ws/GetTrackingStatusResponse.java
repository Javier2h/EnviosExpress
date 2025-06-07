package soap.ws;


// Es para darle un formato a la respuesta
import jakarta.xml.bind.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetTrackingStatusResponse")
@XmlRootElement(name = "GetTrackingStatusResponse")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetTrackingStatusResponse {

    private String status;

    private String currentLocation;

    private Date estimatedDeliveryDate;


    // Listado de los eventos, que lo traemos del otro servicio TrackingEventDto
    @XmlElementWrapper(name = "history")
    @XmlElement(name = "event")
    private List<TrackingEventDto> history;

}
