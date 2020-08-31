package com.subho.wipro.pjp.tm01.proj;

public class Project1
{
	public static void main(String[] args)
	{
		int i=0;

		String[][] employee = 
		{
			{"1001","Ashish","01/04/2009","e","R&D","20000","8000","3000"},
			{"1002","Sushma","23/08/2012","c","PM","3000","12000","9000"},
			{"1003","Rahul","12/11/2008","k","Acct","10000","8000","1000"},
			{"1004","Chahat","29/01/2013","r","Front Desk","12000","6000","2000"},
			{"1005","Ranjan","16/07/2005","m","Engg","50000","20000","20000"},
			{"1006","Suman","1/1/2000","e","Manufacturing","23000","9000","4400"},
			{"1007","Tanmay","12/06/2006","c","PM","29000","12000","10000"}
		};

		String[][] designation =
		{
			{"e","Engineer","20000"},
			{"c","Consultant","32000"},
			{"k","Clerk","12000"},
			{"r","Receptionist","15000"},
			{"m","Manager","40000"}
		};

		int empid = Integer.parseInt(args[0]);

		while(Integer.parseInt(employee[i][0])!=empid)
		{
			i++;
		}

		char desigCode = employee[i][3].charAt(0);
		String desig = "NULL";
		int salary = 0;
		String empName = employee[i][1];
		String department = employee[i][4];
		int basic = Integer.parseInt(employee[i][5]);
		int hra = Integer.parseInt(employee[i][6]);
		int it = Integer.parseInt(employee[i][7]);

		switch(desigCode)
		{
			case 'e':	desig = "Engineer";
						salary = basic + hra + 20000 - it;
						break;
			case 'c':	desig = "Consultant";
						salary = basic + hra + 32000 - it;
						break;
			case 'k':	desig = "Clerk";
						salary = basic + hra + 12000 - it;
						break;
			case 'r':	desig = "Receptionist";
						salary = basic + hra + 15000 - it;
						break;
			case 'm':	desig = "Manager";
						salary = basic + hra + 40000 - it;
						break;
		}

		System.out.println("EmpNo\t\tEmpName\t\tDepartment\t\tDesignation\t\tSalary");
		System.out.println(empid+"\t\t"+empName+"\t\t"+department+"\t\t"+desig+"\t\t"+salary);	
	}
}