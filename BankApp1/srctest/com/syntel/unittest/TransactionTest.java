package com.syntel.unittest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.util.*;
public class TransactionTest {

	private Transaction transaction = null;
	
	private Map<Integer, Float> accounts = new HashMap<>();
	
	@Before
	/**
	 * Prepare Sample DATA before EACH test case
	 * @throws Exception
	 */
	public void setUp() throws Exception {
		accounts.put(10051, 1500.15F);
		accounts.put(10052, 17899.24F);
		accounts.put(10053, 1296.84F);
		accounts.put(10054, 23009.01F);
		System.out.println("Sample Data Ganerated!");
		transaction = new Transaction(accounts);
	}

	/**
	 * Clean the Test DATA after EACH test case
	 * @throws Exception
	 */
	@After
	public void tearDown() throws Exception {
		accounts.clear();
		System.out.println("Sample DATA Cleaned!");
	}

	@Test
	public void testDeposit() {
		fail("Not yet implemented");
	}

	/**
	 * Test the withdraw() functionality by withdrawing amount
	 * from a Sample account!
	 */
	@Test
	public void testWithdraw() {
		transaction.withdraw(10051, 1000);
		//Check if Given account's actual balance is 500.15
		//With ERROR MARGIN of 0.001
		assertEquals(500.15F, accounts.get(10051),.001f);
		
	}

	@Test
	public void testPayBill() {
		fail("Not yet implemented");
	}

	@Test
	public void testTransfer() {
		fail("Not yet implemented");
	}

}
