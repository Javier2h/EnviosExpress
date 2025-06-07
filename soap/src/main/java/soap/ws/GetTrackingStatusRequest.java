package soap.ws;

import jakarta.xml.bind.annotation.*;
import lombok.Data;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GetTrackingStatusRequest")

// Esta parte es la que nos genero un poco de problemas.
// Es de suma importancia asigna un namespace a los elementos XML para agruparlos.
// el nombre que se lo asigna si bien tienen reglas en si es solo un dominio que puede no existir, pero es para agrupar.
// pero si se la quiere modificar deberia ser en todos donde se lo utilice
@XmlRootElement(name = "GetTrackingStatus", namespace = "http://logistica.com/ws/tracking")
@Data
public class GetTrackingStatusRequest {

    // IGual aqui le asigno el mismo namespace
    @XmlElement(namespace = "http://logistica.com/ws/tracking")
    private String trackingNumber;
}
