@RestController
@RequestMapping("/products")
public  class ProductController {

    @Autowired
    ProductService productService;

    @PostMapping
    public Product save(@RequestBody Product product) {
        return productService.save(product);
    }

    @GetMapping
    public List<Product> all() {
        return productService.getAll();
    }
}