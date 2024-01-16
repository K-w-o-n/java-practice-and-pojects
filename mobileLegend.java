public class mobileLegend
{
	String heroName;
	String heroRole;
	String gender = "male";

	public void heroInfo()
	{
		System.out.println("hero Name : "+ heroName);
		System.out.println("heroRole :" + heroRole);
		System.out.println("hero Gender :" + gender);
	}

	public static void main(String[] args) {
		mobileLegend hero1 = new mobileLegend();

		hero1.heroName = "nana";
		hero1.heroRole = "support";
		hero1.gender = "female";

		hero1.heroInfo();

		mobileLegend hero2 = new mobileLegend();
		hero2.heroName = "clint";
		hero2.heroRole = "fighter";
		//hero2.gender = ""

		hero2.heroInfo();
		mobileLegend hero3 = new mobileLegend();

		hero3.heroName = "layla";
		hero3.heroRole = "maskman";
		hero3.gender = "feamale";

		hero3.heroInfo();

	}
	
}