import java.util.Scanner;

public class HoA18
{
	public static void main(String[] args)
	{
		int result = 0;
		int temp;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a number : ");
		int num = scan.nextInt();
		temp = num;
		while(num!=0)
		{
			result = ( result * 10 ) + ( num % 10 );
			num = num / 10;
		}
		if(temp==result)
			System.out.println(temp+" is a palindrome.");
		else
			System.out.println(temp+" is not a palindrome.");
	}
}