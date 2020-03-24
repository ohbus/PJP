import java.util.Scanner;

class Video
{
	private String videoName;
	private boolean checkout;
	private int rating;

	Video(String name)
	{
		videoName = name;
	}

	String getName()
	{
		return null;
	}

	void doCheckout()
	{

	}

	void doReturn()
	{

	}

	void receiveRating(int rating)
	{

	}

	int getRating()
	{
		return 0;
	}

	boolean getCheckout()
	{
		return true;
	}

}

class VideoStore
{
	Video[] store;

	void addVideo(String name)
	{
		System.out.println(name);
	}

	void doCheckout(String name)
	{

	}

	void doReturn(String name)
	{

	}

	void receiveRating(String name,int rating)
	{

	}

	void listInventory()
	{

	}

}


class VideoLauncher
{
	public static void main(String[] args)
	{
		
		int choice;
		//display menu

		System.out.println("MAIN MENU");
		System.out.println("=========");
		System.out.println("1.	Add Videos :");
		System.out.println("2.	Check Out Videos :");
		System.out.println("3.	Return Videos :");
		System.out.println("4.	Receive Rating :");
		System.out.println("5.	List Inventory :");
		System.out.println("6	Exit :");
		System.out.println("Enter your choice (1..6) : ");

		//End of display menu

		Scanner sc = new Scanner(System.in);
		choice = sc.nextInt();

		VideoStore vs = new VideoStore();

		switch(choice)
		{
			case 1 : 	System.out.print("Enter the name of the video you want to add : ");
						String videoName = sc.nextLine();
						vs.addVideo(videoName);
						break;
		}
	}
}