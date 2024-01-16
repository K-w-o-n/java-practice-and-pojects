public class User 
{
	private String name;

	public User()
	{
		this("John Doe");

	}
	public User(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return this.name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public static void main(String[] args) {
		User user = new User();
		System.out.println("Get Name: " + user.getName());
	}
}