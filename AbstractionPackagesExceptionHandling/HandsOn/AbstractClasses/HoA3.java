abstract class Instrument
{
	abstract void play();
}

class Piano extends Instrument
{
	void play()
	{
		System.out.println("Piano is playing tan tan tan tan ");
	}
}

class Flute extends Instrument
{
	void play()
	{
		System.out.println("Flute is playing toot toot toot toot ");
	}
}

class Guitar extends Instrument
{
	void play()
	{
		System.out.println("Guitar is playing tin tin tin ");
	}
}

class HoA3
{
	public static void main(String[] args)
	{
		Instrument[] ins = new Instrument[10];
		int num;
		int i;
		for(i=0;i<10;i++)
		{
			num = (int)(Math.random()*((3-1)+1))+1;
			switch(num)
			{
				case 1: ins[i] = new Piano();
						break;
				case 2: ins[i] = new Flute();
						break;
				case 3: ins[i] = new Guitar();
						break;
			}
		}

		System.out.println("Index at which objects of Piano class are store are :");
		for(i=0;i<10;i++) 
		{
			if(ins[i] instanceof Piano)
				System.out.print(i+"	");	
		}System.out.println();


		System.out.println("Index at which objects of Flute class are store are :");
		for(i=0;i<10;i++) 
		{
			if(ins[i] instanceof Flute)
				System.out.print(i+"	");	
		}System.out.println();



		System.out.println("Index at which objects of Guitar class are store are :");
		for(i=0;i<10;i++) 
		{
			if(ins[i] instanceof Guitar)
				System.out.print(i+"	");	
		}System.out.println();
	}
}
