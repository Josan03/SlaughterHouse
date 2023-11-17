package dk.via.slaughterhouse.controllers.interfaces;

import dk.via.slaughterhouse.dto.TrayDTO;
import dk.via.slaughterhouse.model.Tray;
import org.springframework.http.ResponseEntity;

public interface TrayController {
    ResponseEntity<String> createTray(TrayDTO dto);
    ResponseEntity<Tray> getTrayById(Long id);
}
