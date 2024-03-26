package com.cursan.homeshop;

public class ExpressDelivery implements Delivery {
	private double price;
	private String info;

	public ExpressDelivery(String villeDeDestination) {
		if (villeDeDestination.equals("Paris")){
			this.price = 6.99;
			this.info = "Livraison à destination de Paris";
		} else {
			this.price = 9.99;
			this.info = "Livraison en dehors de Paris";
		}
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
