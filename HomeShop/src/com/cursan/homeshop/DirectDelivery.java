package com.cursan.homeshop;

public class DirectDelivery implements Delivery {

	private double price = 4.99;
	private String info = "Livraison à domicile";
	
	@Override
	public double getPrice() {
		return price;
	}

	@Override
	public String getinfos() {
		return info;
	}
	
}
