package dk.via.slaughterhouse.dao.interfaces;

import dk.via.slaughterhouse.model.AnimalType;

public interface AnimalTypeDAO {
    AnimalType createAnimalType(AnimalType animalType);
    AnimalType getAnimalType(Long id);
}
