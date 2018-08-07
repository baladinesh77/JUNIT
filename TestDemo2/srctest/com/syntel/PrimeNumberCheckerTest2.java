package com.syntel;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class PrimeNumberCheckerTest2 {

	//Input and Expected Output for EACH test case!!!
	private Integer input;
	private boolean result;
	
	//Class under test
	private PrimeNumberChecker checker = new PrimeNumberChecker();
	
	public PrimeNumberCheckerTest2(Integer input, Boolean result) {
		this.input = input;
		this.result = result;
	}
	
	@Parameters
	public static Collection testCases() {
		return Arrays.asList(new Object[] []{
				{2,true},
				{6,false},
				{19,true},
				{22,false},
				{23,true}
		});
	}
	
	@Test
	public void testValidate() {
		System.out.println("Using input : "+input);
		assertEquals(result, checker.validate(input));
	}

}
