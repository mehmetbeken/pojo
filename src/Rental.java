public class Rental {
    private Long id;
    private Long carId;
    private String carName;
    private String carColor;
    private Long carPrice;

    public Rental(Long id, Long carId, String carName, String carColor, Long carPrice) {
        this.id = id;
        this.carId = carId;
        this.carName = carName;
        this.carColor = carColor;
        this.carPrice = carPrice;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCarId() {
        return carId;
    }

    public void setCarId(Long carId) {
        this.carId = carId;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCarColor() {
        return carColor;
    }

    public void setCarColor(String carColor) {
        this.carColor = carColor;
    }

    public Long getCarPrice() {
        return carPrice;
    }

    public void setCarPrice(Long carPrice) {
        this.carPrice = carPrice;
    }
}
