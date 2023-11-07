package dk.via.slaughterhouse.dto;

public class AnimalPartDTO {
    private double weight;
    private String animalId;
    private String animalPartTypeId;
    private String trayId;
    private String productId;

    public AnimalPartDTO(double weight, String animalId, String animalPartTypeId, String trayId, String productId) {
        this.weight = weight;
        this.animalId = animalId;
        this.animalPartTypeId = animalPartTypeId;
        this.trayId = trayId;
        this.productId = productId;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getAnimalId() {
        return animalId;
    }

    public void setAnimalId(String animalId) {
        this.animalId = animalId;
    }

    public String getAnimalPartTypeId() {
        return animalPartTypeId;
    }

    public void setAnimalPartTypeId(String animalPartTypeId) {
        this.animalPartTypeId = animalPartTypeId;
    }

    public String getTrayId() {
        return trayId;
    }

    public void setTrayId(String trayId) {
        this.trayId = trayId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }
}
