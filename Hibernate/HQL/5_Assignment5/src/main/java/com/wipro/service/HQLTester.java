package com.wipro.service;

import java.util.List;

import com.wipro.bean.Car_Details;
import com.wipro.dao.Car_DetailsDAO;

public class HQLTester {
	
	public static void main(String[] args) {
		Car_DetailsDAO dao = new Car_DetailsDAO();
		List<Car_Details> result = dao.getDetails();
		System.out.println("\nCar Details :-->>");
		System.out.println("===================================================================================================");
		for(Car_Details ob : result)
			System.out.println(ob);
		System.out.println("===================================================================================================");
		
	}
}
