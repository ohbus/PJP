package com.subho.wipro.pjp.tm03.Packages.q2.com.automobile.fourwheeler;

import com.subho.wipro.pjp.tm03.Packages.q2.com.automobile.Vehicle;

public class Ford extends Vehicle{
	public String getModelNumber()
	{
		return "Ford1003n";
	}
	public String getRegistrationNumber()
	{
		return "WB00192";
	}
	public String getOwnerName()
	{
		return "jones";
	}
	public int getSpeed()
	{
		return 92;
	}
	public void tempControl()
	{
		System.out.println("AirConditioner On");
	}
}
