package com.subho.wipro.pjp.tm03.Packages.q2.com.automobile;

import com.subho.wipro.pjp.tm03.Packages.q2.com.automobile.fourwheeler.Ford;
import com.subho.wipro.pjp.tm03.Packages.q2.com.automobile.fourwheeler.honda;
import com.subho.wipro.pjp.tm03.Packages.q2.com.automobile.fourwheeler.logan;
import com.subho.wipro.pjp.tm03.Packages.q2.com.automobile.twowheeler.hero;

public class test {

	public static void main(String[] args) {
		hero v = new hero();
		System.out.println("Model Number : "+v.getModelNumber());
		System.out.println("Registration Number : "+v.getRegistrationNumber());
		System.out.println("Owner Name : "+v.getOwnerName());
		System.out.println("Speed : "+v.getSpeed());
		v.radio();
		honda h = new honda();
		System.out.println("Model Number : "+h.getModelNumber());
		System.out.println("Registration Number : "+h.getRegistrationNumber());
		System.out.println("Owner Name : "+h.getOwnerName());
		System.out.println("Speed : "+h.getSpeed());
		h.cdplayer();
		logan l = new logan();
		System.out.println("Model Number : "+l.getModelNumber());
		System.out.println("Registration Number : "+l.getRegistrationNumber());
		System.out.println("Owner Name : "+l.getOwnerName());
		System.out.println("Speed : "+l.getSpeed());
		System.out.println("Gps Coordinates : "+l.gps());
		Ford f = new Ford();
		System.out.println("Model Number : "+f.getModelNumber());
		System.out.println("Registration Number : "+f.getRegistrationNumber());
		System.out.println("Owner Name : "+f.getOwnerName());
		System.out.println("Speed : "+f.getSpeed());
		f.tempControl();
	}

}
