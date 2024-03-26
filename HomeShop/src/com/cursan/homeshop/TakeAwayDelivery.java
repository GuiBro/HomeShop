package com.cursan.homeshop;

public class TakeAwayDelivery implements Delivery {

	private double price = 0;
	private String info = "Récupération à l'entrepôt";
	
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
