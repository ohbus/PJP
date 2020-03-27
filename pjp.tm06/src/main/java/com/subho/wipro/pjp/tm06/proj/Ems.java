/**
 * 
 */
package com.subho.wipro.pjp.tm06.proj;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * @author subho
 *
 */

public class Ems {

	int employeeID;
	String employeeName;
	int employeeAge;
	double employeeSalary;
	
	
	public void entry(int employeeId, String employeeName, int employeeAge, double employeeSalary) throws IOException {
		this.employeeID = employeeId;
		this.employeeName = employeeName;
		this.employeeAge = employeeAge;
		this.employeeSalary = employeeSalary;
		BufferedWriter br= new BufferedWriter(new FileWriter("/home/subho/Subho/GitSpace/PJP/pjp.tm06/src/main/java/com/subho/wipro/pjp/tm06/proj/employeeDatabase", true));
		String input = employeeId + " " + employeeName + " " + employeeAge + " " + employeeSalary + "\n";
		try {
			br.write(input);
		}
		catch(Exception e)	{
			e.printStackTrace();
		}
		br.close();
	}
	
	public void display() throws IOException {
		
		try	{
			Scanner sc = new Scanner(new File("/home/subho/Subho/GitSpace/PJP/pjp.tm06/src/main/java/com/subho/wipro/pjp/tm06/proj/employeeDatabase"));		
		
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
			
			sc.close();
		}
		
		catch(Exception e)	{
			e.printStackTrace();
		}
	}
	
}
