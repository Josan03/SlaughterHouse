package dk.via.slaughterhouse.dto;

public class AnimalDTO {
    private double weight;
    private String registrationDate;
    private String animalTypeId;

    public AnimalDTO(double weight, String registrationDate, String animalTypeId) {
        this.weight = weight;
        this.registrationDate = registrationDate;
        this.animalTypeId = animalTypeId;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
    }

    public String getAnimalTypeId() {
        return animalTypeId;
    }

    public void setAnimalTypeId(String animalTypeId) {
        this.animalTypeId = animalTypeId;
    }
}
