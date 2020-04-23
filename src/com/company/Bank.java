package com.company;

import java.util.ArrayList;

public class Bank {
    private String name;
    private ArrayList<Branch> branch;

    public Bank(String name) {
        this.name = name;
        this.branch = new ArrayList<Branch>();
    }

    public String getName() {
        return name;
    }

    public ArrayList<Branch> getBranch() {
        return branch;
    }

    private Branch findBranch(String name, String address) {
        for (int i = 0; i < this.branch.size(); i++) {
            Branch iteratorBranch = this.branch.get(i);
            if (iteratorBranch.getName().equals(name)
                    && iteratorBranch.getAddress().equals(address)) {
                return iteratorBranch;
            }
        }
        return null;
    }

    public boolean queryBranch( String name, String address ) {
        Branch existingBranch = findBranch(name, address);
        if ( existingBranch != null ) {
            System.out.println("Customer details for branch : " + existingBranch.getName() );
            ArrayList<Customer> branchCustomerArrayList;
            branchCustomerArrayList = existingBranch.getCustomer();

            for(int i=0; i < branchCustomerArrayList.size(); i++) {
                Customer branchCustomer = branchCustomerArrayList.get(i);
                System.out.println("Customer name is: " + branchCustomer.getName());
                System.out.println("Showing transactions...");
                ArrayList<Double> transactions = branchCustomer.getTransactions();
                for(int j=0; j < transactions.size(); j++) {
                    //System.out.println("[" + (j+1) + "] Amount " + transactions.get(j).doubleValue() );
                    System.out.println("[" + (j+1) + "] Amount " + transactions.get(j)); //unboxing
                }
            }
            return true;
        }
        return false;
    }

    public boolean addBranch(String name, String address) {
        Branch existingBranch = findBranch(name, address);
        if (existingBranch == null) {
            this.branch.add(new Branch(name, address));
            return true;
        }
        return false;
    }

    public boolean addCustomer(String branchName, String address, String customerName,
                               String fatherName, String DOB,
                               String zipCode, double initialAmount) {
        Branch branch = findBranch(branchName, address);

        if (branch != null) {
            return branch.newCustomer(customerName, fatherName, DOB,
                    zipCode, initialAmount);
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String address, String customerName,
                                          String fatherName, String DOB,
                                          String zipCode, double amount) {

        Branch branch = findBranch(branchName, address);

        if (branch != null) {
            return branch.addCustomerTransaction(customerName, fatherName, DOB,
                    zipCode, amount);
        }

        return false;
    }
}
