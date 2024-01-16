public class NestedFor
{
	public static void main(String[] args) 
	{
		//* * * * 
		//* * * *
		//* * * *
		for( int x = 1; x <= 3; x++)
		{
			for(int y = 1; y <= 4; y++)
			{
				System.out.print("*\t");
			}

			System.out.print("\n");
		}

		for( int x = 1; x <=5; x++)
		{
			for(int y = 0; y<x; y++)
			{
				System.out.print("*\t");
			}
			System.out.print("\n");
		}


		for( int x = 5; x >0; x--)
		{
			for(int y = 0; y<x; y++)
			{
				System.out.print("*\t");
			}
			System.out.print("\n");
		}



		for( int x = 1; x <4; x++)
		{
			for(int y = 0; y<=4; y++)
			{
				System.out.print( x +"\t");
			}
			System.out.print("\n");
		}


		for( int x = 9; x > 5; x--)
		{
			for(int y = 0; y<2; y++)
			{
				System.out.print( x +"\t");
			}
			System.out.print("\n");
		}




		

	}
}