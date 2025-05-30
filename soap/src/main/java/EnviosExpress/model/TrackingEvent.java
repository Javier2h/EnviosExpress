package EnviosExpress.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "tracking_event")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TrackingEvent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "event_date", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    @Column(name = "description", nullable = false, length = 100)
    private String description;

    @Column(name = "location", nullable = false, length = 100)
    private String location;

    @ManyToOne
    @JoinColumn(name = "package_id", nullable = false)
    private Package aPackage;
}
