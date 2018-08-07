package com.syntel.unittest;

import java.util.*;

public class Transaction {
	Map<Integer, Float> accounts = new HashMap<>();

	public Transaction(Map<Integer,Float> accounts) {
		this.accounts = accounts;
	}

	public void deposit(int accNo, float amt) {
		Float balance = accounts.get(accNo);
		if(balance==null) {
			System.out.println("Account doesnot exists");
			return;
		}
		accounts.put(accNo, balance+amt);
	}

	public void withdraw(int accNo, float amt) {
		Float balance = accounts.get(accNo);
		if(balance==null) {
			System.out.println("Account doesnot exists");
			return;
		}
		accounts.put(accNo, balance+amt);
	}

	public void payBill(int accNo, float amt, int vendorAccNo) {

	}

	public void transfer(int srcAccNo, int destAccNo, float amt) {
		Float balance = accounts.get(srcAccNo);
		if(balance==null) {
			System.out.println("Account doesnot exists");
			return;
		}
		accounts.put(srcAccNo, balance+amt);
		Float balance2 = accounts.get(destAccNo);
		if(balance==null) {
			System.out.println("Account doesnot exists");
			return;
		}
		accounts.put(destAccNo, balance+amt);
	}
}
