/**
 * Subhrodip Mohanta
 * hello@subho.xyz
 */
package com.subho.wipro.pjp.tm05;

/**
 * @author subho
 *
 */
public class Q2 {

	public static void main(String[] args) {
		
		int val = -Integer.parseInt(args[0]);
		String hex = Integer.toHexString(val);
		String binary = Integer.toBinaryString(val);
		String octal = Integer.toOctalString(val);
		System.out.println("Given Number: " + val);
		System.out.println("Binary Equivalent: " + binary);
		System.out.println("Octal Equivalent: " + octal);
		System.out.println("HexaDecimal Equivalent: " + hex);
	}
}
