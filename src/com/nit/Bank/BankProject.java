package com.nit.Bank;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BankProject {
public static void main(String[] args) 
{
	Scanner sc=new Scanner(System.in);
	Map<String, Account> map=new HashMap<>();
	boolean choise=true;
	while(choise) {
		System.out.println("==========Banking Project========");
		System.out.println("1:create the account");
		System.out.println("2: deposit");
		System.out.println("3: Withdraw.");
		System.out.println("4:Check Balance.");
		System.out.println("5: Exit");
		System.out.println("Enter you choise...");
		int chus=sc.nextInt();
		
		switch(chus) {
		case 1:
			System.out.println("Enter the hoslderName");
      String name=sc.nextLine();
      sc.nextLine();
      System.out.println("Enter the accountnumber:");
      String accountNo=sc.nextLine();
      System.out.println("Enter the deposit amount");
      double amount=sc.nextDouble();
      if(map.containsKey(accountNo)) {
    	  System.out.println("Account with this number already exists.");
      }
      else {
    	  Account account=new Account(name,accountNo,amount);
    	  map.put(accountNo, account);
    		  System.out.println("Acount create succesfully...");
    	  }
    	 break;
		case 2:
			System.out.println("Enter the acount number");
			accountNo=sc.next();
			Account accountDeposit=map.get(accountNo);
			
			if(accountDeposit!=null) {
				System.out.println("Enter deposit amount:");
				double depositAmount=sc.nextDouble();
				sc.nextLine();
				accountDeposit.deposit(depositAmount);
			
             } else {
                 System.out.println("Account not found.");
             }
             break;
		case 3:
			System.out.println("Enter the acount number");
			accountNo=sc.next();
		
			Account accountwith=map.get(accountNo);
			
			if(accountwith!=null) {
				System.out.println("Enter withdraw amount:");
				double withAmount=sc.nextDouble();
				sc.nextLine();
				accountwith.withdraw(withAmount);
			
             } else {
                 System.out.println("Account not found.");
             }
             break;
		case 4:
			System.out.println("Enter the account number:");
			accountNo=sc.next();
			Account accounrcheck=map.get(accountNo);
			if(accounrcheck!=null) {
				System.out.println("Account Holder:"+accounrcheck.getHolderName());
				System.out.println("Balnce check:"+accounrcheck.getBalance());
			}
			else {
				System.out.println("Not found...");
			}
			break;
		case 5:
			choise=true;
			
			System.out.println("Thank you for using the BankApplication");
			break;
			default:
				 System.out.println("Invalid choice. Please try again.");
				
			}

			
      }
	sc.close();
		}
	
	}
	
	


