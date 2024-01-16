class Bank
{
	private int balance = 500_000;

	public int getBalance()
	{
		return balance;
	}
}
public void setBalance(int balance)
{
	this.balance= balance;

}
public class EncapsulateDemo
{
	public static void main(String[] args) {
		Bank bank = new Bank();
		//get balance()
		System.out.println("Before update balance: " + bank.getBalance());
		//update balance
		bank.setBalance(-500_000);

		System.out.println("After update balance: " + bank.setBalance());
	}
}
