package app.entities.cash;

import app.constants.CurrencyType;

public class Twos extends Cash {

	private final CurrencyType type = CurrencyType.TWO;
	
	public Twos(int count) {
		super(count);
		// TODO Auto-generated constructor stub
	}

	@Override
	public CurrencyType currencyType() {
		// TODO Auto-generated method stub
		return type;
	}

}
