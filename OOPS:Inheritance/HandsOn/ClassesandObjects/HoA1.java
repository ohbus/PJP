class Box
{
	int width;
	int height;
	int depth;
	int BoxVolume;

	public Box(int width, int height, int depth)
	{
		this.width = width;
		this.height = height;
		this.depth = depth;
	}

	public int calcVolume()
	{
		int BoxVolume = width * height * depth;
		return BoxVolume;
	}
}


public class HoA1
{
	public static void main(String[] args)
	{
		Box b = new Box(10,20,15);
		System.out.print("The volume of the box is : "+b.calcVolume());
	}	
}