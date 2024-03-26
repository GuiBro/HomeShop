package com.cursan.homeshop;

public class RelayDelivery implements Delivery {
	
	private double price;
	private String info;
		
	public RelayDelivery(int numeroRelay) {
		if (numeroRelay >= 1 && numeroRelay <= 22) {
			this.price = 0;
			this.info = "Livraison en point relais 1 � 22";
		} else if (numeroRelay >= 23 && numeroRelay <= 47) {
			this.price = 2.99;
			this.info = "Livraison en point relais 23 � 47";
		} else if (numeroRelay >= 48) {
			this.price = 4.99;
			this.info = "Livraison en point relais sup�rieur � 47";
		} else {
			System.out.println("Ce n'est pas le bon num�ro");
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
