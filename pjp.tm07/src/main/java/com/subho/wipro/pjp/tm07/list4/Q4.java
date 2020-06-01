package com.subho.wipro.pjp.tm07.list4;

import java.util.ArrayList;

public class Q4 {
	public static void main(String[] args) {
		ArrayList<DataType> al = new ArrayList<DataType>();
		
		DataType obj = new DataType();
		obj.addInteger(3);
		obj.addDouble(2.0);
		obj.addFloat(99);
		
		al.add(obj);
		
	}
}