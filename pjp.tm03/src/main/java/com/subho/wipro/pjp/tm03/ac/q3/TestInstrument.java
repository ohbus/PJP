/**
 * Subhrodip Mohanta
 * hello@subho.xyz
 */
package com.subho.wipro.pjp.tm03.ac.q3;

/**
 * @author subho
 *
 */

public class TestInstrument {

	public static void main(String[] args) {
		
		
		Instrument obj1 = new Piano();
		Instrument obj2 = new Flute();
		Instrument obj3 = new Guitar();
		
		Instrument[] arr = new Instrument[] {obj1, obj2, obj3, obj1, obj1, obj3, obj2, obj3, obj2, obj3};
		
		obj2.play();
		
		for(int i = 0; i < arr.length; ++ i) {
			if(arr[i] instanceof Piano) {
				obj1.play();
			}
			
			if(arr[i] instanceof Flute) {
				obj2.play();
			}
			
			else
				obj3.play();
		}
		
		System.out.println();
		
		for(int i = 0; i < arr.length; ++ i) {
			if(arr[i] instanceof Piano) 
				System.out.println("Object Stored at index " + i + " is Piano");
			
			if(arr[i] instanceof Flute) 
				System.out.println("Object Stored at index " + i + " is Flute");
			
			
			else 
				System.out.println("Object Stored at index " + i + " is Guitar");
				
		}
	}
	
}