/**
 * 
 */
package com.que1;

import java.util.Scanner;
import java.util.regex.Pattern;

import com.que1.paymoney.PayMoneyProcess;

/**
 * @author bharat_2
 *
 */
public class PaymoneyApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PayMoneyProcess payMoneyProcess = new PayMoneyProcess();
		Scanner myScan = new Scanner(System.in); // Create a Scanner object
		System.out.println("Enter the size of transaction array");
		int noft = myScan.nextInt();
		Pattern olddel=myScan.delimiter();
		//myScan.useDelimiter(" ");
		payMoneyProcess.setNoOfTransactions(noft);	
		System.out.println("Enter the values of array");
		for(int i=0;i<noft;i++) {
			int j=myScan.nextInt();
			payMoneyProcess.setTransaction(i, j);
		}
		myScan.useDelimiter(olddel);
		
		System.out.println("Enter the total no of targets that needs to be achieved");
		int noftg=myScan.nextInt();
		for(int i=0;i<noftg;i++) {
			System.out.println("Enter the value of target");
			int j=myScan.nextInt();
			int index=payMoneyProcess.checkTarget(j);
			if(index < 0) {
				System.out.println("Given target is not achieved");
			}else {
				index++;
				System.out.println("Target achieved after " +  index + " Transactions");
			}
		}

	}

}
