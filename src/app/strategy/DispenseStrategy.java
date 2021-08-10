package app.strategy;

import java.util.Collection;
import java.util.List;

import app.entities.cash.Cash;
import app.exception.NotEnoughFundsException;

public interface DispenseStrategy {

	List<Cash> dispense(int amount, Collection<Cash> cashBalances) throws NotEnoughFundsException;
}
