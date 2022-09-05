package com.cloudtechmasters.realtimeprojectdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.Arrays;
import java.util.List;

@RestController
public class CustomerController {

    private static final Logger logger = LoggerFactory.getLogger(CustomerController.class);

    @GetMapping("/getAllCustomers")
    public List<Customer> getAllCustomers() {
        // System.out.println("Hello Team");
        logger.info("Hello Team");
        Customer customer1 = new Customer(100, "ADS TEAM1");
        Customer customer2 = new Customer(200, "ADS TEAM2");
        return Arrays.asList(customer1, customer2);
    }
}
