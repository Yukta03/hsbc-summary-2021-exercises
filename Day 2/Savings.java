package com.hsbc.beans;

public class Savings extends Accounts{
	private long dailyLimit;
	
	public Savings(int accountno,long balance,String ifsc,long dailyLimit) {
		super(accountno, balance,ifsc);
		this.dailyLimit = dailyLimit;
		
	}
	
	public long getdailyLimit() {
		return dailyLimit;
	}
	public void setdailyLimit(long dailyLimit) {
		this.dailyLimit = dailyLimit;
	}
	
    public String display() 
    {
		String details = super.display() +"dailyLimit: "+ dailyLimit;
		return details;
	}
}