package com.company;
import java.util.ArrayList;

public class Branch {
    private String name;
    private String address;
    private ArrayList<Customer> customer ;

    public Branch(String name, String address) {
        this.name = name;
        this.address = address;
        this.customer = new ArrayList<Customer>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Customer> getCustomer() {
        return customer;
    }

    public String getAddress() {
        return address;
    }

    private Customer findCustomer(String name, String fatherName, String DOB,
                                String zipCode) {
        for(int i=0; i < this.customer.size(); i++) {
            Customer iteratorCustomer = this.customer.get(i);
            if (  iteratorCustomer.getName().equals(name)
               && iteratorCustomer.getDOB().equals(DOB)
               && iteratorCustomer.getFatherName().equals(fatherName)
               && iteratorCustomer.getZipCode().equals(zipCode) )    {

                return iteratorCustomer;
            }
        }
        return null;
    }
    public boolean newCustomer(String customerName, String fatherName, String DOB,
                               String zipCode, double initialAmount) {
        if(findCustomer(customerName, fatherName, DOB, zipCode) == null) {
            this.customer.add(new Customer(customerName, fatherName,
                                           DOB, zipCode, initialAmount));
            return true;
        }
        return false;
    }

    public boolean addCustomerTransaction(String customerName, String fatherName, String DOB,
                                          String zipCode, double amount) {
        Customer existingCustomer = findCustomer(customerName, fatherName, DOB, zipCode);
        if ( existingCustomer != null) {
            existingCustomer.addTransaction(amount);
            return true;
        }

        return false;
    }
}
