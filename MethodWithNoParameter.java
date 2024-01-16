public class MethodWithNoParameter
{
	public static  void main(String[] args)
	{
		//MethodWithNoParameter.printHello();
		//printHello();

		//String msg = getHello();   //"hello World"
		//System.out.println(msg);

		char vowel = hayHi();
		System.out.println(vowel);

		//getHello(char vowel); // "hello World"
		//System.out.println(getHello());
		//System.out.println(getNum());

		//hayHi();
		//System.out.println(hayHi());

		//System.out.println( Char vowel);
		String name = getString();


		System.out.println( name);

		boolean result = loveYou();
		System.out.println(loveYou());

		String name3 =sayHi();
		System.out.println(sayHi());

	}
	public static void printHello()
	{
		System.out.println("Hello");

	}
	public static String getHello()
	{
		String message = "hello world!";

		return message;
	}
	public static int getNum()
	{
		return 20;
	}
	public static char hayHi()
	{
		
		char vowel = 'a';


		return vowel;
	}

	public static String getString()
	{

		String name = "Shun Lae Sandar Nyunt";

		return name;
	}

	public static boolean loveYou()
	{

		boolean result = true;


		return result;
	}
	public static String sayHi()
	{
		String name3 = "i love you";

		return name3;
	}
}
