package com.subho.wipro.pjp.tm07.map;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;

public class Q6 {
	Hashtable<String, String> ht = new Hashtable<String, String>();
	
	public Hashtable<String, String> saveCountryCapital(String CountryName, String CapitalName) {
		ht.put(CountryName, CapitalName);
		return ht;
	}
	
	public String getCapital(String CountryName) {
		
		Enumeration country;
		country = ht.keys();
		
		while(country.hasMoreElements()) {
			
			String str = (String) country.nextElement();
			if(str.equals(CountryName)) {
				return ht.get(str);
			}
		}
		
		return "Country not found in the Hashtable";
	}
	
	public String getCountry(String CapitalName) {
			
			Enumeration country;
			country = ht.keys();
			
			while(country.hasMoreElements()) {
				String str = (String) country.nextElement();

				String capital = ht.get(str); 
				if(capital.equals(CapitalName)) {
					return str;
				}
			}
			
			return "Country not found in the Hashtable";
		}
	
	public Hashtable<String, String> swap(){
		Hashtable<String, String> ht2 = new Hashtable<String,String>();
		
		Enumeration e;
		e = ht2.keys();
		
		while(e.hasMoreElements()) {
			String country = (String)e.nextElement();
			String capital = ht2.get(country);
			ht2.put(capital, country);
		}
		return ht2;
	}
	
	public ArrayList key() {
		ArrayList<String> al = new ArrayList<String>();
		Enumeration e;
		e = ht.keys();
		
		while(e.hasMoreElements()) {
			al.add((String)e.nextElement());
		}
		return al;
	}
	
	public static void main(String[] args) {
		Q6 obj = new Q6();
		obj.saveCountryCapital("India", "Delhi");
		obj.saveCountryCapital("Japan", "Tokyo");
		
		System.out.println(obj.getCapital("India"));
		System.out.println(obj.getCountry("Tokyo"));
		
		Hashtable<String, String> m = obj.swap();
		
		ArrayList<Integer> al = obj.key();
		System.out.println(al.toString());
		
	}	
}