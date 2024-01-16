public class Switch 
{
	public static void main(String[] args)
	{
		//1 - "monday"
		//2 - "tusday"
		//default - Wrong Day
		 int dayInt=5;
		 switch(dayInt)
		 {
		 case 1:
		 	System.out.println("Monday");
		 	break;
		 case 2:
		 	System.out.println("tuesday");
		 	break;
		 default:
		 	System.out.println("wrong day");
		 	System.out.println("switch statement");


		 	switch(dayInt)
		 	{
		 		case 1:
		 		case 2:
		 		case 3:
		 		case 4:
		 		case 5:System.out.println("Weekday"); break;

		 		case 6:
		 		case 7:System.out.println("Weekend"); break;
		 		default:System.out.println("Wrongday");


		 	}


		 }
	}

}