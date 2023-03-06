package com.pereira.hexagonal.application.ports.out;

import com.pereira.hexagonal.application.core.domain.Address;

public interface FindAddressByZipCodeOutputPort {
    Address find(String zipCode);
}
