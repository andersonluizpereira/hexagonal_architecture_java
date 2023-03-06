package com.pereira.hexagonal.adapters.out.client.mapper;

import com.pereira.hexagonal.adapters.out.client.response.AddressResponse;
import com.pereira.hexagonal.application.core.domain.Address;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AddressResponseMapper {
    Address toAddress(AddressResponse addressResponse);
}
