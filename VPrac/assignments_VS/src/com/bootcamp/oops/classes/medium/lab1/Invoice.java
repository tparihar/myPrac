package com.bootcamp.oops.classes.medium.lab1;

/**
 * 
 * @author Boot Camp User 011
 * This class describes the properties of Invoice
 *
 */
public class Invoice {
	private String partNumber;
	private String description;
	private int quantityOfItem;
	private double pricePerItem;
	Invoice(){
		
	}
	public String getPartNumber() {
		return partNumber;
	}
	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getQuantityOfItem() {
		return quantityOfItem;
	}
	public void setQuantityOfItem(int quantityOfItem) {
		if(quantityOfItem>=0){
		this.quantityOfItem = quantityOfItem;
		}else{
			this.quantityOfItem=0;
		}
	}
	public double getPricePerItem() {
		return pricePerItem;
	}
	public void setPricePerItem(double pricePerItem) {
		if(pricePerItem>=0){
			this.pricePerItem = pricePerItem;
			}else{
				this.pricePerItem=0;
			}
	}
	public void getInvoiceAmount(){
		double invoiceAmount = quantityOfItem*pricePerItem;
		System.out.println(invoiceAmount);
	}
}
