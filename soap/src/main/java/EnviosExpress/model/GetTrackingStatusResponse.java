package EnviosExpress.dto;

import EnviosExpress.model.TrackingEvent;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetTrackingStatusResponse")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetTrackingStatusResponse {

    private String status;

    private String currentLocation;

    private Date estimatedDeliveryDate;

    @XmlElement(name = "event")
    private List<TrackingEvent> history;
}
