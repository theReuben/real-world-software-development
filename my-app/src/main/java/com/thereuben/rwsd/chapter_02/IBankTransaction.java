package com.thereuben.rwsd.chapter_02;

import java.time.LocalDate;

public interface IBankTransaction {

	public LocalDate getDate();

	public void setDate(LocalDate date);

	public double getAmount();

	public void setAmount(double amount);

	public String getCategory();

	public void setCategory(String category);

	public String toString();

	public boolean equals(Object o);

	public int hashCode();
}