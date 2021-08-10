package app.entities.cash;

import app.constants.CurrencyType;

public class FiveHundreds extends Cash {

	private final CurrencyType type = CurrencyType.FIVE_HUNDRED;
	
	public FiveHundreds(int count) {
		super(count);
		// TODO Auto-generated constructor stub
	}

	@Override
	public CurrencyType currencyType() {
		// TODO Auto-generated method stub
		return type;
	}

}
