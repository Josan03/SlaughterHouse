package dk.via.slaughterhouse.repository;

import dk.via.slaughterhouse.model.AnimalPartType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AnimalPartTypeRepository extends JpaRepository<AnimalPartType, Long> {
}
