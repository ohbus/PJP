import java.util.Scanner;
public class HoA3
{
	public static void main(String[] args)
	{
		int[] array = new int[] {1,4,34,56,7};
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter search element : ");
		int checker = scan.nextInt();
		int index = -1;
		for(int i = 0; i < array.length ; i++)
		{
			if(array[i]==checker)
				index=i;
		}
		System.out.println(index);
	}
}