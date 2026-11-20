package controller;

import model.Customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerController {
    private List<Customer> customers = new ArrayList<>();

    public void addCustomer(String firstName, String lastName, String address) {
        Customer customer = new Customer(firstName, lastName, address);
        customers.add(customer);
    }

    public List<Customer> getAllCustomers() {
        return customers;
    }
}
