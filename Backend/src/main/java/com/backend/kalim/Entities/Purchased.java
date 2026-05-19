@Entity
public class Purchased {
    @Id
    @GeneratedValue
    private Long id;

    private Long productCode;

    private Integer quantity;

    private Double total;

    private DATE date;

    @ManyToOne
    private Customer customer;

    @ManyToOne
    private Product product;
}
