package app.entities.cash;

import app.constants.CurrencyType;

public class Fifties extends Cash {

	private final CurrencyType type = CurrencyType.FIFTY;
	
	public Fifties(int count) {
		super(count);
		// TODO Auto-generated constructor stub
	}

	@Override
	public CurrencyType currencyType() {
		// TODO Auto-generated method stub
		return type;
	}

}
