/**
 * 
 */
package com.subho.wipro.pjp.tm06.ioOperations.q3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

/**
 * @author subho
 *
 */

public class Q3 {
	
	static int countOfOccurences(String[] a, String word) {  
		 
	    int count = 0; 
	    for (int i = 0; i < a.length; i++)  
		    if (word.equals(a[i])) 
		        count++; 
		    
	    return count; 
	}

	public static void main (String[] args)throws IOException
	{
		Map<String, Integer> map = new HashMap<>();  
		
		String inputFile = args[0];
		String outputFile = args[1];
		String str1 = "";
		
		 Scanner sc = new Scanner(new File(inputFile));
		 BufferedWriter br = new BufferedWriter(new FileWriter(outputFile));
		 
		while (sc.hasNextLine()) {  
		   str1  = str1 + sc.nextLine();
		   if(sc.hasNextLine())
			   str1 = str1 + " ";
		}
	
		String[] arr1 = str1.split(" ", 90);
	
		for(int i  = 0; i < arr1.length; ++i) {
			int number = countOfOccurences(arr1, arr1[i]);
			 map.put(arr1[i], number);
		}
	
		TreeMap<String, Integer> sorted = new TreeMap<>(); 
		sorted.putAll(map);
		for (Map.Entry<String, Integer> entry : sorted.entrySet())  {
			br.write(entry.getKey() + " " + entry.getValue() + "\n");
		}

		br.close();
	}	
}