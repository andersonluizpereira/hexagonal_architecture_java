package com.pereira.hexagonal.config;

import com.pereira.hexagonal.adapters.out.FindAddressByZipCodeAdapter;
import com.pereira.hexagonal.adapters.out.UpdateCustomerAdapter;
import com.pereira.hexagonal.application.core.usecase.FindCustomerByIdUseCase;
import com.pereira.hexagonal.application.core.usecase.UpdateCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UpdateCustomerConfig {

    @Bean
    public UpdateCustomerUseCase updateCustomerUseCase(
            FindCustomerByIdUseCase findCustomerByIdUseCase,
            FindAddressByZipCodeAdapter findAddressByZipCodeAdapter,
            UpdateCustomerAdapter updateCustomerAdapter
    ) {
        return new UpdateCustomerUseCase(findCustomerByIdUseCase, findAddressByZipCodeAdapter, updateCustomerAdapter);
    }

}
