package com.pereira.hexagonal.application.ports.in;

import com.pereira.hexagonal.application.core.domain.Customer;

public interface UpdateCustomerInputPort {

    void update(Customer customer, String zipCode);

}
