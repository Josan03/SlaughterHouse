package dk.via.slaughterhouse.model;

import javax.persistence.*;

@Entity
@Table(name = "animal_parts")
public class AnimalPart {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private double weight;
    @OneToOne
    private Animal animal;
    @OneToOne
    private AnimalPartType animalPartType;
    @ManyToOne
    private Tray tray;
    @ManyToOne
    private Product product;

    public AnimalPart(Long id, double weight, Animal animal, AnimalPartType animalPartType, Tray tray, Product product)
    {
        this.id = id;
        this.weight = weight;
        this.animal = animal;
        this.animalPartType = animalPartType;
        this.tray = tray;
        this.product = product;
    }

    public AnimalPart(Long id, double weight, Animal animal)
    {
        this.id = id;
        this.weight = weight;
        this.animal = animal;
    }

    public AnimalPart() {}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }

    public AnimalPartType getAnimalPartType() {
        return animalPartType;
    }

    public void setAnimalPartType(AnimalPartType animalPartType) {
        this.animalPartType = animalPartType;
    }

    public Tray getTray() {
        return tray;
    }

    public void setTray(Tray tray) {
        this.tray = tray;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
