/**
 * 
 */
package com.bootcamp.automobiles;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * @author Boot Camp User 011
 *
 */
@WebService(name="Motors", targetNamespace="http://MotorVehicles.com")
public interface Automobile {
	
	@WebMethod(operationName="getBikes")
	public List<String> bikes();
	
	@WebMethod(operationName="getCars")
	public List<String> cars();
	
	@WebMethod(operationName="getTrucks")
	public List<String> trucks();

}
