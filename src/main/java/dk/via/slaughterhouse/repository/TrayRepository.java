package dk.via.slaughterhouse.repository;

import dk.via.slaughterhouse.model.Tray;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrayRepository extends JpaRepository<Tray, Long> {
}
