package dk.via.slaughterhouse.dao.implementations;

import dk.via.slaughterhouse.dao.interfaces.AnimalTypeDAO;
import dk.via.slaughterhouse.model.AnimalType;
import dk.via.slaughterhouse.repository.AnimalTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AnimalTypeDAOImpl implements AnimalTypeDAO {
    @Autowired
    private AnimalTypeRepository animalTypeRepository;

    @Override
    public AnimalType createAnimalType(AnimalType animalType) {
        return animalTypeRepository.save(animalType);
    }

    @Override
    public AnimalType getAnimalType(Long id) {
        return animalTypeRepository.findById(id).orElse(null);
    }
}
