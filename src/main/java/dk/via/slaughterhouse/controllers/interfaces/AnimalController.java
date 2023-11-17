package dk.via.slaughterhouse.controllers.interfaces;

import dk.via.slaughterhouse.dto.AnimalDTO;
import dk.via.slaughterhouse.model.Animal;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface AnimalController {
    ResponseEntity<List<Long>> getAllAnimalsInProduct(Long id);
    ResponseEntity<String> createAnimal(AnimalDTO dto);
    ResponseEntity<Animal> getAnimalById(Long id);
}
