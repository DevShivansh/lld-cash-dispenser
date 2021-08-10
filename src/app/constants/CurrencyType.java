package app.constants;

public enum CurrencyType {

	ONE(1), TWO(2), FIVE(5), TEN(10), TWEENTY(20), FIFTY(50),
	HUNDRED(100), TWO_HUNDRED(200), FIVE_HUNDRED(500), THOUSAND(1000), TWO_THOUSAND(2000);
	
	public int value;

	private CurrencyType(int value) {
		this.value = value;
	}
	
	
}
