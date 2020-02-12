public class HoA13
{
	public static void main(String[] args)
	{
		int flag;
		for(int j=10;j<=99;j++)
		{	
			flag=0;
			for(int i=2;i<j/2;i++)
			{
				if(j%i==0)
					flag=1;
			}
			if(flag==0)
				System.out.println(j);
		}
	}
}