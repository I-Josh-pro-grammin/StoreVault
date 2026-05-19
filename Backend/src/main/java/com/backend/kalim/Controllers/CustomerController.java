@RestController
@RequestMapping("/customers")
public  class CustomerController {
    @Autowired
    CustomerService customerService;

    @PostMapping
    public Customer register(@RequestBody Customer customer) {
        return customerService.registerCustomer(c);
    }
}