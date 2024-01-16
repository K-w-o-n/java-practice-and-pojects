public class CheckUserName //string method startWith and endWidth
{
	public static void main(String[] args) {
		//John Doe 
		//John Smith 
		//Michael John
		//Jae Doe

		String[] users = {
			"John Doe",
			"John Smith",
			"Michael John",
			"Jane Doe"};
			
		

		int count = 0;

		for (int x = 0; x < users.length;  x++)
		{

			if(users[x].startsWith("John"))
			{
				System.out.println(users[x]);
				count++;
			}
		
		}
		
		System.out.println("Total Users:" +count);
	}
}