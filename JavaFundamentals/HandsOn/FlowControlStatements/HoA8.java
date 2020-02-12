import java.util.Scanner;

public class HoA8{
	public static void main(String[] args)
	{
		System.out.print("Enter a color code : ");
		Scanner scan = new Scanner(System.in);
		char code = scan.next().charAt(0);
		switch(code)
		{
			case 'R': System.out.println(code+" -> "+"Red");
						break;
			case 'B': System.out.println(code+" -> "+"Blue");
						break;
			case 'G': System.out.println(code+" -> "+"Green");
						break;
			case 'O': System.out.println(code+" -> "+"Orange");
						break;
			case 'Y': System.out.println(code+" -> "+"Yellow");
						break;
			case 'W': System.out.println(code+" -> "+"White");
						break;
			default : System.out.println("Invalid Code");
						break;
		}
	}
}