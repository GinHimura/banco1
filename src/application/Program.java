package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Account account1;
		
		System.out.print("Enter account number: ");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.print("Enter account holder: ");
		String holder = sc.nextLine();
		System.out.print("Is there na initial deposit (y/n)? ");
		char response = sc.next().charAt(0);
		
		if(response == 'y') {
			System.out.print("Enter initial deposit value: ");
			double deposit = sc.nextDouble();
			account1 = new Account(number, holder, deposit);
		} else {
		    account1 = new Account(number, holder);
		}
		
		System.out.println("\nAccount data:");
		System.out.println(account1);
		
		System.out.print("\nEnter a deposit value: ");
		double depositValue = sc.nextDouble();
		account1.deposit(depositValue);
		System.out.println("Update account data:");
		System.out.println(account1);
		
		System.out.print("\nEnter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		account1.withdraw(withdrawValue);
		System.out.println("Update account data:");
		System.out.println(account1);
		
		sc.close();		
	}

}
