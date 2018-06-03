package com.java;

public class Invoice {
	String pastNumber;
	String pastDescription;
	int quantity;
	double price;
	double total;
	public String getPastNumber() {
		return pastNumber;
	}
	public void setPastNumber(String pastNumber) {
		this.pastNumber = pastNumber;
	}
	public String getPastDescription() {
		return pastDescription;
	}
	public void setPastDescription(String pastDescription) {
		this.pastDescription = pastDescription;
	}
	public int getQuantity() {
		if(quantity<0)
			return 0;
		else
		 return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		if(price<0)
			return 0;
		else
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getInvoiceAmount()
	{
		total= quantity *price;
		return total;
	}

	public static void main(String args[])
	{
		Invoice invoice1=new Invoice();
		invoice1.setQuantity(-4);
		invoice1.setPrice(200);
	    System.out.println(invoice1.getQuantity());
	    System.out.println(invoice1.getPrice());
	    System.out.println(invoice1.getInvoiceAmount());
	    
	}

}
