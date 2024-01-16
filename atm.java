import java.util.Scanner;

public class atm
{
	static Scanner scanner = new Scanner(System.in);
	static int action;
	static int balance;
	static int deposit;
	static int withdraw;
	static int previousTransaction;

	public static void main(String[] args)
	{ 
		for(int x=1; x<=3; x++)
		{
			System.out.println("enter your pin number: ");
			int pin = scanner.nextInt();

			if(pin == 123)
			{
				menu();
				break;
			}
			else 
			{
				if(x==3)
				
					System.out.println("Incorrectly pin number 3 times!");
				else 
					System.out.println("wrong pin number! Please try again.");

				
			}
		}
		
	}

	public static void menu()
	{
		do{
			System.out.println("===ATM===");
			System.out.println("1:Balance");
			System.out.println("2: Deposit");
			System.out.println("3: Withdraw ");
			System.out.println("4: Transaction");
			System.out.println("5: Exit");

			System.out.println("Choose Action: ");
			action = scanner.nextInt();

			line();

			switch(action)
			{
			case 1:balance();break;
			case 2:deposit();break;
			case 3:withdraw();break;
			case 4:transaction();break;
			case 5:exit();break;
			}
			line();
		}while(action!=5);

	
	}

		public static void exit()
		{
		System.out.println("Thanks you");
		}	

		public static void line()
		{
			for(int x=1; x<50;x++)
				System.out.print("=");

			System.out.println("\n");
		}
		public static void balance()
		{
			System.out.println("Balance: $" +balance);
		}
		public static void deposit()
		{
			System.out.println("enter amount to balance");
			int deposit = scanner.nextInt();
			balance+=deposit;
			previousTransaction = deposit;
		}
		public static void withdraw()
		{
			System.out.println("enter amount to withdraw");
			 
			int withdraw = scanner.nextInt();

			if(withdraw>balance)
			{
				System.out.println("Insufficient balance!");
			}
			else
			{
				balance-=withdraw;
				previousTransaction = -withdraw;
			}
			
		}

		public static void transaction()
		{
			if(previousTransaction>0)
				System.out.println("Deposited: +" + previousTransaction + "$");
			else if(previousTransaction<0)
				System.out.println("Withdraw: " + previousTransaction + "$");
			else 
				System.out.println("No transaction!");
		}


}
