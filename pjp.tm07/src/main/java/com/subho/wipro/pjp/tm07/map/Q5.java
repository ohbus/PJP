package com.subho.wipro.pjp.tm07.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Q5 {
	TreeMap<String, String> m1 = new TreeMap<String, String>();
	
	public TreeMap<String, String> saveCountryCapital(String CountryName, String CapitalName) {
		m1.put(CountryName, CapitalName);
		return m1;
	}
	
	public String getCapital(String CountryName) {
		Set set = m1.entrySet();
		Iterator i = set.iterator();
		
		while(i.hasNext()) {
			Map.Entry me = (Map.Entry) i.next();
			if(me.getKey().equals(CountryName)) {
				return (String) me.getValue();
			}
		}
		return "Country not found";
	}
	
	public String getCountry(String CapitalName) {
		Set set = m1.entrySet();
		Iterator i = set.iterator();
		
		while(i.hasNext()) {
			Map.Entry me = (Map.Entry) i.next();
			if(me.getValue().equals(CapitalName)) {
				return (String) me.getKey();
			}
		}
		return "Capital not found";
	}
	
	public TreeMap<String, String> swap() {
		
		TreeMap<String, String> m2 = new TreeMap<String, String>();
		Set set = m1.entrySet();
		Iterator i = set.iterator();
		
		while(i.hasNext()) {
			Map.Entry me = (Map.Entry) i.next();
			m2.put((String)me.getValue(), (String)me.getKey());
		}
		
		return m2;
	}
	
	public ArrayList key() {
		ArrayList<String> al = new ArrayList<String>();
		Set set = m1.entrySet();
		Iterator i = set.iterator();
		while(i.hasNext()) {
			Map.Entry me = (Map.Entry) i.next();
			al.add((String) me.getKey());
		}
		
		return al;
	}
	
	public static void main(String[] args) {
		Q1 obj = new Q1();

		obj.saveCountryCapital("India", "Delhi");
		obj.saveCountryCapital("Japan", "Tokyo");
		
		System.out.println(obj.getCapital("India"));
		System.out.println(obj.getCountry("Tokyo"));
		
		HashMap<String, String> m = obj.swap();
		
		ArrayList<Integer> al = obj.key();
		System.out.println(al.toString());
		
	}
}
