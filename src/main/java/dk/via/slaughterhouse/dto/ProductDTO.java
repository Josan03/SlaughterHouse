package dk.via.slaughterhouse.dto;

public class ProductDTO {
    private String name;
    private String description;
    private String trayId;

    public ProductDTO(String name, String description, String trayId) {
        this.name = name;
        this.description = description;
        this.trayId = trayId;
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

    public String getTrayId() {
        return trayId;
    }

    public void setTrayId(String trayId) {
        this.trayId = trayId;
    }
}
