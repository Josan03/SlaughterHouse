package dk.via.slaughterhouse.controllers.interfaces;

import dk.via.slaughterhouse.dto.AnimalTypeDTO;
import dk.via.slaughterhouse.model.AnimalType;
import org.springframework.http.ResponseEntity;

public interface AnimalTypeController {
    ResponseEntity<AnimalType> getAnimalType(Long id);
    ResponseEntity<String> createAnimalType(AnimalTypeDTO dto);
}
