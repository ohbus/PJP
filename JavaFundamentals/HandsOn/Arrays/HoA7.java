public class HoA7
{
	public static void main(String[] args)
	{
		int[] array = new int[] {10,0,-1,9,-3,0,13,2};
		int[] array1 = new int[array.length];
		int i;
		int j=0;
		int flag=0;
		int k;
		int count = 0;
		for(i=0;i<array.length;i++)
		{
			k = 0;
			flag = 0;
			while(k<i)
			{
				if(array[i]==array[k])
					flag=1;
				k++;
			}
			if(flag==0)
			{
				array1[count++]=array[i];
			}
		}
		for(i=0;i<count;i++)
			System.out.print(array1[i]+" ");
	}
}