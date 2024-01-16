class bahoBank
{
	public void interestRate()
	{
		System.out.println("1%");
	}
}
class aBank extends bahoBank
{
	public void interestRate()
	{
		System.out.println("3%");
	}
}

public static void main(String[] args) {
		bahoBank bank = new banks();

		bank.interestRate();

		bahoBank aBank = new aBank();
		aBank.interestRate();



	}