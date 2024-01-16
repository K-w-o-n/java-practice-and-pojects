public class Staff 
{	int role;
	String type;
	int baseSalary;

	public Staff ( int role,String type,int baseSalary)
	{	

		this.role = role;

		this.type = type;

		this.baseSalary = baseSalary;


	}

	//wage foe project manager
	public int calculateWage()
	{
		return baseSalary;
	}
	//wage for web developer
	public int calculateWage(int extrahours, int hourlyrate)
	{
		return baseSalary + (extrahours * hourlyrate);
	}
	//wage for staff
	public int calculateWage(int extrahours , int hourlyrate, int bonus)
	{
		return baseSalary + (extrahours * hourlyrate) + bonus;
	}

	public static void main(String[] args) 
	{
		Staff staff1 = new Staff(1,"Manager" , 6000);
		Staff staff2 = new Staff(2,"SWD" , 3000);
		Staff staff3 = new Staff(3,"Staff" , 1000);

		Staff[] staff = {staff1,staff2,staff3};
		for(int x=0; x<staff.length; x++)
		{
			switch(staff[x].role)
			{
			case 1:
				System.out.println("Staff Type: " + staff[x].type);
				System.out.println("Salary: " + staff[x].calculateWage());
				break;
			case 2:
				System.out.println("Staff Type: " + staff[x].type);
				System.out.println("Salary: " + staff[x].calculateWage(10,200));
				break;
			case 3:
				
				System.out.println("Staff Type: " + staff[x].type);
				System.out.println("Salary: " + staff[x].calculateWage(10,100,500));
				break;
			}
		}

	}
}