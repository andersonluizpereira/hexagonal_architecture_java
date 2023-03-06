package com.pereira.hexagonal.application.core.usecase;

import com.pereira.hexagonal.application.ports.in.DeleteCustomerByIdInputPort;
import com.pereira.hexagonal.application.ports.in.FindCustomerByIdInputPort;
import com.pereira.hexagonal.application.ports.out.DeleteCustomerByIdOutPutPort;

public class DeleteCustomerByIdUseCase implements DeleteCustomerByIdInputPort {

    private final DeleteCustomerByIdOutPutPort deleteCustomerByIdOutPutPort;
    private final FindCustomerByIdInputPort findCustomerByIdInputPort;


    public DeleteCustomerByIdUseCase(DeleteCustomerByIdOutPutPort deleteCustomerByIdOutPutPort, FindCustomerByIdInputPort findCustomerByIdInputPort) {
        this.deleteCustomerByIdOutPutPort = deleteCustomerByIdOutPutPort;
        this.findCustomerByIdInputPort = findCustomerByIdInputPort;
    }

    @Override
    public void delete(String id) {
        findCustomerByIdInputPort.find(id);
        deleteCustomerByIdOutPutPort.delete(id);
    }
}
