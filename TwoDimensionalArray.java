public class TwoDimensionalArray
{
	public static void main(String[] args)
	{
		char[][] letter1 = new char[2][3];
		letter1[0][0] = 'a';
		letter1[0][1] = 'b';
		letter1[0][2] = 'c';

		letter1[1][0] ='d';
		letter1[1][1] ='e';
		letter1[1][2] ='f';
		System.out.println("letter1[1][1]: " + letter1[1][1]);


		//        0           1
		//    0   1  2     0  1  2 
		char[][] letter2 = {{'a','b','c'},{'d','e','f'}};
		System.out.println(letter2.length);
		System.out.println(letter2[1].length);

		for(int x= 0; x < 2; x++)
		{
			for(int y=0; y < 3; y++){
				System.out.print(letter2[x][y] + "\t");
			}
			System.out.print("\n");
		}

		int [][] nums = {{5,10},{15},{20,25,30,35}};
		System.out.println("nums size: " + nums.length);
		System.out.println("nums[0]:" + nums[0].length);
		System.out.println("nums[1]: " + nums[1].length);
		System.out.println("nums[2]: " + nums[2].length);

		for( int x = 0; x< nums.length; x++){
			for(int y = 0; y< nums[x].length; y++)
			{
				System.out.print(nums[x][y] + "\t");
			}
			System.out.println("\n");
		}
	}
}