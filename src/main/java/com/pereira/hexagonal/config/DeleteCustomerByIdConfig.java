package com.pereira.hexagonal.config;

import com.pereira.hexagonal.adapters.out.DeleteCustomerByIdAdapter;
import com.pereira.hexagonal.adapters.out.FindCustomerByIdAdapter;
import com.pereira.hexagonal.application.core.usecase.DeleteCustomerByIdUseCase;
import com.pereira.hexagonal.application.core.usecase.FindCustomerByIdUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DeleteCustomerByIdConfig {
    @Bean
    public DeleteCustomerByIdUseCase deleteCustomerByIdUseCase(
            DeleteCustomerByIdAdapter deleteCustomerByIdAdapter,
            FindCustomerByIdUseCase findCustomerByIdUseCase

    ) {
        return new DeleteCustomerByIdUseCase(deleteCustomerByIdAdapter, findCustomerByIdUseCase);
    }
}
