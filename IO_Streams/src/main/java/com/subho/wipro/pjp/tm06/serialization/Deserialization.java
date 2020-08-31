package com.subho.wipro.pjp.tm06.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialization {

	public static void main(String[]args) {
		
		try {
			
			Employee obj2 ;
			
			FileInputStream fin = new FileInputStream("data");
			ObjectInputStream ois = new ObjectInputStream(fin);
			
			obj2 = (Employee)ois.readObject();
			ois.close();
			System.out.println("The properties of object are: " + obj2);
		} catch (FileNotFoundException e) {
			System.out.println("Error: " + e);
			return ;
		} catch (ClassNotFoundException e) {
			System.out.println("Error: " + e);
			return ;
		} catch (IOException e) {
			System.out.println("Error: " + e);
			return ;
		}
	}
	
}