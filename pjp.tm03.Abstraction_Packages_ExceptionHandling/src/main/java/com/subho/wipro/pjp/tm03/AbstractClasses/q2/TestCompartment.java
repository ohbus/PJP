package com.subho.wipro.pjp.tm03.AbstractClasses.q2;

public class TestCompartment {

	public static void main(String[] args) {
		Compartment[] cmp = new Compartment[10];
		int i;
		for(i=0;i<10;i++)
		{
			int x = (int)(Math.random()*((4-1)+1))+1;
			switch(x)
			{
				case 1: cmp[i] = new FirstClass();
						break;
				case 2: cmp[i] = new Ladies();
						break;
				case 3: cmp[i] = new General();
						break;
				case 4: cmp[i] = new Luggage();
						break;
			}
		}
		
		for(i=0;i<10;i++)
		{
			System.out.println(cmp[i].notice());
		}
	}
}
