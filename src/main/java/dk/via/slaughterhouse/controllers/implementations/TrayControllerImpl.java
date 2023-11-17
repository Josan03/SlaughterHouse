package dk.via.slaughterhouse.controllers.implementations;

import dk.via.slaughterhouse.client.implementations.TrayClientImpl;
import dk.via.slaughterhouse.client.interfaces.TrayClient;
import dk.via.slaughterhouse.controllers.interfaces.TrayController;
import dk.via.slaughterhouse.dto.TrayDTO;
import dk.via.slaughterhouse.model.Tray;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/trays")
public class TrayControllerImpl implements TrayController {
    private TrayClient trayClient;

    public TrayControllerImpl() {
        this.trayClient = new TrayClientImpl();
    }

    @PostMapping
    public ResponseEntity<String> createTray(@RequestBody TrayDTO dto) {
        try {
            String res = trayClient.createTray(dto);
            return new ResponseEntity<>(res, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Tray> getTrayById(@PathVariable("id") Long id) {
        try {
            Tray tray = trayClient.getTray(id);
            if (tray != null) {
                return new ResponseEntity<>(tray, HttpStatus.OK);
            } else {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }
}
