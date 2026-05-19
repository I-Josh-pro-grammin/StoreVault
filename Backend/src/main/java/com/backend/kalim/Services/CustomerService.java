import org.springframework.boot.data.autoconfigure.web.DataWebProperties.Pageable;
import org.springframework.data.domain.PageRequest;


public class CustomerService {
    @autowired
    CustomerRepository customerRepository;

    Pageable page = PageRequest.of(0, 1);
    public Customer registerCustomer(Customer customer) {
        return customerRepository.save(customer);
    }
}