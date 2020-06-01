/**
 * Subhrodip Mohanta
 * hello@subho.xyz
 */
package com.subho.wipro.pjp.tm03.ExceptionHandling.q7;

/**
 * @author subho
 *
 */

public class InvalidCountryException extends Exception {
	
	public InvalidCountryException() {
		System.out.println("Error:");
	}
	
	public String toString() {
		return "User Outside India  cannot be registered.";
	}

}
