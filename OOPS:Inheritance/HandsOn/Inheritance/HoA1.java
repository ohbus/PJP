class Animal
{
	public void eat()
	{
		System.out.println("This is the eat method of animal class.");
	}

	public void sleep()
	{
		System.out.println("This is the sleep method of Animal class.");
	}
}

class Bird extends Animal
{
	public void eat()
	{
		System.out.println("This is the eat method of Bird class.");
	}

	public void sleep()
	{
		System.out.println("This is the sleep method of Bird class.");
	}

	public void fly()
	{
		System.out.println("This is the fly method of Bird class.");
	}

}


public class HoA1
{
	public static void main(String[] args)
	{
		Animal an = new Animal();
		Bird bd = new Bird();

		an.eat();
		an.sleep();

		bd.eat();
		bd.sleep();
		bd.fly();
	}
}