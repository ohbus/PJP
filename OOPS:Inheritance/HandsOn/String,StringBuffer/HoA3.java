import java.util.Scanner;

class HoA3
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int len = s.length();
		String sub = s.substring(0,2);
		String empty = "";
		while(len>0)
		{
			empty = empty + sub;
			len--;
		}

		System.out.println(empty);
	}
}