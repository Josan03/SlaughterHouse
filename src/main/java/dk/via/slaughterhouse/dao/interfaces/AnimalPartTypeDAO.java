package dk.via.slaughterhouse.dao.interfaces;

import dk.via.slaughterhouse.model.AnimalPartType;

public interface AnimalPartTypeDAO {
    AnimalPartType createAnimalPartType(AnimalPartType animalPartType);
    AnimalPartType getAnimalPartType(Long id);
}
