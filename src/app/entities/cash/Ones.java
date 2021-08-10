package app.entities.cash;

import app.constants.CurrencyType;

public class Ones extends Cash {

	private final CurrencyType type = CurrencyType.ONE;
	
	public Ones(int count) {
		super(count);
		// TODO Auto-generated constructor stub
	}

	@Override
	public CurrencyType currencyType() {
		// TODO Auto-generated method stub
		return type;
	}

}
