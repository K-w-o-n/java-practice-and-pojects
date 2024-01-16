public class StaticType
{
	static int staticVar = 20;
	public static void main(String[] args) {
		

		int local = 10;
		System.out.println("local Variable: " + local);
		System.out.println("Static Variable " + StaticType.staticVar);
		System.out.println("Same member(static)  "  + staticVar);


		StaticType.getHello();
		getHello();


	}
	public static void getHello()
	{
		System.out.println("hello, world" );
	}

}