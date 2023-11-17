package dk.via.slaughterhouse.dao.implementations;

import dk.via.slaughterhouse.dao.interfaces.TrayDAO;
import dk.via.slaughterhouse.model.Tray;
import dk.via.slaughterhouse.repository.TrayRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TrayDAOImpl implements TrayDAO {
    @Autowired
    private TrayRepository trayRepository;

    @Override
    public Tray createTray(Tray tray) {
        return trayRepository.save(tray);
    }

    @Override
    public Tray getTray(Long id) {
        return trayRepository.findById(id).orElse(null);
    }
}
