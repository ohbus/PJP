import java.util.Scanner;

class HoA7
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		if(s.startsWith("x") && s.endsWith("x"))
		{
			System.out.println(s.substring(1,s.length()-1));
		}
		else
			System.out.println(s);
	}
}