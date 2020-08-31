package com.subho.wipro.pjp.tm07.proj.cusfsc;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
import java.util.TreeSet;

public class Cards {
	static String symbol;
	static int number;
	TreeSet<String> card = new TreeSet<String>();
	ArrayList<Integer> al = new ArrayList<Integer>(Collections.nCopies(60, 4));
	int counter = 0;
	int flag = 97;
	Character ch = (char)flag;
	
	public void add(String symbol, int number, int n) {
		this.symbol = symbol;
		this.number = number;
		if(card.add(symbol) == true) {
			if(symbol.equals("a"))
				al.set(0, number);
			if(symbol.equals("b"))
				al.set(1, number);
			if(symbol.equals("c"))
				al.set(2, number);
			if(symbol.equals("d"))
				al.set(3, number);
		}
		
		Iterator<String> i = card.iterator();
		while(i.hasNext()) {
			if(ch.toString().equals(i.next())) {
				++counter;
				ch = (char)(++flag);
			}
		}
		if(counter == 4)
			display(n);
	}
	
	public void display(int n) {
		System.out.println("Four symbols gathered in " + n+ " cards.");
		System.out.println("Cards in Set are: ");
		Iterator<String> i = card.iterator();
		Iterator<Integer> j = al.iterator();
		while(i.hasNext() ) {
			System.out.print(i.next() + "\t");
			System.out.println(j.next());
		}
		System.exit(0);
	}
	
	public static void main(String[] args) {
		Cards obj = new Cards();
		Scanner sc = new Scanner(System.in);
		// n to count number of cards
		int n =0;
		while(true) {
			++n;
			System.out.println("Enter a card: ");
			symbol = sc.nextLine();
			number = sc.nextInt();
			sc.nextLine();
			obj.add(symbol, number, n);
		}
	}
}