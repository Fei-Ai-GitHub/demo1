package com.example.demo;

import java.util.Scanner;

public class ConsoleView {

    public Customer getCustomer(){
        Scanner in = new Scanner(System.in);
        System.out.println("please enter customer name: ");
        String name = in.nextLine();
        System.out.println("please enter cusomter age:");
        int age = in.nextInt();
        int id = 1;

        Customer customer = new Customer (id, name, age, "");
        return customer;
    }
}
