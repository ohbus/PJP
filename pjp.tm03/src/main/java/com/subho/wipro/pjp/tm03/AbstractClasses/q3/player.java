package com.subho.wipro.pjp.tm03.AbstractClasses.q3;



public class player {

	public static void main(String[] args) {
		Instrument[] ins = new Instrument[10];
		int i;
		for(i=0;i<10;i++)
		{
			int x = (int)(Math.random()*((3-1)+1))+1;
			switch(x)
			{
				case 1: ins[i] = new piano();
						break;
				case 2: ins[i] = new flute();
						break;
				case 3: ins[i] = new guitar();
						break;
			}
		}
		
		for(i=0;i<10;i++)
		{
			System.out.println(ins[i].play());
		}
	}

}
