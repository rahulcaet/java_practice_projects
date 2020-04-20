package com.company;

public class Main {

    public static void main(String[] args) {
//	    Car porche = new Car();
//	    Car holden = new Car();
//		System.out.println("Model is: "+ porche.getModel());
//		porche.setModel("Carrera");
//		System.out.println("Model is: "+ porche.getModel());
//
//		Person p = new Person();
//		System.out.println("firstname is: " + p.getFirstName());
//		System.out.println("firstname is: " + "".isEmpty());

		/*
		BankAccount b = new BankAccount("12345", 0, "Rahul Verma",
				                         "rahul.hovs@gmail.com", "+91-8373909280");
		b.setAccountNumber("12345");
		b.setBalance(0);
		b.setCustomerName("Rahul Verma");
		b.setEmail("rahul.hovs@gmail.com");
		b.setPhoneNumber("+91-8373909280");*/

		//BankAccount b = new BankAccount();
		/*BankAccount b = new BankAccount("Atul Verma", "atul.verma@tcs.com",
				                        "+44-895467");
		System.out.println("Bank account number is: "+ b.getAccountNumber());
		System.out.println("Bank account customername is: "+ b.getCustomerName());

		b.deposit(50);
		b.withdrawal(100);
		b.deposit(51);
		b.withdrawal(100);*/
/*

		VipCustomer v = new VipCustomer();
		System.out.println(v.getName());

		VipCustomer v2 = new VipCustomer("Bob", 25000);
		System.out.println(v2.getName());

		VipCustomer v3 = new VipCustomer("Neeraj", 75000, "neeraj.verma@gmail.com");
		System.out.println(v3.getName());
*/

//		Point first = new Point(6,5);
//		Point second = new Point(3, 1);
//		System.out.println("distance(0,0) = " + first.distance());
//		System.out.println("distance(second) =" + first.distance(second));
//		System.out.println("distance(2,2) = " + first.distance(2, 2));
//		Point point = new Point();
//		System.out.println("distance()= " + point.distance());

		Carpet carpet = new Carpet(3.5);
		Floor  floor  = new Floor(2.75, 4.0);
		Calculator calculator = new Calculator(floor, carpet);

		System.out.println("total= " + calculator.getTotalCost());
		carpet = new Carpet(1.5);
		floor  =  new Floor(5.4, 4.5);
		calculator = new Calculator(floor, carpet);
		System.out.println("total= " + calculator.getTotalCost());
	}
}
