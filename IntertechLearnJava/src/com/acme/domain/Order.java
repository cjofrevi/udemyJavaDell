package com.acme.domain;

import com.acme.utils.MyDate;

public class Order {
	MyDate orderDate;
	double orderAmount = 0.00;
	String customer;
	String product;
	int quantity;

	public static double taxRate = 0.05;
	
	public Order(MyDate d, double amt, String c, String p, int q){
		orderDate=d;
		orderAmount=amt;
		customer=c;
		product=p;
		quantity=q;
	}

	public static void setTaxRate(double newRate){
		taxRate = newRate;
	}

	public static void computeTaxOn( double anAmount){
		System.out.println("The tax for " + anAmount + " is: " +
				anAmount * Order.taxRate);
	}

	public double computeTax() {
		System.out.println("The tax for this order is: " + orderAmount
				* Order.taxRate);
		return orderAmount * Order.taxRate;
	}

	public char jobSize( ){

		if(this.quantity <= 25){
			return 'S';
		}else if(this.quantity >=26 && this.quantity<=75){
			return 'M';
		}
		else if(this.quantity >=27 && this.quantity<=150){
			return 'L';
		}
		else{
			return 'X';
		}
	}

	public double computeTotal(){

		//Order total = order amount – discount (if applicable) + tax (if
		//applicable)

		return 0.0;
	}


	public String toString(){
		return quantity + " ea. " + product + " for " + customer; 
	}
}
