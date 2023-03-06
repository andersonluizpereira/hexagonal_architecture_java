package com.pereira.hexagonal.adapters.in.consumer.message;

import com.pereira.hexagonal.application.core.domain.Address;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerMessage {
    private String id;
    private String name;
    private Address address;
    private String cpf;
    private Boolean isValidCpf;
}
