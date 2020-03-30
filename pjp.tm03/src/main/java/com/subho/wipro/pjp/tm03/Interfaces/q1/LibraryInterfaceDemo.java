package com.subho.wipro.pjp.tm03.Interfaces.q1;

public class LibraryInterfaceDemo {
	public static void main(String[] args) {
		LibraryUser lu = new KidUser(10,"Kids");
		lu.registerAccount();
		lu.requestBook();
		lu = new KidUser(13,"Kids");
		lu.registerAccount();
		lu.requestBook();
		lu = new AdultUser(50,"Fiction");
		lu.registerAccount();
		lu.requestBook();
		lu = new AdultUser(25,"Kids");
		lu.registerAccount();
		lu.requestBook();
	}

}
