package com.Jprakash.OnlineOrderingSystem.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Order {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String ItemName;
	private String ItemGroup;
	private String Price;
	public Order(int id, String itemName, String itemGroup, String price) {
		super();
		this.id = id;
		ItemName = itemName;
		ItemGroup = itemGroup;
		Price = price;
	}
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getItemName() {
		return ItemName;
	}
	public void setItemName(String itemName) {
		ItemName = itemName;
	}
	public String getItemGroup() {
		return ItemGroup;
	}
	public void setItemGroup(String itemGroup) {
		ItemGroup = itemGroup;
	}
	public String getPrice() {
		return Price;
	}
	public void setPrice(String price) {
		Price = price;
	}
	
	
	
	
	

}
