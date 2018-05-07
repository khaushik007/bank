package com.accenture.dao.entities;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name= "ACCOUNTS")
public class Account {
	
	@Id
	private String accountNumber;
	
	@Column(name="BALANCE", precision=15, scale=2)
	private BigDecimal balance;
	
	@ManyToOne
	@JoinColumn(name="Account_Type",nullable=false)
	private AccountType accountType;
	
	@ManyToOne
	@JoinColumn(name="CustomerId")
	private Customer customer;

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public BigDecimal getBalance() {
		return balance;
	}

	public void setBalance(BigDecimal balance) {
		this.balance = balance;
	}

	public AccountType getAccountType() {
		return accountType;
	}

	public void setAccountType(AccountType accountType) {
		this.accountType = accountType;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	

}
