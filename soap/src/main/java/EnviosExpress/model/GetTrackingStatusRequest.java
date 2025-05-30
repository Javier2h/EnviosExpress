package EnviosExpress.dto;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetTrackingStatusRequest")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetTrackingStatusRequest {

    private String trackingNumber;
}
