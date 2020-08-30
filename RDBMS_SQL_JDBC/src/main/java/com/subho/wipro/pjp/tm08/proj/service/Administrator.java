package com.subho.wipro.pjp.tm08.proj.service;

import java.util.ArrayList;
import java.util.Date;

import com.subho.wipro.pjp.tm08.proj.bean.Product;
import com.subho.wipro.pjp.tm08.proj.bean.Sales;
import com.subho.wipro.pjp.tm08.proj.bean.SalesReport;
import com.subho.wipro.pjp.tm08.proj.dao.SalesDao;
import com.subho.wipro.pjp.tm08.proj.dao.StockDao;

public class Administrator {

	private static StockDao stockDao = new StockDao();
	private static SalesDao salesDao = new SalesDao();
	
	public String insertStock(Product stockobj) {
		if (stockobj != null && stockobj.getProductName().length() >= 2) {
			String productID=stockDao.generateProductID(stockobj.getProductName());
			stockobj.setProductID(productID);
			if(stockDao.insertStock(stockobj)==1) return productID;
			else return "Data not Valid for insertion";
		}
		else {
			return "Data not Valid for insertion";
		}
		
	}
	
	public String deleteStock(String productID) {
		if(stockDao.deleteStock(productID)==1) return "Deleted";
		else return "record cannot be deleted";
		
	}
	
	public String insertSales(Sales salesobj) {
		if(salesobj==null) return "Object not valid for insertion";
		
		if(stockDao.getStock(salesobj.getProductID())==null) return "Unknown Product for sales";
		
		if(stockDao.getStock(salesobj.getProductID()).getQuantityOnHand()<salesobj.getQuantitySold())
			return "Not enough stock on hand for sales";
		
		if(salesobj.getSalesDate().before(new Date())) return "Invalid DATE";
		
		String sales_id=salesDao.generateSalesID(salesobj.getSalesDate());
		
		salesobj.setSalesID(sales_id);
		
		if(salesDao.insertSales(salesobj)==1) {
			if(stockDao.updateStock(salesobj.getProductID(), salesobj.getQuantitySold())==1)
				return "Sales Completed";
			else return "Error";
		}else return "Error";
	}
	
	public ArrayList<SalesReport> getSalesReport(){
		return salesDao.getSalesReport();
	}
	
}
