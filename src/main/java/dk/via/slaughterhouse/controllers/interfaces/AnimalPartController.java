package dk.via.slaughterhouse.controllers.interfaces;

import dk.via.slaughterhouse.dto.AnimalPartDTO;
import dk.via.slaughterhouse.model.AnimalPart;
import org.springframework.http.ResponseEntity;

public interface AnimalPartController {
    ResponseEntity<AnimalPart> getAnimalPart(Long id);
    ResponseEntity<String> createAnimalPart(AnimalPartDTO dto);
}
