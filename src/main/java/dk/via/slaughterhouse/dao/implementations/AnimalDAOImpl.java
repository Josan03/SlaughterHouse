package dk.via.slaughterhouse.dao.implementations;

import dk.via.slaughterhouse.dao.interfaces.AnimalDAO;
import dk.via.slaughterhouse.model.Animal;
import dk.via.slaughterhouse.repository.AnimalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AnimalDAOImpl implements AnimalDAO {
    @Autowired
    private AnimalRepository animalRepository;

    @Override
    public Animal createAnimal(Animal animal) {
        return animalRepository.save(animal);
    }

    @Override
    public Animal getAnimal(Long id) {
        return animalRepository.findById(id).orElse(null);
    }

    @Override
    public List<Long> findAnimalIdsByProductId(Long id) {
        return animalRepository.findAnimalIdsByProductId(id);
    }
}
