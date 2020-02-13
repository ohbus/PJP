public class HoA2
{
	public static void main(String[] args)
	{
		int[] array = new int[] {6,9,2,10,-3};
		int max = array[0];
		int min = array[0];
		for(int i = 1; i< array.length ; i++)
		{
			if(array[i]>max)
				max = array[i];
			if(array[i]<min)
				min = array[i];
		}
		System.out.println("The maximum value : "+max);
		System.out.println("The minimum value : "+min);
	}
}