package com.bootcamp.collection.set;

import java.util.LinkedHashSet;
/**
 * 
 * @author Boot Camp User 011
 *
 */
public class SetDemo {
	public static void main( String [] args ) {

	    // Create a set called mySet
		
	    LinkedHashSet<String>mySet = new LinkedHashSet<String>();

	    // Ensure that this set contains an interesting selection of fruit 
	    String fruit4 = "pear", fruit5 = "banana", fruit2 = "tangerine",
	                            fruit3 = "strawberry", fruit1 = "blackberry";
	    mySet.add( fruit1 );
	    mySet.add( fruit2 );
	    mySet.add( fruit3 );
	    mySet.add( fruit2 );
	    mySet.add( fruit4 );
	    mySet.add( fruit5 );

	    // Display contents of mySet
	    System.out.println( "mySet now contains:" );
	    System.out.println( mySet );
	    System.out.println(mySet.size());
	    
	    mySet.remove(fruit5);
	    mySet.remove(fruit4);
	    System.out.println( mySet );
	    
	    SetDemo sd = new SetDemo();
	    sd.removeAll(mySet);
	    System.out.println( mySet );
	  }
	
	public void removeAll(LinkedHashSet<String> mySet){
		
		mySet.removeAll(mySet);
		System.out.println("mySet has been cleared");
	}
}
