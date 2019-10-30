package com.streams2;

import java.time.LocalDate;

public class Tablet {
	String name;
	LocalDate expiryDate;
	public Tablet(String name, LocalDate expiryDate) {
		super();
		this.name = name;
		this.expiryDate = expiryDate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(LocalDate expiryDate) {
		this.expiryDate = expiryDate;
	}
	@Override
	public String toString() {
		return "Tablet [name=" + name + ", expiryDate=" + expiryDate + "]";
	}
}
