public class Vehicle
{
	//state 

	String brand;
	int modelYear;

	//Condtructor
	public Vehicle(String b, int y)
	{
		 brand = b;
		 modelYear = y;

	}

	//method
	public void vehicleInfo()
	{
		System.out.println("Brand: " + brand);
		System.out.println("ModelYear: "+ modelYear);
		System.out.println("==============\n");
	}

	public static void main(String[] args) 
	{
		 Vehicle v1 = new Vehicle ("BMW", 2020);
		 Vehicle v2 = new Vehicle("Range Rover", 2012);

		 v1.vehicleInfo();
		 v2.vehicleInfo();
	}
}