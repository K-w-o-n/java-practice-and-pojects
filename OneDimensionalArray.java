public class OneDimensionalArray
{
	public static void main(String[] args) 
	{
		//int    string  boolean
		//5      "john"    true
		//10     "doe"     false
        // 15     "alice"   

        int [] num = new int[3];

        num[0] =   5;
        num[1] =   10;
        num[2] =   15;

        for (int x=0; x<num.length; x++)// at assign condition no need equal sign 


        System.out.println("NUM[" + x + "]:"+ num[x]);
        System.out.println("Array Size :" + num.length );


        String [] name = new String[4];


        name[0] = "john doe";
        name[1] = "aung paing";
        name[2] = "yell khaing";
        name[3] = "Shun lae sandar nyunt";

        for (int x = 0; x < name.length; x++)
        
            System.out.println("name[" + x + "]:" + name[x]);
                System.out.println(name.length);
        



	}
}