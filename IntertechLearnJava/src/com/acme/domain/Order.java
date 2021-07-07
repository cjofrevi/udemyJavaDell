package com.acme.domain;

import com.acme.utils.MyDate;

public class Order {
	private MyDate orderDate;
	private double orderAmount = 0.00;
	private String customer;
	private Product product;
	private int quantity;

	public static double taxRate = 0.05;
	
	public Order(MyDate d, double amt, String c, Product p, int q){
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

	public MyDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(MyDate orderDate) {
		this.orderDate = orderDate;
	}

	public double getOrderAmount() {
		return orderAmount;
	}

	public void setOrderAmount(double orderAmount) {
		if(this.isValid(orderAmount)){
			this.orderAmount = orderAmount;
		}
	}

	public String getCustomer() {
		return customer;
	}

	public void setCustomer(String customer) {
		this.customer = customer;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		if(this.isValid(quantity)){
			this.quantity = quantity;
		}
	}

	public static double getTaxRate() {
		return taxRate;
	}

	public boolean isValid(double number){
		if(number < 0){
			System.out.println("please use a number over zero");
			return false;
		}
		return true;
	}

	public double computeTax() {
		System.out.println("The tax for this order is: " + orderAmount
				* Order.taxRate);
		return orderAmount * Order.taxRate;
	}

	public char jobSize( ){

		if(this.quantity <= 25){
			return 'S';
//		}else if(this.quantity >=26 && this.quantity<=75){
		}else if(this.quantity<=75){
			return 'M';
		}
//		else if(this.quantity >=76 && this.quantity<=150){
		else if(this.quantity<=150){
			return 'L';
		}
		else{
			return 'X';
		}
	}

	public double computeTotal(){

		//Order total = order amount – discount (if applicable) + tax (if
		//applicable)


		return this.orderAmount * (1- Size.getSizeEnum(this.jobSize()).getDiscount())
				+ (this.orderAmount > 1500 ? 0: computeTax()) ;
	}


	public String toString(){
		return quantity + " ea. " + product + " for " + customer; 
	}
}
