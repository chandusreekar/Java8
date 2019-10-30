package com.sr.streams;

public class Account {
	
	private int accountId;
	private String accountHolderName;
	private int age;
	private String accountType;
	public Account() {
		super();
	}
	public Account(int accountId, String accountHolderName, int age, String accountType) {
		super();
		this.accountId = accountId;
		this.accountHolderName = accountHolderName;
		this.age = age;
		this.accountType = accountType;
	}
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", accountHolderName=" + accountHolderName + ", age=" + age
				+ ", accountType=" + accountType + "]";
	}
	

}
