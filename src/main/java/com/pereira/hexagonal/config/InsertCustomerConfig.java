package com.pereira.hexagonal.config;

import com.pereira.hexagonal.adapters.out.FindAddressByZipCodeAdapter;
import com.pereira.hexagonal.adapters.out.InsertCustomerAdapter;
import com.pereira.hexagonal.adapters.out.SendCpfValidationAdapter;
import com.pereira.hexagonal.application.core.usecase.InsertCustomerUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InsertCustomerConfig {
    @Bean
    public InsertCustomerUseCase insertCustomerUseCase(
            FindAddressByZipCodeAdapter findAddressByZipCodeAdapter,
            InsertCustomerAdapter insertCustomerAdapter,
            SendCpfValidationAdapter sendCpfForValidationOutputPort
    ) {
        return new InsertCustomerUseCase(findAddressByZipCodeAdapter, insertCustomerAdapter, sendCpfForValidationOutputPort);
    }
}
