package com.thereuben.rwsd.chapter_02;

import java.time.LocalDate;
import java.util.Objects;

public class BankTransaction implements IBankTransaction {
	private LocalDate date;
	private double amount;
	private String category;

	public BankTransaction(LocalDate date, double amount, String category) {
		this.date = date;
		this.amount = amount;
		this.category = category;
	}

	public LocalDate getDate() {
		return this.date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public double getAmount() {
		return this.amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	@Override
	public String toString() {
		return "BankTransaction{"
				+ "date : " + this.date 
				+ "amount : " + this.amount
				+ "category : " + this.category
				+ '}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		BankTransaction that = (BankTransaction) o;
		return Double.compare(that.amount, this.amount) == 0
			&& that.date.equals(this.date)
			&& that.category.equals(this.category);
	}

	@Override
	public int hashCode() {
		return Objects.hash(this.date, this.amount, this.category);
	}
}