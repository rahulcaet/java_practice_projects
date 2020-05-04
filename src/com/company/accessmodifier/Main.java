package com.company.accessmodifier;
public class Main {
    public static void main(String[] args) {
        /*
        Account account =  new Account("Rahul");
        account.deposit(1000);
        account.withdrawal(-600);

        account.calculateBalance();

        System.out.println("Balance is now " + account.getBalance());
        */
        /*
        StaticTest firstInstance = new StaticTest("1st instance");
        System.out.println(firstInstance.getName() + " is instance number "
                           + firstInstance.getNumInstances());

        StaticTest secondInstance = new StaticTest("2nd instance");
        System.out.println(secondInstance.getName() + " is instance number "
                + StaticTest.getNumInstances());
        */
        /*
        int answer = multiply(7);
        System.out.println("answer  is "+ answer);
        System.out.println(multiplier);
        */

        /*
        finalStmtClass one = new finalStmtClass("one");
        finalStmtClass two = new finalStmtClass("two");
        finalStmtClass three = new finalStmtClass("three");

        System.out.println(Math.PI);
        Math m = new Math();
        */

        /*
        int pw = 674312;
        Password password = new ExtendedPassword(pw);
        password.storePassword();
        password.letMeIn(1);
        password.letMeIn(523266);
        password.letMeIn(9773);
        password.letMeIn(0);
        password.letMeIn(-1);
        password.letMeIn(747902050);
        password.letMeIn(674312);
       */

        System.out.println("Main method called");
        SIBTest test = new SIBTest();
        test.someMethod();
        System.out.println("Owner is: "+ SIBTest.owner);
   }

    public static int multiplier =  7;

    public static int multiply(int number) {
        return number * multiplier;
    }

}
