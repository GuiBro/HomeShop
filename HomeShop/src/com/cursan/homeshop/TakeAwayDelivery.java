package com.cursan.homeshop;

public class TakeAwayDelivery implements Delivery {

	private double price = 0;
	private String info = "R�cup�ration � l'entrep�t";
	
	public TakeAwayDelivery() {
	}
	
	@Override
	public double getPrice() {
		return price;
	}

	@Override
	public String getinfos() {
		return info;
	}
	
}
