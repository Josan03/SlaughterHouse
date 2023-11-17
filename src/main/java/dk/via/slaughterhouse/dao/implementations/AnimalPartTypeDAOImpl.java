package dk.via.slaughterhouse.dao.implementations;

import dk.via.slaughterhouse.dao.interfaces.AnimalPartTypeDAO;
import dk.via.slaughterhouse.model.AnimalPartType;
import dk.via.slaughterhouse.repository.AnimalPartTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AnimalPartTypeDAOImpl implements AnimalPartTypeDAO {
    @Autowired
    private AnimalPartTypeRepository animalPartTypeRepository;

    @Override
    public AnimalPartType createAnimalPartType(AnimalPartType animalPartType) {
        return animalPartTypeRepository.save(animalPartType);
    }

    @Override
    public AnimalPartType getAnimalPartType(Long id) {
        return animalPartTypeRepository.findById(id).orElse(null);
    }
}
