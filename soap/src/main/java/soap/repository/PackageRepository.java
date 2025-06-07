package soap.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import soap.model.Package;

import java.util.Optional;


// aqui puse la fucnion de buscar el paquete por el numero de rastreo
public interface PackageRepository extends JpaRepository<Package, String> {
    Optional<Package> findByTrackingNumber(String trackingNumber);
}
