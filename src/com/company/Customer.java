package com.company;

import java.util.ArrayList;
import java.lang.Math;

public class Customer {
    private String name;
    private String fatherName;
    private String DOB;
    private String zipCode;
    private ArrayList<Double> transactions;

    public Customer(String name, String fatherName,
                    String DOB, String zipCode, double initialAmount) {
        this.name = name;
        this.fatherName = fatherName;
        this.DOB = DOB;
        this.zipCode = zipCode;
        this.transactions = new ArrayList<Double>();
        this.addTransaction(initialAmount);
    }



    public void addTransaction(double amount) {
        this.transactions.add(amount);
    }

    public String getName() {
        return name;
    }

    public String getFatherName() {
        return fatherName;
    }

    public String getDOB() {
        return DOB;
    }

    public String getZipCode() {
        return zipCode;
    }

    public ArrayList<Double> getTransactions() {
        return transactions;
    }

}
