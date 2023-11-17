package dk.via.slaughterhouse.dao.interfaces;

import dk.via.slaughterhouse.model.Tray;

public interface TrayDAO {
    Tray createTray(Tray tray);
    Tray getTray(Long id);
}
