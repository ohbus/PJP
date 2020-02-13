public class HoA4
{
	public static void main(String[] args)
	{
		int[] array = new int[] {65, 120, 98, 75, 115};
		char ch;
		for(int i = 0; i < array.length ; i++)
			{
				ch = (char)array[i];
				System.out.print(ch + "\t");
			}
	}
}