package dk.via.slaughterhouse.client.interfaces;

import dk.via.slaughterhouse.dto.AnimalPartDTO;
import dk.via.slaughterhouse.model.AnimalPart;

public interface AnimalPartClient {
    String createAnimalPart(AnimalPartDTO animalPartDTO);
    AnimalPart getAnimalPart(Long animalPartId);
}
