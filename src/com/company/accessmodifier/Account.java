package com.company.accessmodifier;

import java.util.ArrayList;

public class Account {
    public String accountName;
    public int balance = 0;
    public ArrayList<Integer> transactions;

    public Account(String accountName) {
        this.accountName = accountName;
        this.transactions = new ArrayList<>();
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount ) {
        if(amount > 0) {
            transactions.add(amount);
            this.balance += amount;
            System.out.println(amount + " deposited. Balance is  now " + this.balance);
        } else {
            System.out.println("Cannot deposit negative sums");
        }
    }

    public void withdrawal(int amount) {
        if( amount <0 ) {
            System.out.println("Can't withdraw negative sum");
        } else  {
            this.balance -= amount;
            transactions.add(-1*amount);
            System.out.println(amount + " withdrawal . Balance is now " + this.balance);
        }
    }

    public void calculateBalance() {
        this.balance = 0;
        for( int i: transactions) {
            this.balance += i;
        }
        System.out.println("Calculated balance is: " + this.balance);
    }
}
