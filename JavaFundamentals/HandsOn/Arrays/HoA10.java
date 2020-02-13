public class HoA10
{
	public static void main(String[] args)
	{
		int[][] array = new int[3][3];
		int max = array[0][0];
		int i;
		int j;
		int k = 0;
		for(i=0;i<array.length;i++)
		{
			for(j=0;j<array.length;j++)
			{
				array[i][j] = Integer.parseInt(args[k++]);
			}
		}
		for(i=0;i<array.length;i++)
		{
			for(j=0;j<array.length;j++)
			{
				if(array[i][j]>max)
					max=array[i][j];
			}
		}

		System.out.println(max);
	}
}