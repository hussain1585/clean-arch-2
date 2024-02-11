package ir.mehdi.mycleanarch.domain.repositories;


import ir.mehdi.mycleanarch.domain.models.Customer;
import ir.mehdi.mycleanarch.infrastructure.entities.CustomerEntity;

import java.util.Optional;

public interface CustomerRepository {
    Customer persist(Customer customer);

    boolean existsByEmail(String email);

    Optional<CustomerEntity> findByEmail(String email);

    Optional<CustomerEntity> findById(Long id);
}
