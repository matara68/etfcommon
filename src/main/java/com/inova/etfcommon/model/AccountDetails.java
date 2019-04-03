package com.inova.etfcommon.model;

import java.util.Date;

public class AccountDetails {

	private int accountNumber;
	private boolean active;
	private Date createdDate;
	private boolean interestEligible;
	private double capital;
	private double interestRate;
	private double interest;
	private int totalNumberOfLatePayments;
	private int numberOfConsecutiveLatePayments;
	
	public int getAccountNumber() {
		return accountNumber;
	}
	
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
	public boolean isActive() {
		return active;
	}
	
	public void setActive(boolean active) {
		this.active = active;
	}
	
	public Date getCreatedDate() {
		return createdDate;
	}
	
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	
	public boolean isInterestEligible() {
		return interestEligible;
	}
	
	public void setInterestEligible(boolean interestEligible) {
		this.interestEligible = interestEligible;
	}
	
	public double getCapital() {
		return capital;
	}
	
	public void setCapital(double capital) {
		this.capital = capital;
	}
	
	public double getInterestRate() {
		return interestRate;
	}
	
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	
	public double getInterest() {
		return interest;
	}
	
	public void setInterest(double interest) {
		this.interest = interest;
	}
	
	public int getTotalNumberOfLatePayments() {
		return totalNumberOfLatePayments;
	}
	
	public void setTotalNumberOfLatePayments(int totalNumberOfLatePayments) {
		this.totalNumberOfLatePayments = totalNumberOfLatePayments;
	}
	
	public int getNumberOfConsecutiveLatePayments() {
		return numberOfConsecutiveLatePayments;
	}
	
	public void setNumberOfConsecutiveLatePayments(int numberOfConsecutiveLatePayments) {
		this.numberOfConsecutiveLatePayments = numberOfConsecutiveLatePayments;
	}
	
}
