package com.thereuben.rwsd.chapter_02;

import java.util.List;

public interface IBankTransactionAnalyzer {
	public double totalLoss();

	public int numberOfTransactionsForMonth(int month);

	public int numberOfTransactionsForMonth(String month);

	public List<String> topTenExpenses();

	public String biggestExpense();
}