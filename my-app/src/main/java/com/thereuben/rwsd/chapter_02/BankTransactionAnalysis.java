package com.thereuben.rwsd.chapter_02;

import java.io.IOException;
import java.util.List;

public class BankTransactionAnalysis implements IBankTransactionAnalysis {
	
	public void analyze(final String fileName, 
						final BankStatementCSVParser parser) throws IOException {

		final List<BankTransaction> transactions = parser.parseCSV(fileName);

		final BankTransactionAnalyzer analyzer = new BankTransactionAnalyzer(transactions);

		analysisToString(analyzer);
	}

	public void analysisToString(final BankTransactionAnalyzer analyzer) {

	}
}