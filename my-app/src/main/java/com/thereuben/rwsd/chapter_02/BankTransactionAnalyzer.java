package com.thereuben.rwsd.chapter_02;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class BankTransactionAnalyzer implements IBankTransactionAnalyzer {
	private List<BankTransaction> transactions;

	public BankTransactionAnalyzer(List<BankTransaction> transactions) {
		this.transactions = transactions;
	}

	public double totalLoss(){
		double total = 0.0;

		for (BankTransaction bt: transactions) {
			total += bt.getAmount();
		}

		return total;
	}

	public int numberOfTransactionsForMonth(int month){
		return 0;
	}

	public int numberOfTransactionsForMonth(String month) {
		return 0;
	}

	public List<String> topTenExpenses() {
		List<String> topTenList = new ArrayList<>();
		List<Entry<String, Double>> list = groubCostByCategory();
		for (Entry<String, Double> pair : list.subList(0, 11)) {
			topTenList.add(pair.getKey());
		}

		return topTenList;
	}

	public BankTransaction biggestExpense() {
		return this.transactions.get(0);
	}

	// Additional methods
	public void sortTransactions() {
		this.transactions.sort(
			(BankTransaction o1, BankTransaction o2) 
				-> (int)(o2.getAmount()*100) - (int)(o1.getAmount()*100)
			);
	}

	public List<Entry<String, Double>> groubCostByCategory() {
		Map<String, Double> map = new HashMap<>();

		for (BankTransaction bt : this.transactions) {
			double value = (map.get(bt.getCategory()) == null)
				? 0
				: map.get(bt.getCategory());
			map.put(bt.getCategory(), value += bt.getAmount());
		}

		List<Entry<String, Double>> list = 
			new ArrayList<Entry<String, Double>>(map.entrySet());

		list.sort(
			(Entry<String, Double> o1, Entry<String, Double> o2) 
			-> (int)(o2.getValue()*100) - (int)(o1.getValue()*100)
			);			

		return list;
	}
}