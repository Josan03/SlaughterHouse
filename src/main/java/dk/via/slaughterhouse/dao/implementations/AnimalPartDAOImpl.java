package dk.via.slaughterhouse.dao.implementations;

import dk.via.slaughterhouse.dao.interfaces.AnimalPartDAO;
import dk.via.slaughterhouse.model.AnimalPart;
import dk.via.slaughterhouse.repository.AnimalPartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AnimalPartDAOImpl implements AnimalPartDAO {
    @Autowired
    private AnimalPartRepository animalPartRepository;

    @Override
    public AnimalPart createAnimalPart(AnimalPart animalPart) {
        return animalPartRepository.save(animalPart);
    }

    @Override
    public AnimalPart getAnimalPart(Long id) {
        return animalPartRepository.findById(id).orElse(null);
    }
}
