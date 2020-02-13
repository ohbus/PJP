public class HoA6
{
	public static void main(String[] args)
	{
		int[] array = new int[] {10,0,-1,9,-3,0,13,2};
		int temp;
		int i;
		int j;
		int k;
		for(j=0;j<array.length;j++)
		{	
			for(i=0;i<array.length-1;i++)
			{
				if(array[i]>array[i+1])
				{
					temp = array[i];
					array[i] = array[i+1];
					array[i+1] = temp;
				}
			}
		}
		for(i=0;i<array.length;i++)
			System.out.println(array[i]+" ");
	}
}