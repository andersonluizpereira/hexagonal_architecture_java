package com.pereira.hexagonal.application.ports.out;

import com.pereira.hexagonal.application.core.domain.Customer;

public interface UpdateCustomerOutputPort {
    void update(Customer customer);
}
