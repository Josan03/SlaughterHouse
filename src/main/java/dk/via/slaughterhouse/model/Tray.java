package dk.via.slaughterhouse.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tray")
public class Tray {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToMany
    private List<AnimalPart> animalParts;
    private String description;
    private double maxWeight;

    public Tray(Long id, String description, double maxWeight)
    {
        this.id = id;
        this.description = description;
        this.maxWeight = maxWeight;
    }

    public Tray() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<AnimalPart> getAnimalParts() {
        return animalParts;
    }

    public void setAnimalParts(List<AnimalPart> animalParts) {
        this.animalParts = animalParts;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(double maxWeight) {
        this.maxWeight = maxWeight;
    }
}
