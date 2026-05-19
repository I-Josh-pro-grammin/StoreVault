@RestController
@RequestMapping("/carts")
public class CartController {
    @Autowired
    CartRepository cartRepository;

    @PostMapping("/add")
    public Cart save(
            @RequestParam String name,
            @RequestParam Long id,
            @RequestParam Integer quantity
    ) {
      return cartRepository.addToCart(name, id, quantity);
    }
}