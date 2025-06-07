
package soap.model;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "client")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Cliente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "Cedula", nullable = false, length = 10, unique = true)
    private String Cedula;
    @Column(name = "Nombre", nullable = false, length = 100)
    private String Nombre;
    @Column(name = "Apellido", nullable = false, length = 100)
    private String Apellido;
    @Column(name = "Correo", nullable = false, length = 100)
    private String Correo;
}
