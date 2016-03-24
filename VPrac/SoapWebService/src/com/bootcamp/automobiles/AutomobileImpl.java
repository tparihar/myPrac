/**
 * 
 */
package com.bootcamp.automobiles;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebService;

/**
 * @author Boot Camp User 011
 *
 */
@WebService(endpointInterface = "com.bootcamp.automobiles.Automobile")
public class AutomobileImpl implements Automobile {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.bootcamp.automobiles.Automobile#bikes()
	 */
	@Override
	public List<String> bikes() {
		// TODO Auto-generated method stub
		List<String> bikes = new ArrayList<>();
		bikes.add("hero honda");
		bikes.add("Schooter");
		bikes.add("Duvati");
		return bikes;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.bootcamp.automobiles.Automobile#cars()
	 */
	@Override
	public List<String> cars() {
		// TODO Auto-generated method stub
		List<String> cars = new ArrayList<>();
		cars.add("maruthi");
		cars.add("BMW");
		cars.add("AUDI");
		return cars;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.bootcamp.automobiles.Automobile#trucks()
	 */
	@Override
	public List<String> trucks() {
		// TODO Auto-generated method stub
		List<String> trucks = new ArrayList<>();
		trucks.add("Lorry");
		trucks.add("Tipper");
		trucks.add("Truck");
		return trucks;
	}

}
