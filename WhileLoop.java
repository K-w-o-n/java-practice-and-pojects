public class WhileLoop
{
	public static void main(String[] args) 
	{
		System.out.println("While Loop");
		int x=2;
		while(x>=20)
		{
			System.out.println(x);
			x--;
		}
		System.out.println("Do while loop");

		int y = 2;
		do{
			System.out.println(y);
			y--;
		} while(y>=20);
	}
}