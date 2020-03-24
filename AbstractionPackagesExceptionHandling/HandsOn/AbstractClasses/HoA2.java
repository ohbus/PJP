import java.util.Random;
abstract class Compartment
{
	public abstract String notice();
}

class FirstClass extends Compartment
{
	public String notice()
	{
		return "This is First Class Compartment";
	}
}

class Ladies extends Compartment
{
	public String notice()
	{
		return "This is Ladies Compartment";
	}
}

class General extends Compartment
{
	public String notice()
	{
		return "This is General Compartment";
	}
}

class Luggage extends Compartment
{
	public String notice()
	{
		return "This is Luggage Compartment";
	}
}


class HoA2
{
	public static void main(String[] args)
	{
		Compartment[] comp = new Compartment[10];
		int i;
		int num;
		for(i=0;i<10;i++)
		{
			num = (int)(Math.random()*((4-1)+1))+1;
			switch(num)
			{
				case 1: comp[i] = new FirstClass();
						break;
				case 2: comp[i] = new Ladies();
						break;
				case 3: comp[i] = new General();
						break;
				case 4:	comp[i] = new Luggage();
						break;
			}
		}
		for(i=0;i<10;i++) 
		{
			System.out.println(comp[i].notice());	
		}
	}
}