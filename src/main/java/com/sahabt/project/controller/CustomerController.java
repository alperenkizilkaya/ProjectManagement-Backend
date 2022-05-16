package com.sahabt.project.controller;

import com.sahabt.project.dto.request.CustomerRequest;
import com.sahabt.project.dto.response.CustomerResponse;
import com.sahabt.project.exception.CustomerDoesntExistException;
import com.sahabt.project.service.CustomerService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
@AllArgsConstructor
public class CustomerController {

    private CustomerService customerService;

    @PostMapping
    void addCustomer(@RequestBody CustomerRequest request) {
        customerService.addCustomer(request);
    }

    @GetMapping("/{id}")
    CustomerResponse findCustomerById(@RequestParam long id) throws CustomerDoesntExistException {
        return customerService.findCustomerById(id);
    }
}