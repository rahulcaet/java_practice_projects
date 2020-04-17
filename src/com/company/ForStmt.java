package com.company;
import java.lang.Math;
public class ForStmt {
    public static void main(String[] args) {
        for (double interestRate = 2; interestRate < 10; interestRate++) {
            System.out.println("10,000 at " + interestRate + "% interest = " +
                    String.format("%.2f", calculateInterest(10000.0, interestRate)));
        }
        System.out.println("*******************************************************");
        for (double interestRate = 8; interestRate > 1; interestRate--) {
            System.out.println("10,000 at " + interestRate + "% interest = " +
                    String.format("%.2f", calculateInterest(10000.0, interestRate)));
        }

        threePrimeWithinARange(1000, 2000);
    }

    public static void threePrimeWithinARange(int leftNum, int rightNum) {
        int prime_nums_count = 0;
        for (int num = 1000; num < 2000; num++) {
            if (isPrime(num)) {
                prime_nums_count++;
                if (prime_nums_count > 3) {
                    break;
                }
                System.out.println("Found prime number b/w 1000 & 2000 : "
                        + prime_nums_count + ":" + num);
            }
        }
    }

    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        } else {
            for (long i = 2; i <= (long) Math.sqrt(n / 2); i++) {
                if (n % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }

    public static double calculateInterest(double account, double interestRate) {
        return (account * (interestRate / 100));
    }
}
