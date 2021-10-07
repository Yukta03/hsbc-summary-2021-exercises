package com.hsbc.beans;

import java.time.LocalDate;

import com.hsbc.beans.Savings;
import com.hsbc.beans.Current;
import com.hsbc.beans.Accounts;

public class Test {
	public static void main(String[] args) {
		Savings saving = new Savings(16735,100000,"IC4638",50000);
		Current current = new Current(75694,200000,"SB0942","Layla");
		
		System.out.println("Savings Account Details: " + saving.display());
		System.out.println("Current Account Details: " + current.display());


}
}
