package dk.via.slaughterhouse.controllers.implementations;

import dk.via.slaughterhouse.client.implementations.AnimalTypeClientImpl;
import dk.via.slaughterhouse.client.interfaces.AnimalTypeClient;
import dk.via.slaughterhouse.controllers.interfaces.AnimalTypeController;
import dk.via.slaughterhouse.dto.AnimalTypeDTO;
import dk.via.slaughterhouse.model.AnimalType;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/animaltype")
public class AnimalTypeControllerImpl implements AnimalTypeController {
    private AnimalTypeClient animalTypeClient;

    public AnimalTypeControllerImpl() {
        this.animalTypeClient = new AnimalTypeClientImpl();
    }

    @GetMapping("/{id}")
    public ResponseEntity<AnimalType> getAnimalType(@PathVariable("id") Long id) {
        try {
            AnimalType animalType = animalTypeClient.getAnimalType(id);
            if (animalType != null) {
                return new ResponseEntity<>(animalType, HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping
    public ResponseEntity<String> createAnimalType(@RequestBody AnimalTypeDTO dto) {
        try {
            String res = animalTypeClient.createAnimalType(dto);
            return new ResponseEntity<>(res, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
}
