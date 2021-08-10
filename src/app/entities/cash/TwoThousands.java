package app.entities.cash;

import app.constants.CurrencyType;

public class TwoThousands extends Cash {

	private final CurrencyType type = CurrencyType.TWO_THOUSAND;
	
	public TwoThousands(int count) {
		super(count);
		// TODO Auto-generated constructor stub
	}

	@Override
	public CurrencyType currencyType() {
		// TODO Auto-generated method stub
		return type;
	}

}
