import java.util.Scanner;

public class hotelBooking
{
	static Scanner scanner = new Scanner(System.in);
	static int action;

	public static void main(String[] args) {
		
		System.out.println("Enter Your Name : ");
		String name= scanner.nextLine();
		choose();
		line();
		switch(action)
		{
		case 1:seaView();break;
		case 2:secondSeaView();break;
		case 3:gardenView();break;
		}

		line();


	}

	public static void choose()
	{

		System.out.println("Choose your room type(1,2,3,etc");
		System.out.println("1: Sea View - $120");
		System.out.println("2: Second Sea view - $80");
		System.out.println("3: Garden view - $40");
		
		System.out.println("choose action ");
		action = scanner.nextInt();
		
	}

	

	public static void line()
	{
		for(int x=1; x<50;x++)
			System.out.print("=");

		System.out.println("\n");
	}

	public static void seaView()
	{
		System.out.println("Customer Name \t RoomType \t Total Room \t Price");
		System.out.println("yellkhaing\t seaView \t 4 \t $480");
	}


	public static void secondSeaView()
	{
		System.out.println("Customer Name \t RoomType \t Total Room \t Price");
		System.out.println("yellkhaing\t secondSeaView \t 4 \t $320");
	}


	public static void gardenView()
	{
		System.out.println("Customer Name \t RoomType \t Total Room \t Price");
		System.out.println("yellkhaing\t gaardenView \t 4 \t $160");
	}
}