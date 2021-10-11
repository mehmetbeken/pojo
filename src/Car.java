public class Car {

    private Long id;
    private Long brandId;
    private Long colorId;
    private Long price;
    private String description;
    private Long modelYear;

    public Car(Long id, Long brandId, Long colorId, Long price, String description, Long modelYear) {
        this.id = id;
        this.brandId = brandId;
        this.colorId = colorId;
        this.price = price;
        this.description = description;
        this.modelYear = modelYear;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getBrandId() {
        return brandId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    public Long getColorId() {
        return colorId;
    }

    public void setColorId(Long colorId) {
        this.colorId = colorId;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getModelYear() {
        return modelYear;
    }

    public void setModelYear(Long modelYear) {
        this.modelYear = modelYear;
    }
}
