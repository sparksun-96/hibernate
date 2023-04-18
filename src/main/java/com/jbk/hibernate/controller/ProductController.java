package com.jbk.hibernate.controller;

import com.jbk.hibernate.dao.ProductDao;
import com.jbk.hibernate.entity.Product;

public class ProductController {
	
	public static void main(String[] args) {
		
		ProductDao dao= new ProductDao();
		Product product=new Product("1","pen",1,1,10,10);
		
		String msg = dao.saveproduct(product);
		System.out.println(msg);
	}

}
