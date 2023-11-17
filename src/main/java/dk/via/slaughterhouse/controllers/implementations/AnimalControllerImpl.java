package dk.via.slaughterhouse.controllers.implementations;

import dk.via.slaughterhouse.client.implementations.AnimalClientImpl;
import dk.via.slaughterhouse.client.interfaces.AnimalClient;
import dk.via.slaughterhouse.controllers.interfaces.AnimalController;
import dk.via.slaughterhouse.dto.AnimalDTO;
import dk.via.slaughterhouse.model.Animal;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class AnimalControllerImpl implements AnimalController {
    private AnimalClient animalClient;

    public AnimalControllerImpl() {
        this.animalClient = new AnimalClientImpl();
    }

    @GetMapping("/animals/{id}")
    public ResponseEntity<List<Long>> getAllAnimalsInProduct(@PathVariable("id") Long id) {
        try {
            List<Long> animals = animalClient.getAnimals(id);
            return new ResponseEntity<>(animals, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/animals")
    public ResponseEntity<String> createAnimal(@RequestBody AnimalDTO dto) {
        try {
            String res = animalClient.createAnimal(dto);
            return new ResponseEntity<>(res, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/animal/{id}")
    public ResponseEntity<Animal> getAnimalById(@PathVariable("id") Long id) {
        try {
            Animal animal = animalClient.getAnimal(id);
            if (animal != null) {
                return new ResponseEntity<>(animal, HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
}
