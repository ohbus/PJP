/**
 * Subhrodip Mohanta
 * hello@subho.xyz
 */
package com.subho.wipro.pjp.tm03.ExceptionHandling.q7;

/**
 * @author subho
 *
 */


public class Q7 {
	
	public void registerUser(String username, String userCountry) {
		
		try {
			if(userCountry.equals("India") == false)
				throw new InvalidCountryException();
			
			else
				System.out.println("User registration done successfully.");
		}
		catch (InvalidCountryException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
			 Q7 obj = new Q7();
			 obj.registerUser("Mickey", "Us");
			
	}
	
}
