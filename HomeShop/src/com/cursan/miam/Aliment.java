package com.cursan.miam;

public class Aliment {
	private String nom;
	boolean estCuit;
	
	public void manger() {
		if (estCuit) {
			System.out.println("mmm cet aliment " + nom + " est bien cuit");
		} else {
			System.out.println("cet aliment " + nom + " est cru !");
		}
	}
}
