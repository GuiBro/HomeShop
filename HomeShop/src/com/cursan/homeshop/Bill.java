package com.cursan.homeshop;

import java.util.HashMap;
import java.util.Map;

public class Bill {
	private Customer customer;
	private Map<Product, Integer> products = new HashMap<Product, Integer>();
	private Delivery delivery;
	
	public Bill(Customer customer, Delivery delivery) {
		this.customer = customer;
		this.delivery = delivery;
	}
	
	/**
	 * add a product with a quantity associated in the bill
	 * @param product product to add
	 * @param quantity quantity of the product
	 */
	
	public void addProduct(Product product, Integer quantity) {
		this.products.put(product, quantity);
	}

	public Customer getCustomer() {
		return customer;
	}

	public Map<Product, Integer> getProducts() {
		return products;
	}
	
	public void generate(Writer writer) {
		if (products.isEmpty())
			throw new NoProductInBillException();
		writer.start();
		writer.writeLine("HomeShop Company");
		writer.writeLine("1 place charle de Gaulle");
		writer.writeLine("");
		writer.writeLine("Facture à l'attention de :");
		writer.writeLine(customer.getFullname());
		writer.writeLine("Mode de livraison : " + delivery.getinfos() + " : " + delivery.getPrice());
		writer.writeLine("Produits :");
		writer.writeLine("------------------------------------------------------");
		writer.writeLine("");
		writer.writeLine(this.getListOfProducts());
		writer.writeLine("------------------------------------------------------");
		writer.writeLine("");
		writer.writeLine("total = " + this.getTotal());
		writer.stop();
	}
	
	public double getTotal() {
		double total = 0;
		for (Map.Entry<Product, Integer> entry : products.entrySet()) {
			Product product = entry.getKey();
			Integer quantity = entry.getValue();
			total += quantity*product.getPrice();
		}
		total += delivery.getPrice();

		return total;
	}
	
	public String getListOfProducts() {
		String listOfProducts = "";
		for (Map.Entry<Product, Integer> entry : products.entrySet()) {
			Product product = entry.getKey();
			Integer quantity = entry.getValue();
			listOfProducts += product.getName() + " - " + product.getPrice() + " - " + quantity + " unité(s) %n";
			listOfProducts += product.getDescription() + "%n";
			listOfProducts += "%n";
		}
		listOfProducts += "Livraison : " + delivery.getPrice();
		return listOfProducts;
	}

}
