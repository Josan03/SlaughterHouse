package dk.via.slaughterhouse.dao.interfaces;

import dk.via.slaughterhouse.model.AnimalPart;

public interface AnimalPartDAO {
    AnimalPart createAnimalPart(AnimalPart animalPart);
    AnimalPart getAnimalPart(Long id);
}
