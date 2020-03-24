package com.subho.wipro.pjp.tm03.proj;

import java.util.Scanner;

public class DemoClass {

	public static void main(String[] args) {
		double interest = 0;
		int flag = 0;
		Scanner sc = new Scanner(System.in);
		while (true) {
			flag = 0; 
			System.out.println("Main Menu");
			System.out.println("=========");
			System.out.println("1. Interest Calculator - SB");
			System.out.println("2. Interest Calculator - FD");
			System.out.println("3. Interest Calculator - RD");
			System.out.println("4. Exit");
			int choice = 0;
			System.out.println("Enter your option(1...4): ");
			try {
				choice = sc.nextInt();
				sc.nextLine();
				if (choice < 0)
					throw new MyException(2);
			} catch (MyException e) {
				System.out.println(e);
				System.exit(0);
			}
			switch (choice) {

			case 1:
				System.out.println("Enter the type NRI or Normal: ");
				String type = sc.nextLine();
				System.out.println("Enter the average amount in your account");
				double amount = 0;

				try {
					amount = sc.nextDouble();
					sc.hasNextLine();
					if (amount < 0)
						throw new MyException(1);
				} catch (MyException e) {
					System.out.println(e);
					System.exit(0);
				}

				SBAccount obj = new SBAccount(type, amount);
				interest = obj.calculateInterest();
				break;

			case 2:
				System.out.println("Enter the FD amount: ");
				amount = 0;

				try {
					amount = sc.nextDouble();
					sc.nextLine();
					if (amount < 0)
						throw new MyException(1);
				} catch (MyException e) {
					System.out.println(e);
					System.exit(0);
				}

				System.out.println("Enter the number of days: ");
				int days = 0;

				try {
					days = sc.nextInt();
					sc.nextLine();
					if (days < 0)
						throw new MyException(3);
				} catch (MyException e) {
					System.out.println(e);
					System.exit(0);
				}

				System.out.println("Enter your age: ");
				int age = 0;

				try {
					age = sc.nextInt();
					sc.nextLine();
					if (age < 0)
						throw new MyException(4);
				} catch (MyException e) {
					System.out.println(e);
					System.exit(0);
				}

				FDAccount obj1 = new FDAccount(amount, days, age);
				interest = obj1.calculateInterest();
				break;

			case 3:
				System.out.println("Enter the RD amount: ");
				amount = 0.0;

				try {
					amount = sc.nextDouble();
					sc.nextLine();
					if (amount < 0)
						throw new MyException(1);
				} catch (MyException e) {
					System.out.println(e);
					System.exit(0);
				}

				System.out.println("Enter the number of months (6/9/12/15/18/21): ");
				int month = 0;

				try {
					month = sc.nextInt();
					sc.nextLine();
					if (month < 0)
						throw new MyException(3);
				} catch (MyException e) {
					System.out.println(e);
					System.exit(0);
				}

				System.out.println("Enter your age: ");
				age = 0;

				try {
					age = sc.nextInt();
					sc.nextLine();
					if (age < 0)
						throw new MyException(4);
				} catch (MyException e) {
					System.out.println(e);
					System.exit(0);
				}

				RDAccount obj2 = new RDAccount(age, month, amount);
				interest = obj2.calculateInterest();
				break;

			case 4:
				System.exit(0);
				break;

			default:
					System.out.println("Wrong Choice:\n");
					flag =1;
					break;
			}
			if (flag == 0) {
				sc.close();
				System.out.println("Interest gained: " + interest + "\n");
			}
		}
	}
}
