package dk.via.slaughterhouse.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    @OneToMany
    private List<AnimalPart> animalParts;
    @OneToOne
    private Tray tray;

    public Product(Long id, String name, String description, Tray tray)
    {
        this.id = id;
        this.name = name;
        this.description = description;
        this.tray = tray;
    }

    public Product() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<AnimalPart> getAnimalParts() {
        return animalParts;
    }

    public void setAnimalParts(List<AnimalPart> animalParts) {
        this.animalParts = animalParts;
    }

    public Tray getTray() {
        return tray;
    }

    public void setTray(Tray tray) {
        this.tray = tray;
    }
}
