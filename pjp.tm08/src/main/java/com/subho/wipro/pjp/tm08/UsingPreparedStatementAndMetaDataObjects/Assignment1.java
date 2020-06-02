package com.subho.wipro.pjp.tm08.UsingPreparedStatementAndMetaDataObjects;

public class Assignment1 {
	
	public static void main(String[] args) {
		int option = Integer.parseInt(args[0]);
		DAOClass dao = new DAOClass();
		
		switch(option) {
		case 1:{
			int rollno = Integer.parseInt(args[1]);
			String name = args[2];
			String grade = args[3];
			String dob = args[4];
			int fee = Integer.parseInt(args[5]);
			
			if (dao.insert(rollno, name, grade, dob, fee))
				System.out.println("Inserted successfully");
			else 
				System.out.println("Insertion error");
			break;
			}
		
		case 2:{
			int rollno = Integer.parseInt(args[1]);
			
			if (dao.delete(rollno))
				System.out.println("Deleted successfully");
			else 
				System.out.println("Deletion error");
			
			break;	
		}
		
		case 3:{
			int rollno = Integer.parseInt(args[1]);
			int fee = Integer.parseInt(args[2]);
			
			if (dao.modify(rollno, fee))
				System.out.println("Modified successfully");
			else 
				System.out.println("Modification error");
			break;
		}
		
		case 4:{
			if(args.length==2) {
				int rollno = Integer.parseInt(args[1]);
				dao.display(rollno);
			} else dao.display();
		}
		
		
		}
		DB_Utils.closeConnection();		
	}

}
