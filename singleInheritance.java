class Car
{
	String brand;
	int model;
}
class Telsa extends Car 
{
	int price;
}
public class singleInheritance
{
	public static void main(String[] args) 
	{
		//base/super/parent class
		Car car = new Car();

		car.brand = "toyota";
		car.model = 2022;
		System.out.println(car.brand);
		System.out.println(car.model);

		//child/ sub class

		Telsa telsa = new Telsa();
		telsa.brand = "Telsa";
		telsa.model = 2010;
		telsa.price = 100_000;
		System.out.println(telsa.brand);
		System.out.println(telsa.model);
		System.out.println(telsa.price);
		
	}
}