public class HoA1
{
	public static void main(String[] args)
	{
		int sum = 0;
		int average = 0;
		int[] x = new int[] {10,20,30,40};
		for(int i = 0; i < x.length; i++)
		{
			sum = sum + x[i];
		}
		average = sum / x.length;

		System.out.println("The Sum of array elements : "+sum);
		System.out.println("The average of array elements : "+average);
	}
}