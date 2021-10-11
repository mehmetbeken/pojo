public class Brand {

    private Long id;
    private String brandName;

    public Long getId() {
        return id;
    }

    public Brand(Long id) {
        this.id = id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }
}
