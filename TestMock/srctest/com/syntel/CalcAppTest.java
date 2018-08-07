package com.syntel;

import static org.junit.Assert.*;

import org.easymock.EasyMock;
import org.easymock.EasyMockRunner;
import org.easymock.Mock;
import org.easymock.TestSubject;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(EasyMockRunner.class)
public class CalcAppTest {
	
	@Mock
	private CalculatorService calc;
	
	@TestSubject //Object who uses MOCK
	private CalcApp app ;
	
	public CalcAppTest() {

		app = new CalcApp(calc);
	}
	
	@Test
	public void test() {
		//Add the expected behavior for newly created Mock Object calc
		 EasyMock.expect(calc.add(10.0,20.0)).andReturn(30.00); 
		//Don't forget to Activate It!!
		 EasyMock.replay(calc);
		app.doSum();
	}

}
