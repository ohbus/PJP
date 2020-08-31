package com.subho.wipro.pjp.tm01.fcs;

public class Q8 {
	public static void main(String[] args) {
		if(args.length == 0){
			System.out.println("Invalid Code");
		}

		else{
			char code = args[0].charAt(0);
			switch(code){

			case 'R': System.out.println("Red");
					  break;
			case 'B': System.out.println("Blue");
					  break;
		    case 'G': System.out.println("Green");
					  break;
			case 'O': System.out.println("Orange");
					  break;
		    case 'Y': System.out.println("Yellow");
					  break;
			case 'W': System.out.println("White");
					  break;		  			  		  			  		  
			}
		}
	}
}
