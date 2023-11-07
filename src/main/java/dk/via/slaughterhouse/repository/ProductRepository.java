package dk.via.slaughterhouse.repository;

import dk.via.slaughterhouse.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    @Query("SELECT p.id FROM Product p WHERE p.id IN (SELECT DISTINCT p.id FROM AnimalPart ap WHERE ap.animal.id = ?1)")
    List<Long> findProductIdsByAnimalId(Long animalId);
}
