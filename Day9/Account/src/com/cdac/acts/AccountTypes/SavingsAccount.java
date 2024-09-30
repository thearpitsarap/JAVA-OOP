package com.cdac.acts.AccountTypes;

import java.util.Date;

import com.cdac.acts.MyEnums.Depositable;
import com.cdac.acts.MyEnums.Withdrawable;

public class SavingsAccount extends Account implements Withdrawable, Depositable {
	public SavingsAccount(String name, double amount, Date d) {
		super(name, amount, d);
	}

	@Override
	public double withdraw(double w) {
		System.out.println("Amount " + w + " Withdrawn Succesfully.");
		return this.amount -= w;
	}

	@Override
	public double Deposit(double d) {
		System.out.println("Amount " + d + " Deposited Succesfully.");
		return this.amount += d;
	}

	@Override
	public String toString() {
		return super.toString();
	}
}
