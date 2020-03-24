package com.thereuben.rwsd.chapter_02;

import java.io.IOException;

public interface IBankTransactionAnalysis {

	public void analyze(String fileName, BankStatementCSVParser parser) throws IOException;

	public void analysisToString(BankTransactionAnalyzer analyzer);
}