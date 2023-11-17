package dk.via.slaughterhouse.controllers.interfaces;

import dk.via.slaughterhouse.dto.AnimalPartTypeDTO;
import dk.via.slaughterhouse.model.AnimalPartType;
import org.springframework.http.ResponseEntity;

public interface AnimalPartTypeController {
    ResponseEntity<AnimalPartType> getAnimalPartType(Long id);
    ResponseEntity<String> createAnimalPartType(AnimalPartTypeDTO dto);
}
