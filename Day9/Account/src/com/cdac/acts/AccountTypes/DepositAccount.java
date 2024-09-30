package com.cdac.acts.AccountTypes;

import java.util.Date;

import com.cdac.acts.MyEnums.Depositable;
import com.cdac.acts.MyEnums.Maturable;

public class DepositAccount extends Account implements Maturable {

	public DepositAccount(String name, double amount, Date d) {
		super(name, amount, d);
	}

	@Override
	public double MaturityCalcAmount(double d) {
		return ((5.0 / 100) * amount) * 5;
	}

	@Override
	public String toString() {
		return "Account No - " + accNumber + " Holder Name - " + holderName + " Maturity Amount - "
				+ MaturityCalcAmount(amount) + " Date - " + date;
	}

}