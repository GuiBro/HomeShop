package com.cursan.miam;

public class Four {
	private int puissance;
	private int capacite;
	
	public Four(int temperature, int duree) {
		if (temperature <= 40 || temperature >= 250) 
			throw new IllegalArgumentException("La temp�rature du four doit �tre entre 40 et 250�C");
		if(duree <= 0)
			throw new IllegalArgumentException("La dur�e doit �tre positive");
	}
	
	Resistance resistance;
	Soufflerie soufflerie;
	
	public void cuire(Aliment aliment) {
		//System.out.println("je cuit un aliment : " + aliment.);
		System.out.println("avec ma capacit� de " + capacite);
		System.out.println("et ma puissance de " + puissance);
	}
}
