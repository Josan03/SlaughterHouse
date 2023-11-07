package dk.via.slaughterhouse.client.interfaces;

import dk.via.slaughterhouse.dto.TrayDTO;
import dk.via.slaughterhouse.model.Tray;

public interface TrayClient {
    String createTray(TrayDTO trayDTO);
    Tray getTray(Long trayId);
}
