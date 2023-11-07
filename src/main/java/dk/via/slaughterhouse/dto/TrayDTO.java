package dk.via.slaughterhouse.dto;

public class TrayDTO {
    private String description;
    private double maxWeight;

    public TrayDTO(String description, double maxWeight) {
        this.description = description;
        this.maxWeight = maxWeight;
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
