
public class HoA8
{
	public static void main(String[] args)
	{
		int[] array = new int[] {10,3,6,1,2,7,9};
		int i;
		int flag = 0;
		int sum = 0;
		for(i=0;i<array.length;i++)
		{
			if(array[i]==6)
				flag = 1;
			if(flag==0)
				sum+=array[i];
			if(array[i]==7)
				flag = 0;
		}
		System.out.println(sum);
	}
}