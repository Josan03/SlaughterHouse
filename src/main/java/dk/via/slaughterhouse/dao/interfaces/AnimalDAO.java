package dk.via.slaughterhouse.dao.interfaces;

import dk.via.slaughterhouse.model.Animal;

import java.util.List;

public interface AnimalDAO {
    Animal createAnimal(Animal animal);
    Animal getAnimal(Long id);
    List<Long> findAnimalIdsByProductId(Long id);
}
