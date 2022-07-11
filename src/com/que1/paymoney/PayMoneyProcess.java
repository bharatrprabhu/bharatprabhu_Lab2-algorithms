/**
 * 
 */
package com.que1.paymoney;

/**
 * @author bharat_2
 *
 */
public class PayMoneyProcess {
	int NoOfTransactions;
	int[] Transactions;
	public int getNoOfTransactions() {
		return NoOfTransactions;
	}

	public void setNoOfTransactions(int noOfTransactions) {
		NoOfTransactions = noOfTransactions;
		Transactions=new int[NoOfTransactions ];
	}
	public void setTransaction(int txNumber, int txValue) {
		Transactions[txNumber]=txValue;
	}
	public int checkTarget(int targetV) {
		int retval=-1;
		int sum=0;
		for(int i=0;i<NoOfTransactions;i++) {
			sum+=Transactions[i];
			if(sum >=targetV) {
				retval=i;
				break;
			}
		}
		return retval;
	}

}
