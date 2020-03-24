package com.thereuben.rwsd.chapter_02;

import java.util.List;

public interface IBankStatementCSVParser {
	public BankTransaction parseCSVLine(String line);

	public List<BankTransaction> parseCSV(List<String> lines);
}