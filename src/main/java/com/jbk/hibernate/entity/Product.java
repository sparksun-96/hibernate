package com.jbk.hibernate.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "product1")
public class Product {
	
	@Id
	@Column(unique = true,nullable = false)
	private String productid;
	
	@Column(unique = true,nullable = false)
	private String productname;
	
	@Column(nullable = false)
	private int suppierid;
	
	@Column(nullable = false)
	private int categoryid;
	
	@Column(nullable = false)
	private int productqty;
	
	@Column(nullable = false)
	private double productprice;
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(String productid, String productname, int suppierid, int categoryid, int productqty,
			double productprice) {
		super();
		this.productid = productid;
		this.productname = productname;
		this.suppierid = suppierid;
		this.categoryid = categoryid;
		this.productqty = productqty;
		this.productprice = productprice;
	}
	public String getProductid() {
		return productid;
	}
	public void setProductid(String productid) {
		this.productid = productid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public int getSuppierid() {
		return suppierid;
	}
	public void setSuppierid(int suppierid) {
		this.suppierid = suppierid;
	}
	public int getCategoryid() {
		return categoryid;
	}
	public void setCategoryid(int categoryid) {
		this.categoryid = categoryid;
	}
	public int getProductqty() {
		return productqty;
	}
	public void setProductqty(int productqty) {
		this.productqty = productqty;
	}
	public double getProductprice() {
		return productprice;
	}
	public void setProductprice(double productprice) {
		this.productprice = productprice;
	}
	@Override
	public String toString() {
		return "Product [productid=" + productid + ", productname=" + productname + ", suppierid=" + suppierid
				+ ", categoryid=" + categoryid + ", productqty=" + productqty + ", productprice=" + productprice + "]";
	}
	
	
	
	

}
