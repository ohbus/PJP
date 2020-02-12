import java.util.Scanner;

public class HoA15{
	public static void main(String[] args)
	{
		int sum = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter a Number : ");
		int num = scan.nextInt();
		for(int i=num;i!=0;i/=10)
		{
			sum = sum + ( i % 10);
		}
		System.out.println(sum);
	}
}