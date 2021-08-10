package app.entities.cash;

import app.constants.CurrencyType;

public class Fives extends Cash {

	private final CurrencyType type = CurrencyType.FIVE;
	
	public Fives(int count) {
		super(count);
		// TODO Auto-generated constructor stub
	}

	@Override
	public CurrencyType currencyType() {
		// TODO Auto-generated method stub
		return type;
	}

}
