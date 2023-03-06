package com.pereira.hexagonal.application.ports.out;

import com.pereira.hexagonal.application.core.domain.Customer;

import java.util.Optional;

public interface FindCustomerByIdOutPutPort {
    Optional<Customer> find(String id);
}
