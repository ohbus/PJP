class Fruit
{
	String name;
	String taste;
	int size;

	public void eat()
	{
		System.out.println("Name of the fruit unknown");
		System.out.println("Taste of the fruit unknown");
	}
}

class apple extends Fruit
{	
	public void eat()
	{
		System.out.println("Name of the fruit is apple");
		System.out.println("Taste of the apple is sweet");
	}
}


class orange extends Fruit
{
	public void eat()
	{
		System.out.println("Name of the fruit is Orange");
		System.out.println("Taste of the orange is sour");
	}
}


class HoA1
{
	public static void main(String[] args)
	{
		apple a = new apple();
		a.eat();
		orange o = new orange();
		o.eat();
	}
}