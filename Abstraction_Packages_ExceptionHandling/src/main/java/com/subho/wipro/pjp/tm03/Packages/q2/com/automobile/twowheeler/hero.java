package com.subho.wipro.pjp.tm03.Packages.q2.com.automobile.twowheeler;

import com.subho.wipro.pjp.tm03.Packages.q2.com.automobile.Vehicle;

public class hero extends Vehicle{
	public String getModelNumber()
	{
		return "Hero1003N";
	}
	public String getRegistrationNumber()
	{
		return "WB00192";
	}
	public String getOwnerName()
	{
		return "jack";
	}
	public int getSpeed()
	{
		return 56;
	}
	public void radio()
	{
		System.out.println("Radio playing");
	}
	
}
