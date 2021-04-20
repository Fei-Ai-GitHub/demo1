package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }
    CustomerDatabase customerDatabase = new ListBasedDatabase();

    //   Customer myCustomer = new Customer(1, "fei", 12, "12 pary ddd");
    ConsoleView view = new ConsoleView();
    Customer myCustomer = view.getCustomer();
   //customerDatabase.save(myCustomer);
}
