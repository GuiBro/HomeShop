package com.cursan.miam;

public class Four {
	private int puissance;
	private int capacite;
	
	public Four(int temperature, int duree) {
		if (temperature <= 40 || temperature >= 250) 
			throw new IllegalArgumentException("La température du four doit être entre 40 et 250°C");
		if(duree <= 0)
			throw new IllegalArgumentException("La durée doit être positive");
	}
	
	Resistance resistance;
	Soufflerie soufflerie;
	
	public void cuire(Aliment aliment) {
		//System.out.println("je cuit un aliment : " + aliment.);
		System.out.println("avec ma capacité de " + capacite);
		System.out.println("et ma puissance de " + puissance);
	}
}
