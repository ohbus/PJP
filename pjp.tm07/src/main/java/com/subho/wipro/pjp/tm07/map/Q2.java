package com.subho.wipro.pjp.tm07.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Q2 {
	
	static HashMap<String, String> hm = new HashMap<String,String>();
	
	public boolean checkValue(String value) {
		Set set = hm.entrySet();
		Iterator i = set.iterator();
		
		while(i.hasNext()) {
			Map.Entry me = (Map.Entry) i.next();
			if(me.getValue().equals(value)) {
				return true;
			}
			
		}
		return false;
		
	}
	
	public boolean checkKey(String Key) {
		Set set = hm.entrySet();
		Iterator i = set.iterator();
		
		while(i.hasNext()) {
			Map.Entry me = (Map.Entry) i.next();
			if(me.getKey().equals(Key)) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		hm.put("A", "Apple");
		hm.put("O", "Orange");
		hm.put("G", "Grapes");
		hm.put("L", "Lemon");
		
		Q2 obj = new Q2();
		
		boolean ans = obj.checkKey("G");
		if(ans == true) {
			System.out.println("Key exists.");
		}
		else {
			System.out.println("Key does not exists.");
		}
		
		ans = obj.checkValue("Mango");
		if(ans == true) {
			System.out.println("Value exists");
		}
		else {
			System.out.println("Value does not exists.");
		}
		
	}
}
