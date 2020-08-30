package com.wipro.service;

import java.util.List;

import com.wipro.bean.Car_Details;
import com.wipro.dao.Car_DetailsCriteria;

public class CriteriaTester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car_DetailsCriteria dao = new Car_DetailsCriteria();
		
		List<Car_Details> result1 = dao.getCarByColor("Black");
		System.out.println("\nCar Details :-->>");
		for(Car_Details ob : result1)
			System.out.println(ob);
	}

}
