package com.evanscode;

import com.evanscode.customer.CustomerController;
import com.evanscode.customer.CustomerDataAccessService;
import com.evanscode.customer.CustomerService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        /*
        Never do this
        CustomerService customerService = new CustomerService(new CustomerDataAccessService());
        CustomerController customerController = new CustomerController(customerService);
         */
        SpringApplication.run(Main.class, args);
    }
}
