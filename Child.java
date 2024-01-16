class Parent
{
	int money = 500_000;

}
class Child extends Parent 
{
	int money =  5;

	public void money()
	{
		System.out.println("Child money: " + this.money);
		System.out.println("Parent money " + super.money);
	}

	public static void main(String[] args) {
		Child child = new Child();
		child.money();
	}
}