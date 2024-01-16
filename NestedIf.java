public class NestedIf
{
	public static void main(String[] args)
	 {
		int grade =2;
		int attendClass = 2;

		if(grade == 1) 
		{
			if(attendClass == 1)
				System.out.println("HTML");
			else if (attendClass == 2)
				System.out.println("HTML,CSS");
			else 
				System.out.println("HTML,CSS,Javascript");


		}
		else if(grade ==2)
		{

			if(attendClass == 1)
				System.out.println("Python");
			else if (attendClass == 2)
				System.out.println("PHP");
			else 
				System.out.println("Java");
		}
		else
		{
			System.out.println("Wrong grade");
		}
	 }
}