public class Hello {


	public static void main(String[] args) {

		int a = Integer.valueOf(args[0]);
		int b = Integer.valueOf(args[1]);
		int c = a + b;
		
		System.out.println("Sum = " + c);
}
}