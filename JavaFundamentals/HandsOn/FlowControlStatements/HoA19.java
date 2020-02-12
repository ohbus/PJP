public class HoA19
{
	public static void main(String[] args)
	{
		int i = 1;
		int count = 0;
		int result = 5;
		while(count<=5)
		{
			if(result%2==0 && result%3==0){
				System.out.println(result);
				count++;
			}
			result = 5 * ++i;
		}
	}
}