package dk.via.slaughterhouse.client.interfaces;

import dk.via.slaughterhouse.dto.AnimalTypeDTO;
import dk.via.slaughterhouse.model.AnimalType;

public interface AnimalTypeClient {
    String createAnimalType(AnimalTypeDTO animalTypeDTO);
    AnimalType getAnimalType(Long animalTypeId);
}
