package com.thereuben.rwsd.chapter_02;

import java.util.ArrayList;
import java.util.List;

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
		return new ArrayList<String>();
	}

	public String biggestExpense() {
		return "zero";
	}
}