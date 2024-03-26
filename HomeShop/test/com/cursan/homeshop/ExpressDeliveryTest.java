package com.cursan.homeshop;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ExpressDeliveryTest {

	@Test
	public void Given_ParisCityAsLocation_WhenGettingDelivery_ThenGet6e99() {
		Delivery delivery = new ExpressDelivery("Paris");
		assertEquals(6.99, delivery.getPrice(), 0.01);
	}
	
	@Test
	public void Given_RegionCityAsLocation_WhenGettingDelivery_ThenGet9e99() {
		Delivery delivery = new ExpressDelivery("Bordeaux");
		assertEquals(9.99, delivery.getPrice(), 0.01);
	}

}
