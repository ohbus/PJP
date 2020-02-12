public class HoA5{
	public static void main(String[] args)
	{
		char ch = '*';
		if(Character.isDigit(ch))
			System.out.println("Digit");
		else if(Character.isLetter(ch))
			System.out.println("Alphabhet");
		else
			System.out.println("Special Character");
	}
}