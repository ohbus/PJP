import java.util.Scanner;
public class HoA14
{
	public static void main(String[] args)
	{
		int flag = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int num = scan.nextInt();
		if(num==0)
			System.out.println(num+" is neither prime nor composite.");
		else if(num==01)
			System.out.println(num+" is neither prime nor composite.");
		else
		{
			for(int i=2;i<num/2;i++)
			{
				if(num%i==0)
					flag=1;
			}
			if(flag==0)
				System.out.println(num+" is a prime number.");
			else
				System.out.println(num+" is not prime number.");
		}
	}
}