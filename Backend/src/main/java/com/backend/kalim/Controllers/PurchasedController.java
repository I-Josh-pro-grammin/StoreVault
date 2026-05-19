@RestController
@RequestMapping
public class PurchasedController {
    @Autowired
    PurchasedService purchasedService;

    public String checkout(@RequestParam String email) {
        purchasedService.checkout(email);

        return "Purchased";
    }
}