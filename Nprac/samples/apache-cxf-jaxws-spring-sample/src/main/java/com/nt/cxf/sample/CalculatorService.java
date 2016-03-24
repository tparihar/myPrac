package com.nt.cxf.sample;

import javax.jws.WebService;

@WebService
public interface CalculatorService {
	double multiply(double num1,double num2);

}
