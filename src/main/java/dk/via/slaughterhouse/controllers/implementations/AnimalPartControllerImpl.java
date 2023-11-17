package dk.via.slaughterhouse.controllers.implementations;

import dk.via.slaughterhouse.client.implementations.AnimalPartClientImpl;
import dk.via.slaughterhouse.client.interfaces.AnimalPartClient;
import dk.via.slaughterhouse.controllers.interfaces.AnimalPartController;
import dk.via.slaughterhouse.dto.AnimalPartDTO;
import dk.via.slaughterhouse.model.AnimalPart;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/animalpart")
public class AnimalPartControllerImpl implements AnimalPartController {
    private AnimalPartClient animalPartClient;

    public AnimalPartControllerImpl() {
        this.animalPartClient = new AnimalPartClientImpl();
    }

    @GetMapping("/{id}")
    public ResponseEntity<AnimalPart> getAnimalPart(@PathVariable("id") Long id) {
        try {
            AnimalPart animalPart = animalPartClient.getAnimalPart(id);
            if (animalPart != null) {
                return new ResponseEntity<>(animalPart, HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @PostMapping
    public ResponseEntity<String> createAnimalPart(@RequestBody AnimalPartDTO dto) {
        try {
            String res = animalPartClient.createAnimalPart(dto);
            return new ResponseEntity<>(res, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
}
