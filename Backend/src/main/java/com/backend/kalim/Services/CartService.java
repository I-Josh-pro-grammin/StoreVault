package com.backend.kalim.Services;

import com.backend.kalim.Entities.Cart;
import com.backend.kalim.Entities.Customer;
import com.backend.kalim.Entities.Product;
import com.backend.kalim.Repositories.CartRepository;
import com.backend.kalim.Repositories.CustomerRepository;
import com.backend.kalim.Repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartService {
    @Autowired
    CartRepository cartRepository;
    CustomerRepository customerRepository;
    ProductRepository productRepository;


    public Cart addToCart(
            String email, Long productId, Integer quantity
    ) {
        Product product = productRepository.findById(productId).get();

        Customer customer = customerRepository.findByEmail(email);

        Cart cart = new Cart();

        cart.setProduct(product);
        cart.setCustomer(customer);
        cart.setQuantity(quantity);

        return cartRepository.save(cart);

    }
}