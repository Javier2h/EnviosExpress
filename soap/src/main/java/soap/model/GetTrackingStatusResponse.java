package soap.model;

// Clase para guardar los evneto en una lista
// Es para la respuesta a la peticion que hacemos por el numero de rastreo

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.List;


// Aqui le digo que los elementos me los maneje con formato XML
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetTrackingStatusResponse")
// Para ya no poner los get o set de manera manual
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GetTrackingStatusResponse {

    private String status;

    private String currentLocation;


    @XmlElement(name = "event")
    private List<TrackingEvent> history;
}