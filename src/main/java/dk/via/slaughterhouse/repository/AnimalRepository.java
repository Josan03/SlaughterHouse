package dk.via.slaughterhouse.repository;

import dk.via.slaughterhouse.model.Animal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AnimalRepository extends JpaRepository<Animal, Long> {
    @Query("SELECT a.id FROM Animal a WHERE a.id IN (SELECT DISTINCT a.id FROM AnimalPart ap WHERE ap.product.id = ?1)")
    List<Long> findAnimalIdsByProductId(Long productId);
}
