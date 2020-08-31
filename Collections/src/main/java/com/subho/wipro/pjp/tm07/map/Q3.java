package com.subho.wipro.pjp.tm07.map;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

public class Q3 {
	public static void main(String[] args) {
		
		Properties p = new Properties();
		
		p.put("Uttarakhand", "Dehradun");
		p.put("Uttar Pradesh", "Lucknow");
		p.put("Orrisa", "Bhubneshwar");
		p.put("Karnataka", "Banglore");
		p.put("Punjab", "Chandigarh");
		
		Set set = p.entrySet();
		Iterator i = set.iterator();
		
		while(i.hasNext()) {
			String str = (String) i.next();
			System.out.println("The capital of the " + str + " is " + p.getProperty(str));
		}
	}
}