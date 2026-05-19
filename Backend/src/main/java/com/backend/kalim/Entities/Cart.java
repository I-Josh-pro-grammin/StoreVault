@Entity
public class Cart {
    @Id
    @GeneratedValue

    private Long id;

    private double quantity;

    @ManyToOne
    private Customer customer;

    @ManyToOne
    private Product product;

    public Cart() {}

    public Cart(Long id, double quantity, Customer customer, Product product) {
        this.id = id;
        this.quantity = quantity;
        this.customer = customer;
        this.product = product;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}