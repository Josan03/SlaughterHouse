package dk.via.slaughterhouse.client.interfaces;

import dk.via.slaughterhouse.dto.AnimalPartTypeDTO;
import dk.via.slaughterhouse.model.AnimalPartType;

public interface AnimalPartTypeClient {
    String createAnimalPartType(AnimalPartTypeDTO animalPartTypeDTO);
    AnimalPartType getAnimalPartType(Long animalPartTypeId);
}
