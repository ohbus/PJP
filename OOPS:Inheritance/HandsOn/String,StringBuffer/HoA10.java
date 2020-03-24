import java.util.Scanner;

class HoA10
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int flag = s.indexOf(",");
		String sub = s.substring(flag-3,flag);
		System.out.println(sub);
		int num = Integer.parseInt(s.substring(flag+1,s.length()));
		System.out.println(num);
		StringBuffer sb = new StringBuffer();
		while(num>0)
		{
			sb.append(sub);
			num--;
		}
		System.out.println(sb);
	}
}