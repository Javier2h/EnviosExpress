package soap.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.Date;

// Clase para crear los eventos, la otra clase agrupa los eventos, esta eambio es para crear los eventos (la tabla eventos)

@Entity
@Table(name = "tracking_event")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TrackingEvent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Le agregamos tambien el tiempo no solo la fecha, esto se lo ahce para mayor exactitud para la revicion
    @Column(name = "event_date", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    @Column(name = "description", nullable = false, length = 100)
    private String description;

    @Column(name = "location", nullable = false, length = 100)
    private String location;


    // Aqui asociamos con la talba de package la relacion
    @ManyToOne
    @JoinColumn(name = "package_id", nullable = false)
    private Package aPackage;

}
