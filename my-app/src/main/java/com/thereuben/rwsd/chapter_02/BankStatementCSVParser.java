package com.thereuben.rwsd.chapter_02;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class BankStatementCSVParser implements IBankStatementCSVParser {

	private static final DateTimeFormatter DATE_PATTERN 
		= DateTimeFormatter.ofPattern("dd-MM-yyyy");

	public BankTransaction parseCSVLine(final String line){
		final String[] transactionColumns = line.split(",");

		final LocalDate date 
			= LocalDate.parse(transactionColumns[0], DATE_PATTERN);
		final double amount = Double.parseDouble(transactionColumns[1]);
		final String category = transactionColumns[2];

		return new BankTransaction(date, amount, category);
	}

	public List<BankTransaction> parseCSV(final List<String> lines) {
		List<BankTransaction> transactions = new ArrayList<>();

		for (String line : lines) {
			transactions.add(parseCSVLine(line));
		}

		return transactions;
	}
}