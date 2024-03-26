package com.cursan.miam;


import com.cursan.homeshop.Bill;
import com.cursan.homeshop.Customer;
import com.cursan.homeshop.Delivery;
import com.cursan.homeshop.FileWriter;
import com.cursan.homeshop.Fridge;
import com.cursan.homeshop.NoProductInBillException;
import com.cursan.homeshop.Product;
import com.cursan.homeshop.RelayDelivery;
import com.cursan.homeshop.Television;

public class Main {
	public static void main(String[] args) {
		
		Product cafe = new Product("Philips HD7866/61", "Philips SENSEO Quadrante noir", 79.99);
		Product tv = new Television("TV Samsung", "Smart TV LED incurvé", 599, 49, "LED");
		Product fridge = new Fridge("BEKO TSE 1042 F", "Réfrigirateur BEKO", 189, 130, true);
		Customer customer = new Customer("Juste Leblanc", "19 rue saint germain des près, Paris");
		Delivery lowCostRelayDelivery = new RelayDelivery(27);
		
			Bill bill = new Bill(customer, lowCostRelayDelivery);
//			bill.addProduct(cafe, 1);
//			bill.addProduct(tv, 1);
//			bill.addProduct(fridge, 2);
			try {
			bill.generate(new FileWriter("Facture"));
			}catch (NoProductInBillException e){
				System.err.println("Pas de produit dans la facture");
			}
	}

	}
	
	


