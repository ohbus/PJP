package com.subho.wipro.pjp.tm07.proj.sb;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Iterator;

public class BoxDemo {

	public static HashSet<Box> set = new HashSet<Box>();
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of box ");
		int n = sc.nextInt();
		
		Box[] arr = new Box[n];
		sc.nextLine();
		
		for(int i = 0; i < n; ++i) {
			System.out.println("Enter the box " +(i+1) + " details");
			System.out.println("Enter length");
			double length = sc.nextDouble();
			sc.nextLine();
			System.out.println("Enter width");
			double width = sc.nextDouble();
			System.out.println("Enter height");
			double height = sc.nextDouble();
			arr[i] = new Box(length , width, height);
			
			boolean flag = true;
			
			if(i == 0) {
				set.add(arr[i]);
			}
			else
			{
				for(Box ob : set) {
					if(ob.calcVolume() == (length * width * height)){
						flag = false;
						break;
					}
				}
				if(flag == true)
					set.add(arr[i]);
			}
			
		}
		Iterator<Box> iter = set.iterator();
		System.out.println("Unique Boxes in the Set are");
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
	
}