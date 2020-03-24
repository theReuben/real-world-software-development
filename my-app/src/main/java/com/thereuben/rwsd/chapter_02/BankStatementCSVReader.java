package com.thereuben.rwsd.chapter_02;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class BankStatementCSVReader implements IBankStatementCSVReader {
	final static String RESOURCES = "src/main/resources/";

	public List<String> readCSV(String fileName) throws IOException {
		final Path path = Paths.get(RESOURCES + fileName);
		return Files.readAllLines(path);
	}
}