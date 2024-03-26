package com.cursan.paris;

public class Taxi implements MoyenDeLocomotion {

	@Override
	public void deplace(String adresse) {
		System.out.println("Je prend le taxi jusqu'à " + adresse);
	}

}
