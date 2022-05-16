package com.sahabt.project.service;

import com.sahabt.project.dto.request.CustomerRequest;
import com.sahabt.project.dto.response.CustomerResponse;
import com.sahabt.project.exception.CustomerDoesntExistException;

public interface CustomerService {


    void addCustomer(CustomerRequest request);

    CustomerResponse findCustomerById(long id) throws CustomerDoesntExistException;
}
