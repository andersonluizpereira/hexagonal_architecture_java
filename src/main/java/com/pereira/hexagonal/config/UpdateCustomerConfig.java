package com.pereira.hexagonal.config;

import com.pereira.hexagonal.adapters.out.FindAddressByZipCodeAdapter;
import com.pereira.hexagonal.adapters.out.FindCustomerByIdAdapter;
import com.pereira.hexagonal.adapters.out.InsertCustomerAdapter;
import com.pereira.hexagonal.adapters.out.UpdateCustomerAdapter;
import com.pereira.hexagonal.application.core.usecase.FindCustomerByIdUseCase;
import com.pereira.hexagonal.application.core.usecase.InsertCustomerUseCase;
import com.pereira.hexagonal.application.core.usecase.UpdateCustomerUseCase;
import com.pereira.hexagonal.application.ports.in.FindCustomerByIdInputPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UpdateCustomerConfig {
    @Bean
    public UpdateCustomerUseCase updateCustomerUseCase(
            // Aqui usamos o use case FindCustomerByIdUseCase,
            // mas poderia ser qualquer outra classe que implemente FindCustomerByIdInputPort
            FindCustomerByIdUseCase findCustomerByIdUseCase,
            FindAddressByZipCodeAdapter findAddressByZipCodeAdapter,
            UpdateCustomerAdapter updateCustomerAdapter
    ) {
        return new UpdateCustomerUseCase(findCustomerByIdUseCase,findAddressByZipCodeAdapter, updateCustomerAdapter);
    }
}
