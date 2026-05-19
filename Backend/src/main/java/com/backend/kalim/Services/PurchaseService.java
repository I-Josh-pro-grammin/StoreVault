package com.backend.kalim.Services;

import com.backend.kalim.Entities.Cart;
import com.backend.kalim.Entities.Customer;
import com.backend.kalim.Entities.Purchase;
import com.backend.kalim.Repositories.CartRepository;
import com.backend.kalim.Repositories.CustomerRepository;
import com.backend.kalim.Repositories.PurchaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PurchaseService {
    @Autowired
    PurchaseRepository purchaseRepository;
    CustomerRepository customerRepository;
    CartRepository cartRepository;

    public void checkout(String email) {
        Customer customer = customerRepository.findByEmail(email);

        List<Cart> carts = cartRepository.findByCustomerEmail(email);

        for(Cart c: carts) {
            Purchase p = new Purchase();
            p.setCustomer(customer);
            p.setProduct(c.getProduct());
            p.setQuantity(c.getQuantity());

            purchaseRepository.save(p);
        }

        cartRepository.deleteAll();
    }
}