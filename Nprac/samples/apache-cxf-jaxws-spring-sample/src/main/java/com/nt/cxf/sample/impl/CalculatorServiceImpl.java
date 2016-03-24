package com.nt.cxf.sample.impl;

import javax.jws.WebService;

import com.nt.cxf.sample.CalculatorService;

@WebService
public class CalculatorServiceImpl implements CalculatorService {

	@Override
	public double multiply(double num1, double num2) {
		// TODO Auto-generated method stub
		return num1*num2;
	}

}
