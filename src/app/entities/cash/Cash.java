package app.entities.cash;

import app.constants.CurrencyType;

public abstract class Cash {

	private int count;
	
	
	
	public Cash(int count) {
		super();
		this.count = count;
	}

	public abstract CurrencyType currencyType();
	
	public Integer getBalance() {
		return count * currencyType().value;
	}
}
