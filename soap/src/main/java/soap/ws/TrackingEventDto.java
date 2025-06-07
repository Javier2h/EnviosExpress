package soap.ws;

// lo creamos con el propocito de Buenas praticas de programacion
// se usa para asegurar el encapsulamiento de los datos
import jakarta.xml.bind.annotation.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import java.util.Date;

@XmlAccessorType(XmlAccessType.FIELD)
// especifio lo que necesito del XML
@XmlType(name = "TrackingEventDto", propOrder = {
        "date", "description", "location"
})
@XmlRootElement(name = "event")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TrackingEventDto {

    @XmlElement(name = "date",required = true)
    private Date date;

    @XmlElement(name = "description", required = true)
    private String description;

    @XmlElement(name = "location", required = true)
    private String location;
}
