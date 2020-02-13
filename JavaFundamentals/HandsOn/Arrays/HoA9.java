public class HoA9
{
	public static void main(String[] args)
	{
		if(args.length==4)
		{
			int i;
			int j;
			int temp;
			int[][] array = {{Integer.parseInt(args[0]),Integer.parseInt(args[1])},{Integer.parseInt(args[2]),Integer.parseInt(args[3])}};
			for(i=0;i<array.length/2;i++)
			{
				for(j=0;j<array.length;j++)
				{
					temp = array[i][j];
					array[i][j] = array[array.length-i-1][array.length-j-1];
					array[array.length-i-1][array.length-j-1] = temp;
				}
			}
			for(i=0;i<array.length;i++)
			{
				for(j=0;j<array.length;j++)
				{
					System.out.print(array[i][j]+" ");
				}
				System.out.println();
			}
			
		}
		else if(args.length<4)
		{
			System.out.println("Please enter 4 integer numbers");
		}

	}
}