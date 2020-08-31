package com.subho.wipro.pjp.tm03.Interfaces.q1;

public class AdultUser implements LibraryUser{
	int age;
	String bookType;
	AdultUser(int age, String bookType)
	{
		this.age = age;
		this.bookType = bookType;
	}
	public void registerAccount()
	{
		if(age>12)
			System.out.println("You are successfully registered under Adult Account");
		else
			System.out.println("Sorry, Age must be greater than 12 to register as an adult");
	}
	
	public void requestBook()
	{
		if(bookType.equals("Fiction"))
			System.out.println("Book Issued successfully, please return the book within 7 days");
		else
			System.out.println("Oops, you are allowed to take only adult fiction books");
	}
}
