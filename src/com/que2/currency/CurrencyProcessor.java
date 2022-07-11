package com.que2.currency;

import java.util.Arrays;
import java.util.Collections;

public class CurrencyProcessor {
	int NoOfCurrencies;
	Integer[] Currencies;
	/**
	 * @return the noOfCurrencies
	 */
	public int getNoOfCurrencies() {
		return NoOfCurrencies;
	}
	/**
	 * @param noOfCurrencies the noOfCurrencies to set
	 */
	public void setNoOfCurrencies(int noOfCurrencies) {
		NoOfCurrencies = noOfCurrencies;
		Currencies=new Integer[NoOfCurrencies];
	}
	public void setCurrency(int index, int value) {
		Currencies[index]=Integer.valueOf(value);
		if((index+1)==NoOfCurrencies) {
			Arrays.sort(Currencies, Collections.reverseOrder());   
		}
	}
	public void processAmt(int AmtToPay) {
		int a2p=AmtToPay;
		int cVal;
		int nos;
		System.out.println("Your payment approach in order to give min no of notes will be");
		for(int i=0;i<NoOfCurrencies;i++) {
			cVal=Currencies[i].intValue();
			nos=a2p/cVal;
			if(i==(NoOfCurrencies-1)) {
				if( (a2p % cVal)>0) {
					nos++;
				}
			}
			if(nos > 0) {
				System.out.println(cVal + " : " + nos);
				a2p=a2p-nos * cVal;
			}
		}
		
	}
}
