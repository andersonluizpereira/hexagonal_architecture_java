package com.pereira.hexagonal.application.ports.in;

import com.pereira.hexagonal.application.core.domain.Customer;

public interface InsertCustomerInputPort {

    void insert(Customer customer, String zipCode);

}
