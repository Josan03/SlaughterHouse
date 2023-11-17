package dk.via.slaughterhouse.controllers.implementations;

import dk.via.slaughterhouse.client.implementations.AnimalPartTypeClientImpl;
import dk.via.slaughterhouse.client.interfaces.AnimalPartTypeClient;
import dk.via.slaughterhouse.controllers.interfaces.AnimalPartTypeController;
import dk.via.slaughterhouse.dto.AnimalPartTypeDTO;
import dk.via.slaughterhouse.model.AnimalPartType;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/animalparttype")
public class AnimalPartTypeControllerImpl implements AnimalPartTypeController {
    private AnimalPartTypeClient animalPartTypeClient;

    public AnimalPartTypeControllerImpl() {
        this.animalPartTypeClient = new AnimalPartTypeClientImpl();
    }

    @GetMapping("/{id}")
    public ResponseEntity<AnimalPartType> getAnimalPartType(@PathVariable("id") Long id) {
        try {
            AnimalPartType animalPartType = animalPartTypeClient.getAnimalPartType(id);
            if (animalPartType != null) {
                return new ResponseEntity<>(animalPartType, HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping
    public ResponseEntity<String> createAnimalPartType(@RequestBody AnimalPartTypeDTO dto) {
        try {
            String res = animalPartTypeClient.createAnimalPartType(dto);
            return new ResponseEntity<>(res, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
}
