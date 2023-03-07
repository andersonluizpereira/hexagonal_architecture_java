package com.pereira.hexagonal.application.ports.in;

import com.pereira.hexagonal.application.core.domain.Customer;

public interface FindCustomerByIdInputPort {

    Customer find(String id);

}
