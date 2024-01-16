public class StaticVariable {
	static String sum = "Sum: ";
	public static void main(String[] args){
		int a=10, b=20;
		int c = a+b;
		int d = 30, e = 35;
		int f = e+d;
		System.out.println(sum+ f);
		System.out.println(sum+ b);
	}
}