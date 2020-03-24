package com.thereuben.rwsd.chapter_02;

import java.io.IOException;
import java.util.List;

public interface IBankStatementCSVParser {
	public BankTransaction parseCSVLine(String line);

	public List<BankTransaction> parseCSV(String fileName) throws IOException;
}