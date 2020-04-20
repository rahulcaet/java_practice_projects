package com.company;

public class VipCustomer {
    private String name;
    private double creditLimit;
    private String email;

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }

    public VipCustomer() {
        this("Rahul Verma", 567.78, "rahul.hovs@gmail.com");
    }

    public VipCustomer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public VipCustomer(String name, double creditLimit) {
        this(name, creditLimit, "atul.verma@tcs.com");
    }
}
