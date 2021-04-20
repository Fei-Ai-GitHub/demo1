package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class ListBasedDatabase implements CustomerDatabase {
    // Use Generics to force this list to contain only Customer object
    // Specifying the variable as List (think of this as an abstract type)
    private List<Customer> customerList;
    public ListBasedDatabase() {
        //Creating a specific type of list - arraylist
        customerList = new ArrayList<Customer>();
    }

    @Override
    public boolean save(Customer customer) {
        return customerList.add(customer);

    }
}
