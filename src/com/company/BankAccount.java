package com.company;

public class BankAccount {
    private String accountNumber;
    private double  balance;
    private String  customerName;
    private String  email;
    private String  phoneNumber;

    public BankAccount(String customerName, String email, String phoneNumber) {
        this("99999", 500, customerName,
                email, phoneNumber);
    }

    public BankAccount() {
        this("56789", 200, "Default Name",
                "abc@gmail.com",
                "+91-9792567353");
        System.out.println("Empty constructor is called");

    }

    public BankAccount(String accountNumber, double balance, String customerName,
                       String email, String phoneNumber) {
        System.out.println("Account constructor with parameters is called");
        this.accountNumber = accountNumber;
        this.balance  = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }
    public String getAccountNumber() {
        return this.accountNumber;
    }
    public double getBalance() {
        return this.balance;
    }
    public String getCustomerName() {
        return this.customerName;
    }
    public String getEmail() {
        return this.email;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public void deposit(double cash) {
        this.balance += cash;
        System.out.println("Balance is now set  to " + this.balance);
    }
    public void withdrawal(double cash) {
        if (this.balance - cash < 0) {
            System.out.println("Not Sufficient Fund");
        } else {
            this.balance -= cash;
            System.out.println(cash + " is withdrawal now.");
            System.out.println("Balance is now set  to " + this.balance);
        }
    }
}
