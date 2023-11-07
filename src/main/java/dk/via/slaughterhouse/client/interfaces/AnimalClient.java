package dk.via.slaughterhouse.client.interfaces;

import dk.via.slaughterhouse.dto.AnimalDTO;
import dk.via.slaughterhouse.model.Animal;

import java.util.List;

public interface AnimalClient {
    String createAnimal(AnimalDTO animalDTO);
    Animal getAnimal(Long animalId);
    List<Long> getAnimals(Long productId);
}
