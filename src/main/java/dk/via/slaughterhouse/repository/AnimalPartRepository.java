package dk.via.slaughterhouse.repository;

import dk.via.slaughterhouse.model.AnimalPart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalPartRepository extends JpaRepository<AnimalPart, Long> {
}
