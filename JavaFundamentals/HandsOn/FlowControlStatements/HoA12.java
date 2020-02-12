import java.util.Scanner;
public class HoA12
{
	public static void main(String[] args)
	{
		int flag = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int num = scan.nextInt();
		for(int i=2;i<num/2;i++)
		{
			if(num%i==0)
				flag=1;
		}
		if(flag==0)
			System.out.println("The number is a prime number.");
		else
			System.out.println("The number is not prime number.");
	}
}