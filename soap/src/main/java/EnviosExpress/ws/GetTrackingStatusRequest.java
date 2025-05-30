package EnviosExpress.ws;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;
import lombok.Data;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetTrackingStatusRequest")
@Data
public class GetTrackingStatusRequest {

    private String trackingNumber;
}
