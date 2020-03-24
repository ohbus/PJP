import java.util.Scanner;

class HoA8
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		int flag = s.indexOf("*");
		StringBuffer sb = new StringBuffer(s);
		sb.replace(flag-1,flag+2,"");
		System.out.println(sb);
	}
}