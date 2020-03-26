package com.subho.wipro.pjp.tm07.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Q4 {
	static HashMap<String, Long> hm = new HashMap<String, Long>();
	
	public boolean checkKey(String key) {
		Set set = hm.entrySet();
		Iterator i = set.iterator();
		
		while(i.hasNext()) {
			Map.Entry me = (Map.Entry) i.next();
			if(me.getKey().equals(key)) {
				System.out.println("Key exists.");
				return true;
			}
		}
		System.out.println("Key does not exists.");
		return false;
	}
	public boolean checkValue(Long value) {
		Set set = hm.entrySet();
		Iterator i = set.iterator();
		
		while(i.hasNext()) {
			Map.Entry me = (Map.Entry) i.next();
			if(me.getValue().equals(value)) {
				System.out.println("Value exists.");
				return true;
			}
		}
		System.out.println("Value does not exists.");
		return false;
	}

	public static void main(String[] args) {
		
		hm.put("Dhoni",		9854678993L);
		hm.put("Sachin",	8975647889L);
		hm.put("Virat",		7895678443L);
		hm.put("Rohit",		6782456773L);
		hm.put("Chahal",	9856545332L);
		
		Q4 obj = new Q4();
		obj.checkKey("Rohit");
		
		obj.checkValue(8976545665L);
		
	}
}
