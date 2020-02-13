public class HoA5
{
	public static void main(String[] args)
	{
		int[] array = new int[] {10,0,-1,9,-3,0,13,2};
		int max = array[0];
		int min = array[0];
		int max2 = array[0];
		int min2 = array[0];
		for(int i=2;i<array.length;i++)
		{
			if(array[i]>max)
			{
				max2 = max;
				max = array[i];
			}
			else if(array[i]<max && array[i]>max2)
				max2 = array[i];
			else if(array[i]<min2 && array[i]>min)
				min2 = array[i];
			else if(array[i]<min)
			{
				min2 = min;
				min = array[i];
			}
		}
		System.out.println("The maximum values are : "+max+" "+max2);
		System.out.println("The minimum values are : "+min+" "+min2);
	}
}