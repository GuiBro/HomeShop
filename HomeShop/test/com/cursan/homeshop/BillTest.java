package com.cursan.homeshop;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BillTest {
	
	private String output;
	private Writer writerMock = new Writer() {
		@Override
		public void start() {
			output = "";
		}
		
		@Override
		public void writeLine(String line) {
			output += line + "%n";
		}
		
		@Override
		public void stop() {
			
		}
	};

	private Product cafe = new Product("Philips HD7866/61", "Philips SENSEO Quadrante noir", 79.99);
	private Product tv = new Television("TV Samsung", "Smart TV LED incurvé", 599, 49, "LED");
	private Product fridge = new Fridge("BEKO TSE 1042 F", "Réfrigirateur BEKO", 189, 130, true);
	private Customer customer = new Customer("Juste Leblanc", "19 rue saint germain des près, Paris");
	private Delivery lowCostRelayDelivery = new RelayDelivery(27);
	
	@Test
	public void Given_2ProductsAndDelivery_When_generatingBill_then_getGoodLineNumber() {
		Bill bill = new Bill(customer, lowCostRelayDelivery);
		bill.addProduct(cafe, 1);
		bill.addProduct(tv, 1);
		bill.generate(writerMock);
		int lineNumber = output.split("%n").length;
		assertEquals(19, lineNumber);
	}
	
	@Test
	public void Given_3ProductsAndDelivery_When_GeneratingBill_Then_getGoodTotal() {
		Bill bill = new Bill(customer, lowCostRelayDelivery);
		bill.addProduct(cafe, 1);
		bill.addProduct(tv, 1);
		assertEquals(cafe.getPrice() + tv.getPrice() + lowCostRelayDelivery.getPrice(), bill.getTotal(), 0.01);
	}
	
	@Test
	public void Given_EmptyProductList_WhenGeneratingBill_Then_ThrowsException() {
		Bill bill = new Bill(customer, lowCostRelayDelivery);
		assertThrows(NoProductInBillException.class, () -> bill.generate(writerMock));
	}

}
