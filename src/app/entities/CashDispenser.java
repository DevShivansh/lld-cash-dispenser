package app.entities;

import java.util.List;

import app.entities.cash.Cash;
import app.exception.NotEnoughFundsException;
import app.repository.BalanceRepo;
import app.strategy.DispenseStrategy;

public class CashDispenser {

	private BalanceRepo balance;
	
	private DispenseStrategy dispenseStrategy;
	
	public CashDispenser(BalanceRepo balance, DispenseStrategy dispenseStrategy) {
		super();
		this.balance = balance;
		this.dispenseStrategy = dispenseStrategy;
	}

	public List<Cash> getBalance(Integer amount, List<Cash> cashPaid){
		Integer total = balance.addCash(cashPaid);
		List<Cash> balanceCash = null;
		String message = "";
		try {
		  balanceCash = dispenseStrategy.dispense(total, balance.values());
		  message = "Success";
		}catch(NotEnoughFundsException e) {
			balanceCash = cashPaid;
			message = e.getMessage();
		}
		System.out.println(message);
		balance.deduct(balanceCash);
		return balanceCash;
	}
	
	public void changeStrategy(DispenseStrategy dispenseStrategy) {
		this.dispenseStrategy = dispenseStrategy;
	}
	
}
