import java.util.Scanner;


public class ScannerDemo
{
	public static void main(String[] args)
	{
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your name: ");
		String name = scanner.nextLine();
		System.out.println("Hello, " +name);




		System.out.println("How old are you: ");
		int age = scanner.nextInt();
		System.out.println("I'm " +age);

		scanner.nextLine();

		System.out.println("Is male or Fmale: " );
		boolean value = scanner.nextBoolean();
		System.out.println("I'm " + value);

	

	}

}


//	

