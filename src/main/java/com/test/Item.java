package com.test;
public class Item {
	private String name;
	private int quantity;

	public Item() {
	}
    public Item(String name, int quantity) {
		this.name = name;
		this.quantity = quantity;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}