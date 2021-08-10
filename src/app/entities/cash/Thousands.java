package app.entities.cash;

import app.constants.CurrencyType;

public class Thousands extends Cash {

	private final CurrencyType type = CurrencyType.TEN;
	
	public Thousands(int count) {
		super(count);
		// TODO Auto-generated constructor stub
	}

	@Override
	public CurrencyType currencyType() {
		// TODO Auto-generated method stub
		return type;
	}

}
