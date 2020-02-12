import java.util.Scanner;

public class HoA17
{
	public static void main(String[] args)
	{
		int result = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = scan.nextInt();
		while(num!=0)
		{
			result = ( result * 10 ) + ( num % 10 );
			num = num / 10;
		}
		System.out.println(result);
	}
}