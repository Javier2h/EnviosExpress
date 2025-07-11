package soap.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;
import java.util.Date;
import java.util.List;

// Clase para crear la tabla de los paquetes, es hecho como la clase 1

@Entity
@Table(name = "package")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Package {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "tracking_number", nullable = false, unique = true, length = 50)
    private String trackingNumber;

    @Column(name = "sender_name", nullable = false, length = 50)
    private String senderName;

    @Column(name = "receiver_name", nullable = false, length = 50)
    private String receiverName;

    @Column(name = "origin", nullable = false, length = 50)
    private String origin;

    @Column(name = "destination", nullable = false, length = 50)
    private String destination;

    @Column(name = "weight", nullable = true)
    private int weight;

    @Column(name = "dimensions", nullable = false, length = 100)
    private String dimensions;

    @Column(name = "status", nullable = false, length = 100)
    private String status;

    @Column(name = "current_location", nullable = false, length = 100)
    private String currentLocation;

    @Column(name = "estimated_delivery_date", nullable = false)
    private Date estimatedDeliveryDate;


    // En este apartado lo que ahcemos es especificar que tiene una relacion con la otra tabla
    // En este caso un paquete puede tener varios eventos, por lo cual la relacion es de uno a varios
    @OneToMany(mappedBy = "aPackage", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<TrackingEvent> events;



}
