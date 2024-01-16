public class MethodWithParameter
{
	public static void main(String[] args)
	{
		//printSquare();
		//calculateSquare(5);
		info("iphone 14 Pro max+++", 2);
		// parameter သည် variable 
		helloChit("Shun Lae Sandar Nyunt",25,"female");
		//countEqual(10);
		//countDollor();

	}
	// method with no parameter 
	public static void printSquare()
	{
		System.out.println("Square: " + (2*2));

	}
	// method with one  paramater 
	public static void calculateSquare(int length)
	{
		int result = length * length;
		System.out.println("Result:" + result);
	}
	public static void info(String  type, int price)
	{
	System.out.println("Phone Type: "+ type);
	System.out.println("Phone price: " + price);
	}
	public static void helloChit(String name,int age, String gender)
	{
		System.out.println("Name : " + name);
		System.out.println("Age : "+ age);
		System.out.println("gender :" + gender);

	}
	public static void countEqual(int Count)
	{
		for( int x=1; x < Count; x++)
		{
			for(int y = x; y< Count; y++)
			{
				System.out.print("=\t");
			}
			System.out.println("\n");
		}
	}


	public static void countDollor(int Count)
	{
		for( int x=1; x < Count; x++)
		{
			for(int y = x; y< Count; y++)
			{
				System.out.print("$\t");
			}
			System.out.println("\n");
		}
	} 
} 