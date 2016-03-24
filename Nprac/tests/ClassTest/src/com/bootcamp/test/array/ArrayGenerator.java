package com.bootcamp.test.array;

import java.awt.event.ItemEvent;
/**
 * Class contain methods that will take string of inventory items and quantity 
 * and will create two arrays
 * @author Bootcamp User 03
 *
 */
public class ArrayGenerator {

	public static void main(String[] args) {
		String inputStr="inventory:45,assembly:104, supply:203, manufacturing:305";
		try{
		generateArray(inputStr);
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}

	public static void generateArray(String input) throws Exception {
		String[] inventoryArray = input.split(",");

		
		String itemStr = "";
		String itemCountStr = "";
		for (String itemInfo : inventoryArray) {
			if(itemInfo.trim().equals(":")){
				continue;
			}
			String[] items = itemInfo.split(":");
			
			if (items.length == 2) {
				if (items[0] != null && items[0].trim().length()>0) {
					itemStr = itemStr + "" + items[0] + ",";
				}
				if (items[1] != null && items[1].trim().length()>0) {
					itemCountStr = itemCountStr + "" + items[1] + ",";
				}
			} else {
				itemStr = itemStr+""+items[0] + ",";
			}

		}
		
		itemStr=itemStr.substring(0,itemStr.length()-1);
		itemCountStr=itemCountStr.substring(0,itemCountStr.length()-1);
		System.out.println(itemStr);
		System.out.println(itemCountStr);
		
		String[] itemList=itemStr.split(",");
	    String[] quantityList=itemCountStr.split(",");
	    
	    if(itemList.length!=quantityList.length){
	    	throw new Exception("Two Parameters have different length");
	    }
	}

}
