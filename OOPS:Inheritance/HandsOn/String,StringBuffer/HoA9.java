import java.util.Scanner;

class HoA9
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int j = s.indexOf(",");
		j+=1;
		int i=0;
		int k = j-1;
		StringBuffer empty = new StringBuffer();
		while(i<k || j<s.length())
		{
			if(i<k)
			{
				empty.append(s.charAt(i));
				i++;
			}
			if(j<s.length())
			{
				empty.append(s.charAt(j));
				j++;
			}
		}

		System.out.println(empty);
	}
}