public class HoA16
{
	public static void main(String[] args)
	{
		int i=1;
		int count = Integer.parseInt(args[0]);
		while(i<=count)
			{
				for(int j=0;j<i;j++)
					{
						System.out.print("*\t");
					}
				System.out.println();
				i++;
			}
	}
}