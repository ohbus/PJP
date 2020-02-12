public class HoA3{
	public static void main(String[] args)
	{
		int len = args.length;
		if(args.length>0)
		{
			for(int i=0;i<args.length;i++)
				System.out.print(args[i]+" ");
		}
		else
			System.out.println("No Values");
	}
}