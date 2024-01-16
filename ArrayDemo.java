public class ArrayDemo
{
	public static void main(String[] args) {
		//index 0 1 2 3 4 
		// valume 'a', 'e', 'i' , ' o', 'u'
		char [] vowels = {'a','e','i', 'o', 'u'};
		System.out.println("vowels[3]: " + vowels[3]);
		System.out.println("vowels's size: "+ vowels.length);
		int [] numbers = {1,2,3,4,5,6,7,8,9,0};

		System.out.println("Odd Numbers :" + numbers[0]);
		System.out.println("numbers size " + numbers.length);


		String [] names = {"apple", "orange", "milk", "backpag", "chickenEgg"};

		System.out.println("fruits : " +names[0]);
		System.out.println("nameSize: " + names.length);
	}
}