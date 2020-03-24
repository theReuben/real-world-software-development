package com.thereuben.rwsd.chapter_02;

import java.io.IOException;
import java.util.List;

public interface IBankStatementCSVReader {
	public List<String> readCSV(String fileName) throws IOException;
}