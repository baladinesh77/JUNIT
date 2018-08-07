package com.syntel;

import java.util.Scanner;

public class CalcApp {
	private Scanner sc = new Scanner(System.in);
	private CalculatorService calc;


	public CalcApp(CalculatorService calc) {
		super();
		this.calc = calc;
	}

	public double doSum() {
		System.out.println("Enter two numbers:  ");
		double n1=0,n2=0;
		n1 = sc.nextDouble();
		n2 = sc.nextDouble();
		return calc.add(n1, n2);
	}
	
	
}
