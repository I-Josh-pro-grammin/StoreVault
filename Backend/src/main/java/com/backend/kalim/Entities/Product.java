@Entity
public  class Product {
   @Id
   @GeneratedValue
   private Long code;

   private String name;

   private String productType;

   private double price;

   private DATE inDate;

   private string image;

   public Product() {}

   public Product(Long code, String name, String productType, double price, DATE inDate, string image) {
        this.code = code;
        this.name = name;
        this.productType = productType;
        this.price = price;
        this.inDate = inDate;
        this.image = image;
    }

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public DATE getInDate() {
        return inDate;
    }

    public void setInDate(DATE inDate) {
        this.inDate = inDate;
    }

    public string getImage() {
        return image;
    }

    public void setImage(string image) {
        this.image = image;
    }
}