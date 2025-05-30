package EnviosExpress.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import EnviosExpress.model.Package;

public interface PackageRepository extends JpaRepository<Package, String> {
}