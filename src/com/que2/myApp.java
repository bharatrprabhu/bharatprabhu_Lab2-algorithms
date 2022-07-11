package com.que2;

import java.util.Scanner;

import com.que2.currency.CurrencyProcessor;

public class myApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CurrencyProcessor currencyProcessor = new CurrencyProcessor();
		Scanner myScan = new Scanner(System.in); // Create a Scanner object
		System.out.println("Enter the size of currency denominations");
		int noft = myScan.nextInt();
		//Pattern olddel=myScan.delimiter();
		//myScan.useDelimiter(" ");
		currencyProcessor.setNoOfCurrencies(noft);	
		System.out.println("Enter the currency denominations value");
		for(int i=0;i<noft;i++) {
			int j=myScan.nextInt();
			currencyProcessor.setCurrency(i,j);
		}
		//myScan.useDelimiter(olddel);
		
		System.out.println("Enter the amount you want to pay");
		int AmtToPay=myScan.nextInt();
		currencyProcessor.processAmt(AmtToPay);
	}

}
