package com.pereira.hexagonal.adapters.out;

import com.pereira.hexagonal.adapters.out.repository.CustomerRepository;
import com.pereira.hexagonal.adapters.out.repository.mapper.CustomerEntityMapper;
import com.pereira.hexagonal.application.core.domain.Customer;
import com.pereira.hexagonal.application.ports.out.UpdateCustomerOutputPort;
import org.springframework.beans.factory.annotation.Autowired;

public class UpdateCustomerAdapter implements UpdateCustomerOutputPort {

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerEntityMapper customerEntityMapper;

    @Override
    public void update(Customer customer) {
        var customerEntity = customerEntityMapper.toCustomerEntity(customer);
        customerRepository.save(customerEntity);
    }
}
