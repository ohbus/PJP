/**
 * 
 */
package com.subho.wipro.pjp.tm06.ioOperations.q2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author subho
 *
 */

public class Q2 {

	public static void main(String[] args)throws IOException  {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the input file name: ");
		String fileName = br.readLine();
		System.out.println("Enter the output file name: ");
		String fileName2 = br.readLine();
		
		FileReader in = new FileReader(fileName);
		FileWriter out = new FileWriter(fileName2);
		int i;
		while((i = in.read()) != -1) {
			out.write(i);
		}
		
		in.close();
		out.close();
		System.out.println("File is copied");
	}
	
}