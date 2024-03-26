package com.cursan.paris;

public class Bus implements MoyenDeLocomotion {

	@Override
	public void deplace(String adresse) {
		System.out.println("je suis un bus et je vais à " + adresse);
	}

}
