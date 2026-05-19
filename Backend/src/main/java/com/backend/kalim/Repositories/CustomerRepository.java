package com.backend.kalim.Repositories;

import com.backend.kalim.Entities.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.domain.Pageable;

public interface CustomerRepository extends JpaRepository<Customer, Long>{
   Customer findByEmail(String email, Pageable pageable);
}